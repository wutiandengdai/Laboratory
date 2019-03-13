package com.github.laboratory.epi;

/**
 * epi problem set 1.1 - Base
 *  
 * Write a function that performs base conversion. Speciﬁcally,theinput is an integer base b1, 
 * a string s, representing an integer x in base b1, and another integerbaseb2;the output 
 * is the string representing the integer x in base b2. Assume 2≤b1,b2 ≤16. Use “A” to 
 * represent 10, “B” for 11, ..., and “F” for 15. 
 */
class ConvertBase{
    /**
     * @param s String representative of int at base1
     * @return String representation of int at base2
     */
    static public String convert(String s, int base1, int base2){
        return Integer.toString(Integer.parseInt(s, base1), base2);
    }
}