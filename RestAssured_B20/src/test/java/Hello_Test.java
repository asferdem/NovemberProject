import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Hello_Test {
    @BeforeAll
    public static void setUp(){

        System.out.println("@BeforeAll is running ");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("@AfterAll is Running");
    }

    @BeforeEach
    public void setupTest(){
        System.out.println("Before each running ");
    }

    @AfterEach
    public void tearDownTest(){
        System.out.println("After each running ");
    }

    @Test
    public  void test(){
        System.out.println("Test is running ");
        Assertions.assertEquals(4,3+1);
    }

    @Test
    public  void test2(){
        System.out.println("Test2 is running ");
        assertEquals(12,4*3);
    }











}
