package junit5tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsTest {

    @ParameterizedTest(name="Run: {index} - value: {arguments}")
    @ValueSource(ints={1,5,6})
    void intValues(int param){
        assumeTrue(param> 4);
        System.out.println("The param value is = " + param);
    }

    @ParameterizedTest
    @CsvSource(value = {"junit, test", "java, spring", "spring batch, spring boot"})
    void csvSource_String_String(String output1, String output2){
        assumeFalse(output1.equals("java"), "The assumption failed for the following param " + output2);
        System.out.println("Output 1 = " + output1 + " , Output 2 = " + output2);
    }

    @ParameterizedTest
    @CsvSource(value = {"junit, 32, true", "java, 15, false", "spring batch, 10, true"})
    void csvSource_String_Int_Boolean(String output1, int output2, boolean output3){
        assumingThat(output2>20, () -> System.out.println("This code run"));
        System.out.println("Output 1 = " + output1 + " , Output 2 = " + output2+ " , Output 3 = " + output3);
    }
}
