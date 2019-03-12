package com.github.laboratory.epi;

class ConvertBase{
    /**
     * @param s String representative of int at base1
     * @return String representation of int at base2
     */
    static public String convert(String s, int base1, int base2){
        return Integer.toString(Integer.parseInt(s, base1), base2);
    }
}