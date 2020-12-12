package Day04;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.List;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
public class OpenMovieDB {

    /*
    Here is your key: c3938677
OMDb API: http://www.omdbapi.com/?t=The Orville&apikey=c3938677
     */

    @BeforeAll
    public static void setUp(){
        baseURI="http://www.omdbapi.com";
    }
    @AfterAll
    public static void tearDown(){
        reset();
    }
    @DisplayName("Test Movie")
    @Test
    public void testMovie(){

        given()
                .queryParam("apiKey","c3938677")
                .queryParam("t","The Orville").
        when()
                .get().prettyPeek().
        then()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
                .body("Title",is("The Orville"))
                .body("Ratings[0].Source",is("Internet Movie Database"));

    }


    @DisplayName("Getting the log of request and response")
    @Test
    public void testSendingRequestAndGetTheLog(){

        given()
                .queryParam("apiKey","5b5d0fe8" )
                .queryParam("t","John Wick")
                // logging the request should be in given section
                 .log().all().
                //  .log().uri().
                 //.log().params().
                when()
                .get().
                then()
                // logging the response should be in then section
                //.log().all()
                .log().status()
                .statusCode(  is(200)  )
                .body("Plot", containsString("ex-hit-man") )
                // second Ratings source is Rotten Tomato
                .body("Ratings[1].Source",is("Rotten Tomatoes") )

        ;
    }



}
