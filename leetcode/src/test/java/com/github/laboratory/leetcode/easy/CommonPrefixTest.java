package com.github.laboratory.leetcode.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommonPrefixTest {
    @Test
    public void test1(){
        String[] strs = {"flower","flow","flight"};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("fl", actual);
    }

    @Test
    public void test2(){
        String[] strs = {"dog","racecar","car"};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("", actual);
    }

    @Test
    public void test3(){
        String[] strs = {};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("", actual);
    }

    @Test
    public void test4(){
        String[] strs = {"dog"};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("dog", actual);
    }

    @Test
    public void test5(){
        String[] strs = {"dog","",""};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("", actual);
    }

    @Test
    public void test6(){
        String[] strs = {"dog","dog","dog"};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("dog", actual);
    }
    
    @Test
    public void test7(){
        String[] strs = {"a","a","a"};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("a", actual);
    }
    
    @Test
    public void test8(){
        String[] strs = {"a","",""};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("", actual);
    }
    
    @Test
    public void test9(){
        String[] strs = {"a"};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("a", actual);
    }
    
    @Test
    public void test10(){
        String[] strs = {"a","b"};
        String actual = CommonPrefix.longestCommonPrefix(strs);
        assertEquals("", actual);
    }
    
}