package junit5tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DisabledEnabledTest {

    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled for demo of "+"@DisabledOnOs")
    void firstTest(){
        System.out.println("This is first test method");
    }

    @Test
    @Disabled(value="Disabled for demo of @Disabled")
    void secondTest(){
        System.out.println("This is second test method");
    }

    @Test
    @DisabledIf(value = "providerMethod", disabledReason = "Disabled for Demo of @DisabledIf")
    void thirdTest(){
        System.out.println("This is third test method");
    }

    @Test
    void fourthTest(){
        System.out.println("This is fourth test method");
    }

    boolean providerMethod() {
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.TUESDAY);
    }
}
