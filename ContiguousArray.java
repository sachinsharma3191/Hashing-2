package com.exmaple.problems;

//Time Complexity : O(N) 
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*
HashMap works on principle of Hashing.We 
*/
import java.util.HashMap;

public class ContiguousArray {
	public int findMaxLength(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int max = 0;
		int currentSum = 0;
		for (int i = 0; i < nums.length; i++) {
			currentSum = nums[i] == 1 ? currentSum + 1 : currentSum - 1;
			if (map.containsKey(currentSum)) {
				max = Math.max(max, i - map.get(currentSum));
			} else {
				map.put(currentSum, i);
			}
		}
		return max;
	}

	public static void main(String args[]) {
		int array[] = { 0, 1 };

		ContiguousArray longest = new ContiguousArray();
		System.out.println(longest.findMaxLength(array));
	}
}
