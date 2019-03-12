package com.github.laboratory.epi;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertBaseTest{
    @Test
    public void test1(){
        String actual = ConvertBase.convert("10", 10, 16);
        assertTrue(actual.equalsIgnoreCase("A"));
    }

    @Test
    public void test2(){
        String actual = ConvertBase.convert("B", 16, 10);
        assertEquals("11", actual);
    }

    @Test
    public void test3(){
        String actual = ConvertBase.convert("C", 16, 2);
        assertEquals("1100", actual);
    }
}