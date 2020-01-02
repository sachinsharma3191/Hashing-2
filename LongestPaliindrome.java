package com.exmaple.problems;


//Time Complexity : O(1) 
//Space Complexity : O(1) for all operations
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

/*
HashMap works on principle of Hashing.We 
*/
public class LongestPaliindrome {

	public int longestPalindrome(String s) {
		int count[] = new int[128];
		for (char ch : s.toCharArray()) {
			count[ch]++;
		}
		int odd = 0;
		for (int i : count) {
			if (i % 2 != 0) {
				odd++;
			}
		}
		return odd > 1 ? s.length() - odd + 1 : s.length();
	}
}
