package com.bhargab.learning;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		
		int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new KadanesAlgorithm().maxSubArray(nums));
	}
		
		public int maxSubArray(int[] nums) {

			int maxSum=0, curSum = 0;
			
			for (int i= 0; i < nums.length; i++) {
				if (i == 0) {
					curSum = nums[i];
					maxSum = nums[i];
					continue;
				}
				curSum = (nums[i] > curSum + nums[i])? nums[i] : (curSum + nums[i]);
				maxSum = maxSum < curSum ? curSum : maxSum;
			}
	        return maxSum;
	    }

}
