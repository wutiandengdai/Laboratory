package com.github.laboratory.epi;

/**
 * EPI problem set 2.1 - Array
 * 
 * Design an algorithm that takes a sequence of n three-dimensional coordinates
 * to be traversed, and returns the minimum battery capacity needed to complete
 * the journey. The robot begins with the battery fully charged.
 */
class RobotTraverse{
    /**
     * Given three dimension space
     * return battery capacity needed.
     */
    static public int traverse(int[][] space){
        if(space.length < 3){
            return 0;
        }
        //my answer
        int maxDis = 0;
        for (int i= 0; i< space.length-1; i++ ){
            for(int j = i+1; j < space.length; j++){
                if(space[j][2] - space[i][2] > maxDis){
                    maxDis = space[j][2] - space[i][2];
                }
            }
        }

        //from the answer book
        int minHeight = space[0][2], capacity = 0;
        for(int i = 1; i<space.length; i++){
            capacity = Math.max(capacity, space[i][2] - minHeight);
            minHeight = Math.min(minHeight, space[i][2]);
        }
        return capacity;
    }
}