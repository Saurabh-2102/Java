package com.DSA;

public class LeetCodeAddSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
          for(int j=i+1;j< nums.length;j++){
              if((nums[i]+nums[j])==target){
                  ans[0]=i;
                  ans[1]=j;
              }
          }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,1,5};
        int target = 9;
        System.out.println( twoSum(nums,target));

    }
}
