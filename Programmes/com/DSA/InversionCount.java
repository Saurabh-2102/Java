package com.DSA;

import java.util.Arrays;
import java.util.Scanner;

public class InversionCount {
    private static <l> int mergeAndCount(int[] arr, int [] temp, int l, int m, int r)
{

    // Left subarray
//    int[] left = Arrays.copyOfRange(arr, l, m + 1);
//
//    // Right subarray
//    int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

    int i = 0, j = 0, k = l, swaps = 0;

//    while (i < left.length && j < right.length) {
    while((i<=m-1)&&(j<=r))
    {
        if(arr[i]<=arr[j])
        {
            temp[k++]=arr[i++];
        }
        else
        {
            temp[k++]=arr[j++];
            swaps=swaps+(m-i);
        }
    }
    while(i<=m-1)
    {
        temp[k++]=arr[i++];
    }
    while(j<=r)
    {
        temp[k++]=arr[j++];
    }
    for(i=l;i<=r;i++)
    {
        arr[i]=temp[i];
    }
    return swaps;
}

    // Merge sort function
    private static int mergeSortAndCount(int[] arr,int temp[], int l,int r)
    {

        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Total inversion count = left subarray count
            // + right subarray count + merge count

            // Left subarray count
            count += mergeSortAndCount(arr,temp,l, m);

            // Right subarray count
            count += mergeSortAndCount(arr,temp,m + 1, r);

            // Merge count
            count += mergeAndCount(arr,temp, l, m, r);
        }

        return count;
    }
    private static int inversionCount(int arr[], int n)
    {

        int[] temp=new int [n];
        return mergeSortAndCount(arr,temp,0,n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print(inversionCount(arr,n));
    }


}
