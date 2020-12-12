package Day04;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
public class LibraryAppTest {
//Librarian1  email 	librarian69@library
//Librarian1  password		KNPXrm3S
        @BeforeAll
        public static void setUp(){
            baseURI = "http://library1.cybertekschool.com";
            basePath = "/rest/v1" ;
        }
        @AfterAll
        public static void tearDown(){
            reset();
        }

    @DisplayName("Testing POST /login Endpoint")
    @Test
    public void testLogin(){
            given()
                    .log().all()
                    .contentType(ContentType.URLENC)
                    .formParam("email","librarian69@library")
                    .formParam("password","KNPXrm3S").
            when()
                    .post("/login").

            then()
                    .log().all()
                    .statusCode(200)
                    .contentType(ContentType.JSON)
                    .body("token",is(not(emptyString())))
                    ;


    }






}
