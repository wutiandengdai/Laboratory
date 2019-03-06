package com.github.laboratory.fizzbuzz;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzCounterTest{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void test1digits() {
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(3l, "Fizz");
        map.put(5l, "Buzz");
        new FizzBuzzCounter().count(15, map);
    	assertEquals("1\r\n2\r\nFizz\r\n4\r\nBuzz\r\nFizz\r\n7\r\n8\r\nFizz\r\nBuzz\r\n11\r\nFizz\r\nFizz\r\n14\r\nFizzBuzz",outContent.toString().trim());
    }
    
    @Test
    public void test2digits() {
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(11l, "yoyo");
        new FizzBuzzCounter().count(12, map);
        assertEquals("1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\nyoyo\r\n12", outContent.toString().trim());
    }

    @Test
    public void testZero() {
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(0l, "emptiness");
        map.put(7l, "seven");
        new FizzBuzzCounter().count(12, map);
        assertEquals("1\r\n2\r\n3\r\n4\r\n5\r\n6\r\nseven\r\n8\r\n9\r\nemptiness\r\n11\r\n12", outContent.toString().trim());
    }

    @Test
    public void testNegative() {
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(-13l, "emptiness");
        new FizzBuzzCounter().count(1, map);
        assertEquals("1", outContent.toString().trim());
    }

    @Test
    public void testInvalidInput(){    
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(-13l, "emptiness");
        new FizzBuzzCounter().count(-1, map);
        assertEquals("Invalid Number, please input a positive number...",outContent.toString().trim());
    }
    // @Rule
    // public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    // @Test
    // public void test2digits() {
    //     Map<Long, String> map = new HashMap<Long, String>();
    //     map.put(11l, "yoyo");
    //     new FizzBuzzCounter().count(12, map);
    //     assertEquals("1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n10\r\nyoyo\r\n12", systemOutRule.getLog());

    // @Test
	// public void test1digit() {		
    //     Map<Long, String> map = new HashMap<Long, String>();
    //     map.put(3l, "Fizz");
    //     map.put(5l, "Buzz");
    //     new FizzBuzzCounter().count(15, map);
	// 	assertEquals("1\r\n2\r\nFizz\r\n4\r\nBuzz\r\n6\r\n7\r\n8\r\n\r\nFizz\r\nBuzz\r\n11\r\nFizz\r\nFizz\r\nFizz\r\nFizzBuzz", systemOutRule.getLog());
    // }
    
    // @Test
    // public void test0(){
    //     Map<Long, String> map = new HashMap<Long, String>();
    //     map.put(0l, "emptiness");
    //     map.put(7l, "seven");
    //     new FizzBuzzCounter().count(12, map);
    //     assertEquals("1\r\n2\r\n3\r\n4\r\n5\r\n6\r\nseven\r\n8\r\n\r\n9\r\nemptiness\r\n11\r\n12", systemOutRule.getLog());
    // }

    // @Test
    // public void testNegative(){
    //     Map<Long, String> map = new HashMap<Long, String>();
    //     map.put(-13l, "emptiness");
    //     new FizzBuzzCounter().count(1, map);
    //     assertEquals("Invalid Number, please input a positive number...\r\n", systemOutRule.getLog());
    // }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}