package junit5tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTests {

    @RepeatedTest(value = 5)
    void firstRepeatedMethod(){
        System.out.println("We are repeating this test");
    }

    @RepeatedTest(value = 3, name = "Running repetition: {currentRepetition}. Total is:{totalRepetitions}")
    @DisplayName(value = "This is a repeated test method")
    void secondRepeatedMethod(){
        System.out.println("We are repeating this test");
    }

    @RepeatedTest(value = 3)
    void thirdRepeatedMethod(RepetitionInfo repetitionInfo){
        System.out.println("This code will run at each repetition");
        Assumptions.assumingThat(repetitionInfo.getCurrentRepetition() == 1,
                () -> System.out.println("This code only runs for repetition 1"));
    }
}
