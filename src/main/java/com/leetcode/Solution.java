package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
        {
            map.put(nums[i],i);
        }

        for(int i=0; i<nums.length; i++)
        {
            int complement = target - nums[i];
            if(map.size()!= 0 && map.containsKey(complement))
            {
                return new int[] {i,map.get(complement)};
            }

        }
        return result;
    }
}
