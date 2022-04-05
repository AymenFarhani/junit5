package junit5tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Tagged class for test")
public class TaggedTestClass {




    @Test
    @DisplayName("First method test")
    @Tag(value = "acceptance")
    public void firstTest(){
        System.out.println("hello from first method");
    }

    @Test
    @DisplayName("Second method test")
    public void secondTest(){
        System.out.println("hello from second method");
    }

    @Test
    @DisplayName("Third method test")
    public void thirdTest(){
        System.out.println("hello from third method");
    }

    @ParameterizedTest(name="Run: {index} - value: {arguments}")
    @ValueSource(ints={1,5,6})
    void intValues(int param){
        assumeTrue(param> 4);
        System.out.println("The param value is = " + param);
    }


}
