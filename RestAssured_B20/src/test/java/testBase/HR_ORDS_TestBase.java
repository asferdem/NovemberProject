package testBase;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utility.ConfigurationReader;
import utility.DB_Utility;

import static io.restassured.RestAssured.*;

public abstract class HR_ORDS_TestBase {

    @BeforeAll
    public static void setUp(){
        baseURI = ConfigurationReader.getProperty("ords.baseURL");
        basePath = ConfigurationReader.getProperty("ords.basePath");

        DB_Utility.createConnection( ConfigurationReader.getProperty("hr.database.url"),
                                     ConfigurationReader.getProperty("hr.database.username") ,
                                     ConfigurationReader.getProperty("hr.database.password")
                                    );
    }
    @AfterAll
    public static void tearDown(){
        reset();
        DB_Utility.destroy();
    }
}