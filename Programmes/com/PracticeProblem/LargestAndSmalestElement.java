package com.PracticeProblem;

public class LargestAndSmalestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int largest  = Integer.MIN_VALUE;
        int smalest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            smalest = Math.min(smalest,arr[i]);
            largest = Math.max(largest,arr[i]);
        }
        System.out.println("smallest element is: "+ smalest);
        System.out.println("largest element is: "+ largest);

    }
}
