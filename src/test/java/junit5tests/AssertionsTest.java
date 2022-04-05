package junit5tests;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
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

    @Test
    void assertForMapTest() {
        Map<String, Integer> mapData = new HashMap<>();
        mapData.put("First data", 1);
        mapData.put("Second String",2);
        mapData.put("Third String",3);
        assertThat(mapData, Matchers.hasValue(2));
        assertThat(mapData, Matchers.hasKey("Second String"));
    }
}
