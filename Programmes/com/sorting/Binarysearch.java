package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {
    static int Binarysearch(int[] arr, int l, int r, int search){
        if(r>=l){
            int mid = l+ (r-l)/2;
        if(arr[mid] == search)
            System.out.println(mid);
        if(arr[mid]>search)
            System.out.println(Binarysearch(arr,l,mid-1,search));

            else
            System.out.println(Binarysearch(arr,mid+1,r,search));
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,6,20,12,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. to find: ");
        int search = sc.nextInt();
        Arrays.sort(arr);
//        int result =
                Binarysearch(arr,0,arr.length,search);
//        System.out.println(result);

    }
}
