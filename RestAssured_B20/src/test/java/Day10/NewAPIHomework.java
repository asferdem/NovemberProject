package Day10;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.ArticlePOJO;
import pojo.Country;
import testBase.HR_ORDS_TestBase;
import utility.DB_Utility;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class NewAPIHomework {
//http://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY
@DisplayName("Get All Articles author if source id is not null")
@Test
public void testGetAllArticleAuthor(){
    JsonPath jp =
            given()
                    .log().uri()
                    .baseUri("http://newsapi.org")
                    .basePath("/v2")
                    .queryParam("apiKey","d39d53da33db434791d77f7b58658007")
                    .queryParam("country","us").
                    when()
                    .get("/top-headlines")
                    .jsonPath();

    List<String> allAuthorsNoFilter =
            jp.getList("articles.author"  ) ;
    System.out.println("allAuthorsNoFilter = " + allAuthorsNoFilter);
    List<String> allAuthors =
            jp.getList("articles.findAll{ it.source.id != null }.author"  ) ;
    System.out.println("allAuthors = " + allAuthors);
// additional requirement -- remove any author with null value
    List<String> allAuthorsWithNoNull =
            jp.getList("articles.findAll{ it.source.id != null && it.author!=null }.author"  ) ;
    System.out.println("allAuthorsWithNoNull = " + allAuthorsWithNoNull);

    List<ArticlePOJO> allArticles
            = jp.getList("articles.findAll{ it.source.id != null && it.author!=null }",ArticlePOJO.class) ;

    allArticles.forEach(System.out::println);
}
}