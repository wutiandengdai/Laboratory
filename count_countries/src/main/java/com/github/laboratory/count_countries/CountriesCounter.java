package com.github.laboratory.count_countries;

/**
 * N and M are integers within the range [1..300,000]; 
 * the number of elements in matrix A is within the range [1..300,000]; 
 * each element of matrix A is an integer within the range [1..1,000,000,000].
 * 
 * Find frontiers in SouthEast direction 
 * @author Lei YE
 * @version 1.0
 * @since 2019/3/7
 */
public class CountriesCounter{
    static public int count(final int[][] matrix){
        if(matrix == null || matrix.length <= 0){
            return 0;
        }

        final int M = matrix.length;
        final int N = matrix[1].length;

        int frontiers = 0;
        for(int i = 0; i<M; i++ ){
            for(int j = 0; j < N; j++){
                if(j+1<N && matrix[i][j] == matrix[i][j+1]){
                    frontiers ++;
                }
                if(i+1<M && matrix[i][j] == matrix[i+1][j]){
                    frontiers ++;
                }
                if(i+1<M && j+1<N && matrix[i][j] == matrix[i+1][j] && matrix[i][j] == matrix[i][j+1]){
                    frontiers --;
                }
            }
        }
        return M*N - frontiers;
    }
}