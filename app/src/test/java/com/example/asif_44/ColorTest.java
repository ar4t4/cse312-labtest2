package com.example.asif_44;

import static org.junit.Assert.*;

import org.junit.Test;


public class  ColorTest {

    @Test
    public void redColorTest() {
        Red red = new Red();
        assertEquals("Red", red.getName());
    }

    @Test
    public void blueColorTest() {
        Blue blue = new Blue();
        assertEquals("Blue", blue.getName());
    }

    @Test
    public void greenColorTest() {
        Green green = new Green();
        assertEquals("Green", green.getName());
    }
}
