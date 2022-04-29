package com.DSA;

public class LeetCodeMaxWater {
    public static int maxArea(int[] height) {
       int n= height.length;
        int k = 0;
        int maxSum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                maxSum=Math.max(maxSum,(j-i)*Math.min(height[i],height[j]));

            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));


    }
}
