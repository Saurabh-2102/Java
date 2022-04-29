package com.PracticeProblem;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {5,6,8,3,2,0,7,9,1,8,8,34,1,0,2,35,4,7};
        Arrays.sort(arr); // nlogn
        int n =arr.length;
        System.out.println("sorted array is: ");
        for(int i=0;i<arr.length;i++) {  //0(n)
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.print(arr[n-2] + " ");


//        merge sort = O(nlogn)
//        insertion,selection,quick,bubble = O(n^2)
    }

}
// o(1),log n,sqrt n,n,n log n ,n^2,n^3,N^N;
