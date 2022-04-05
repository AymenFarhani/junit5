package junit5tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class MiscTest {

    @Test
    @Timeout(5)
    void timeOutTest() throws InterruptedException {
        System.out.println("This is the test with the timeout");
        Thread.sleep(6000);
    }
}
