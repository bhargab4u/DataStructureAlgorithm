package com.bhargab.learning;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		int[] nums = new int[] {1,2,3,1};
		System.out.println(new DuplicateElementInArray().containsDuplicate(nums));
	}
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>(nums.length, 1.0f);
		
		for (int i : nums) {
			if (!set.add(i)) {
				return true;
			}
		}
        return false;
    }

}
