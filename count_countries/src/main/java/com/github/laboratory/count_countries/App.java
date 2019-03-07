package com.github.laboratory.count_countries;

/**
 * Count countries 
 */
public class App 
{
    public static void main( String[] args )
    {
        int[][] matrix = {{5, 4, 4}, 
                        {4, 3, 4},
                        {3, 2, 4},
                        {2, 2, 2},
                        {3, 3, 4},
                        {1, 4, 4},
                        {4, 1, 1}};
        System.out.println(CountriesCounter.count(matrix));
    }

}
