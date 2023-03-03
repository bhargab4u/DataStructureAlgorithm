package com.bhargab.learning;

import java.util.Arrays;

public class MoveZerosEnd {

	public static void main(String[] args) {
		int[] nums = new int[] {-2,0,1,0,-3,4,-1,2,1,-5,4};
		new MoveZerosEnd().moveZeroes(nums);
	}
	
	public void moveZeroes(int[] nums) {
		int  firstZeroIndex = 0; int tempNode = 0;
		boolean isSet = false;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 0) {
				firstZeroIndex = i; break;
			}
		}
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 0) {
				if (!isSet) {
					firstZeroIndex = i;
					isSet = true;
				}
				if (nums[i+1] != 0) {
					tempNode = nums[firstZeroIndex];
					nums[firstZeroIndex] = nums[i+1];
					nums[i+1] = tempNode;
					firstZeroIndex = firstZeroIndex+1;
				}
			}
			
		}
        System.out.println(Arrays.toString(nums));
    }

}
