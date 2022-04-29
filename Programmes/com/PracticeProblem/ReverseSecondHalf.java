package com.PracticeProblem;

public class ReverseSecondHalf {
    public static void main(String[] args) {
        int arr[] = {5,6,8,3,2,0,7,9,1,8,8,1,0,2,35,4,7};
        int n = arr.length;
        int M= arr.length/2;
        for(int i=n-1;i>=M;i--){
            System.out.print(arr[i]+" ");
        }
    }
}