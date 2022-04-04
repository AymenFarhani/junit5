package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {

    @ParameterizedTest(name="Run : {index} - value:{arguments}")
    @EmptySource
    @ValueSource(strings = { "Java Test", "Junit test"})
    void lengthOfString(String name){
        System.out.println("The length of String parameter is " + name.length());
    }
}
