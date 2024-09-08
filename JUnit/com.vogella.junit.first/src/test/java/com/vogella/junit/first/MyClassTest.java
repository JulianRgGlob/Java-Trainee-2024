package com.vogella.junit.first;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.channels.MulticastChannel;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    private MyClass tester;
    @BeforeEach
    void setup() {
        tester = new MyClass();
    }

    @Test
    void testExceptionIsThrown() {
        MyClass tester = new MyClass();
        assertThrows(IllegalArgumentException.class, () ->
                tester.multiply(1000,5));
    }

    @Test
    void multiply() {
        MyClass tester = new MyClass();
        assertEquals(50, tester.multiply(10,5), "10 x 5 " +
                "must be 50");
    }

}