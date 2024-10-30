package Junit;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS", "Azure", "GCP");

    @Test
    void test(){
        boolean test = todos.contains("AWS");

        assertTrue(test);

        // assertFalse, assertNull, assertNotNull, assertArraysEquals

    }
}
