package com.github.laboratory.count_countries;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountriesCounterTest{

    @Test
    public void test(){
        int[][] matrix = {{5, 4, 4}, 
                        {4, 3, 4},
                        {3, 2, 4},
                        {2, 2, 2},
                        {3, 3, 4},
                        {1, 4, 4},
                        {4, 1, 1}};
        int actual = CountriesCounter.count(matrix);
        assertEquals("Test Failed at case 1 - multiple country", 11, actual);
    }

    @Test
    public void test1Country(){
        int[][] matrix = {{2,2}, {2,2}};
        int actual = CountriesCounter.count(matrix);
        assertEquals("Test Failed at case 2 - 1 country", 1, actual);
    }

    @Test
    public void test2Countries(){
        int[][] matrix = {{2,2}, {2,2}, {2,2}, {3,3},{3,3}};
        int actual = CountriesCounter.count(matrix);
        assertEquals("Test Failed at case 3 - 2 countries", 2, actual);
    }

    @Test
    public void test0Country(){
        int[][] matrix = {};
        int actual = CountriesCounter.count(matrix);
        assertEquals("Test Failed at case 3 - 0 country", 0, actual);
    }
}