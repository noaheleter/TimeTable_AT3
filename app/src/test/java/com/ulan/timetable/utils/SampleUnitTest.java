package com.ulan.timetable.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class SampleUnitTest {

    @Test
    public void addNumbers() {
        SampleUnit su = new SampleUnit();
        assertEquals(9,su.addNumbers(5,4));
    }
}