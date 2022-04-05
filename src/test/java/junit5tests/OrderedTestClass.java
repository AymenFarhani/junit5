package junit5tests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderedTestClass {

    @BeforeAll
    public void beforeAllTests(){
        System.out.println("Before all the tests");
    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("Before each test");
    }

    @Test
    @DisplayName("First method test")
    public void firstTest(){
        System.out.println("hello from first method");
    }

    @Test
    @DisplayName("Second method test")
    @Order(1)
    public void secondTest(){
        System.out.println("hello from second method");
    }

    @AfterAll
    public void afterAllTests(){
        System.out.println("After all the tests");
    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("After each test");
    }
}

