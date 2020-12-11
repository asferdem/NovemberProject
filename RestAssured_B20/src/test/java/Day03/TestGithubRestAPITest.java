package Day03;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;
public class TestGithubRestAPITest {

//https://api.github.com/users/asferdem
    @DisplayName("Test Github Get 1 user ")
    @Test
    public void testGithub(){
        given()
                .pathParam("username", "CybertekSchool").
        when()
                .get("https://api.github.com/users/{username}").
        then()
                .assertThat()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
                .header("server","GitHub.com")
                .body("login",is("CybertekSchool"))


        ;



    }



}
