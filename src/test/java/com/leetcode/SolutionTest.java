package com.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void SolutionTest()
    {
        Solution sl = new Solution();
        int[] arrary = {2, 7, 11, 15};

        Assert.assertArrayEquals(new int[]{0,1}, sl.twoSum(arrary, 9));
    }

}