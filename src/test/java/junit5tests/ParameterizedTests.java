package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;

public class ParameterizedTests {

    @ParameterizedTest(name="Run : {index} - value:{arguments}")
    @EmptySource
    @ValueSource(strings = { "Java Test", "Junit test"})
    void lengthOfString(String name){
        System.out.println("The length of String parameter is " + name.length());
    }

    @ParameterizedTest
    @CsvSource(value = {"junit, test", "java, spring", "spring batch, spring boot"})
    void csvSource_String_String(String output1, String output2){
        System.out.println("Output 1 = " + output1 + " , Output 2 = " + output2);
    }

    @ParameterizedTest
    @CsvSource(value = {"junit, 32, true", "java, 15, false", "spring batch, 10, true"})
    void csvSource_String_Int_Boolean(String output1, int output2, boolean output3){
        System.out.println("Output 1 = " + output1 + " , Output 2 = " + output2+ " , Output 3 = " + output3);
    }

    @ParameterizedTest
    @CsvSource(value = {"junit?test", "java?spring", "spring batch?spring boot"}, delimiter = '?')
    void csvSource_String_String_WithDelimiter(String output1, String output2){
        System.out.println("Output 1 = " + output1 + " , Output 2 = " + output2);
    }
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/params/shoppinglist.csv", numLinesToSkip = 1)
    void csvSource_String_String_FromFile(String name, double price, int quantity, String uom, String provider){
        System.out.println("name = " + name + " , price = " + price + " , quantity = " + quantity
                + " , uom = " + uom + " , provider = " + provider);
    }

    @ParameterizedTest
    @MethodSource(value="generateListOfString")
    void method_source_string(String input1){
        System.out.println("Input 1 "+input1);
    }

    static List<String> generateListOfString(){
        return Arrays.asList("tomato","carrot","cabbage");
    }
}
