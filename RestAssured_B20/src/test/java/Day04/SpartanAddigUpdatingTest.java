package Day04;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;

public class SpartanAddigUpdatingTest {
    @BeforeAll
    public static void setUp(){
        baseURI = "http://54.90.101.103:8000";
        basePath = "/api" ;
    }

    @AfterAll
    public static void tearDown(){
        reset();
    }

    @Test
    public void testGetAllSpartan(){

        given()
                .log().all()
                .auth().basic("admin","admin").
        when()
                .get("/spartans")
                .
        then()
                .log().all()
                .statusCode(is(200));

    }
    @DisplayName("Add 1 Data with Raw Json String POST /api/spartans")
    @Test
    public void testAddOneData(){
        String newSpartanStr =  "    {\n" +
                "        \"name\": \"badan\",\n" +
                "        \"gender\": \"Male\",\n" +
                "        \"phone\": 9876543210\n" +
                "    }";
        given()
                .log().all()
                .auth().basic("admin","admin")
                .contentType(ContentType.JSON)
                .body(newSpartanStr).
        when()
                .post("/spartans").

        then()
                .log().all()
                .statusCode(is(201))
                .contentType(ContentType.JSON)
                .body("success",is("A Spartan is Born!"))
                .body("data.name",is("badan"))

        ;
    }
    @DisplayName("Add 1 Data with Raw Json String POST /api/spartans")
    @Test
    public void testAddOneDataMap() {
        Map<String, Object> payloadMap = new LinkedHashMap<>();
        payloadMap.put("name" ,   "Tucky");
        payloadMap.put("gender" , "Male");
        payloadMap.put("phone" ,  9876543210L);
        System.out.println("payloadMap = " + payloadMap);
        given()
                .log().all()
                .auth().basic("admin","admin")
                .contentType(ContentType.JSON)
                .body(payloadMap).
                when()
                .post("/spartans").

                then()
                .log().all()
                .statusCode(is(201))
                .contentType(ContentType.JSON)
                .body("success",is("A Spartan is Born!"))
                .body("data.name",is("Tucky"));

    }


}
