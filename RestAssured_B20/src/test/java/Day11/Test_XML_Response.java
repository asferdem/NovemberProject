package Day11;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testBase.SpartanAdminTestBase;

public class Test_XML_Response extends SpartanAdminTestBase {
    // get xml response for GET /spartans
    @DisplayName("GET /spartans get xml response")
    @Test
    public void testXML() {

        XmlPath xp=
        given()
                .spec(adminReqSpec)
                .accept(ContentType.XML).
        when()
                .get("/spartans").
        then()
                .log().all()
                .statusCode(200)
                .body("List.item[0].name",is("Akbar"))
                .body("List.item[0].id",is("602"))
                .contentType(ContentType.XML)
                .extract()
                .xmlPath()
        ;
        String firstName=xp.get("List.item[0].name");
        System.out.println("firstName = " + firstName);

        System.out.println("xp.get(\"List.item[0].id\") = " + xp.get("List.item[2].id"));

        System.out.println("xp.getLong(\"List.item[-1].phone\") = " + xp.getLong("List.item[-1].phone"));
    }


}
