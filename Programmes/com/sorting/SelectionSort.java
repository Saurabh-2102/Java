package com.sorting;

public class SelectionSort {
    static void SelectionSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            for(int j= i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j]  = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    static void printarr(int arr[]){
        System.out.println("Sorted array is: ");
        for(int i=0;i<arr.length;i++){
//            System.out.println("Sorted array is: ");
            System.out.print(arr[i] +" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8,9,3,2,1,4,69,32,1,36,9,8,78,47,85,4};
        SelectionSort ob = new SelectionSort();
        ob.SelectionSort(arr);
        printarr(arr);
    }
}
/*

[9,2,7,10,6,9]



 */