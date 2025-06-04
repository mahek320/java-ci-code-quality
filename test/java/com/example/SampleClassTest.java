package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleClassTest {

    @Test
    public void testGreetWithName() {
        SampleClass sample = new SampleClass();
        assertEquals("Hello, Alice", sample.greet("Alice"));
    }

    @Test
    public void testGreetWithNull() {
        SampleClass sample = new SampleClass();
        assertEquals("Hello, World!", sample.greet(null));
    }

    @Test
    public void testGreetWithEmptyString() {
        SampleClass sample = new SampleClass();
        assertEquals("Hello, World!", sample.greet(""));
    }
}


