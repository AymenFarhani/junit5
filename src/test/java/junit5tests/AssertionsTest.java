package junit5tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsTest {

    @Test
    void assertEqualsTest(){
        assertEquals("firstString", "firstString");
    }

    @Test
    void assertEqualsListTest(){
        List<String> expectedValues = Arrays.asList("First", "Second", "Third");
        List<String> actualValues = Arrays.asList("First", "Second", "Third");
        assertEquals(expectedValues, actualValues);
    }

    @Test
    void assertEqualsArraysTest(){
        int[] expectedValues = {1,2,3};
        int[] actualValues = {1,2,3};
        assertArrayEquals(expectedValues, actualValues);
    }
}
