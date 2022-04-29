package com.sorting;

public class InsertionSort {
    void insertsort(int[] arr){
        int n = arr.length;
        int key;
        for(int index=1;index<n;index++){
        key = arr[index];
//        int index = i;

            while (index > 0 && arr[index-1]>key) {
                arr[index] = arr[index-1];
                index--;
            }
            arr[index]=key;

        }

    }
    static void printarr(int[] arr){
        System.out.println("sorted array is:");
        for (int j : arr) {
            System.out.print(j+" ");

        }
        System.out.print(" ");
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5,8,3,4,7,8,9};
        InsertionSort sort = new InsertionSort();
        sort.insertsort(arr);
        printarr(arr);

    }
}
/*
key=9
//[ 3,8,9, ,7]
          i
f(n) =


     /*
 */
