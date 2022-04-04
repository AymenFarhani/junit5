package junit5tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("First class for test")
public class FirstTest {

    @Test
    @DisplayName("First method test")
    public void firstTest(){
        System.out.println("hello from first method");
    }

    @Test
    @DisplayName("Second method test")
    public void secondTest(){
        System.out.println("hello from second method");
    }
}
