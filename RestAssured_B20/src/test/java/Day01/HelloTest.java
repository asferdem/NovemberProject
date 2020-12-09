package Day01;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Day 1 Hello Test")
public class HelloTest {
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
    @DisplayName("Test 1 + 3 = 4")
    @Test
    public  void test(){
        System.out.println("Test is running ");
        Assertions.assertEquals(4,3+1);
    }
    @Disabled
    @DisplayName("Test 3*4=12 ")
    @Test
    public  void test2(){
        System.out.println("Test2 is running ");
        assertEquals(12,4*3);
    }











}
