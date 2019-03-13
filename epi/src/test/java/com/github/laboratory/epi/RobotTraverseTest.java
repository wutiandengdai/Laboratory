package com.github.laboratory.epi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotTraverseTest{
    @Test
    public void test1(){
        int actual = RobotTraverse.traverse(new int[][]{{2,9,1}, {0,0,5}, {3,8,3}, {4,2,-6}, {0,1,9}});
        assertEquals(15, actual);
    }

    @Test
    public void test2(){
        int actual = RobotTraverse.traverse(new int[][]{{0,0,3}, {0,1,-2},{7,7,9}, {2,7,18},{3,2,-25}});
        assertEquals(20, actual);
    }

    @Test
    public void test3(){
        int actual = RobotTraverse.traverse(new int[][]{{0,2,2}, {0,1,-26},{7,7,-9}, {2,7,-1},{3,2,-2}});
        assertEquals(25, actual);
    }
    
    @Test
    public void test4(){
        int actual = RobotTraverse.traverse(new int[][]{{0,2,2}, {0,1,2},{7,7,2}, {2,7,2},{3,2,-2}});
        assertEquals(0, actual);
    }
    
    @Test
    public void test5(){
        int actual = RobotTraverse.traverse(new int[][]{{0,2,2}, {0,1,2},{7,7,2}, {2,7,2},{3,2,9}});
        assertEquals(7, actual);
    }
}