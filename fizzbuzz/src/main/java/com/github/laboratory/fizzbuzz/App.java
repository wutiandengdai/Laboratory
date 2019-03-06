package com.github.laboratory.fizzbuzz;

import java.util.Map;
import java.util.HashMap;

/**
 * @author Lei YE
 * @version 1.0
 * @since 2019/3/6
 * @category CodeWar
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(3l, "Fizz");
        map.put(5l, "Buzz");
        new FizzBuzzCounter().count(100, map);
    }
}
