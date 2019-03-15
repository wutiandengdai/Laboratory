package com.github.laboratory.leetcode.easy;

/**
 * Leetcode problem set 14
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
public class CommonPrefix{
    public static String longestCommonPrefix(String[] strs){
        
        if(strs == null || strs.length<1 || strs[0].length()<1){
            return "";
        }
        for (int index = strs[0].length(); index > 0; index--){
            int i;
            for( i=0; i<strs.length; i++ ){
                if(!strs[i].startsWith(strs[0].substring(0,index))){
                    break;
                }
            }
            if(i == strs.length){
                return strs[0].substring(0,index);
            }
        }
        return "";
    }
}