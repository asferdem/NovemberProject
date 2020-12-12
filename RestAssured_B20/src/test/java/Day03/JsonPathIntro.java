package Day03;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.List;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
public class JsonPathIntro {
    @BeforeAll
    public static void setUp(){
        baseURI = "http://100.26.101.158:8000";
        basePath = "/api" ;
    }
    @AfterAll
    public static void tearDown(){
        reset();
    }

    @DisplayName("Extracting data out of spartan Json Object")
    @Test
    public void test1SpartanPayLoad(){
        //send a request to get 1 spartan
// by providing path params with valid id
// save it into Response object
// NEW : create an object with type JsonPath
// by calling the method jsonPath() on response object
// extract id , name , gender , phone
// and save it into variable of correct type

        Response response=given()
                        .pathParam("id","100").

                     when()
                        .get("/spartans/{id}")
                        .prettyPeek()
                                    ;

        //response.prettyPrint();

        JsonPath jp=response.jsonPath();
        int myId=jp.getInt("id");
        String myName=jp.getString("name");
        String myGender=jp.getString("gender");
        long mpPhone=jp.getLong("phone");

        System.out.println("MyId = " + myId);
        System.out.println("MyName = " + myName);
        System.out.println("MyGender = " + myGender);
        System.out.println("mpPhone = " + mpPhone);

    }

    @Test
    public void getAllSpartanExtractData(){

        //Response response=get("/spartans");
       // JsonPath jp=response.jsonPath();
        JsonPath jp=get("/spartans").jsonPath();

        String firstName=jp.getString("name[0]");
        System.out.println("firstName = " + firstName);

        System.out.println("jp.getLong(\"phone[0]\") = " + jp.getLong("phone[0]"));

        System.out.println("jp.getString(\"gender[6]\") = " + jp.getString("gender[6]"));

        List<String> allName=jp.getList("name");
        System.out.println("allName = " + allName);

        List<Long> allPhone=jp.getList("phone");
        System.out.println("allPhone = " + allPhone);

    }
    //http://100.26.101.158:8000/api/spartans/search?nameContains=de&gender=Male

    @Test
    public void testSearchExtract(){

       JsonPath jp= given()
                        .queryParam("nameContains","de")
                        .queryParam("gender","Male").
                 when()
                        .get("/spartans/search")
                        .jsonPath();
        System.out.println("first guy name " +
                jp.getString("content[0].name")           );

        System.out.println("Third guy phone  " +
                jp.getLong("content[2].phone")           );

        System.out.println("all Name  " +
                jp.getList("content.name")           );
        System.out.println("all Phone  " +
                jp.getList("content.phone")           );

        System.out.println("value of field empty " + jp.getBoolean("pageable.sort.empty"));


    }

}
