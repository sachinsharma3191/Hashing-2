package com.exmaple.problems;

import java.util.HashMap;
import java.util.Map;


//Time Complexity : O(N) 
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*
HashMap works on principle of Hashing.We 
*/
public class SubArraySum {

	public int subarraySum(int[] nums, int k) {
		int sum = 0, count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		int size = nums.length;
		map.put(0, 1);
		for (int i = 0; i < size; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}
}
