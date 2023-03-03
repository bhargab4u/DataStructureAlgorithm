package com.bhargab.learning;

import java.util.Arrays;

public class RotateArrayRight {

	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,3,4,5,6,7};
		int k = 13;
		new RotateArrayRight().rotate(nums, k);
	}
	
	public void rotate(int[] nums, int k) {
        int tempo[];
        k%=nums.length;
		while (k > 0) {
			tempo = new int[nums.length];
			for (int i=0; i< nums.length; i++) {
				if (i==0) {
					tempo[i] = nums[nums.length-1];
				} else {
					tempo[i] = nums[i-1];
				}
			}
			nums = tempo;
			k--;
		}
		System.out.println(Arrays.toString(nums).replaceAll("\\s", ""));
    }

}
