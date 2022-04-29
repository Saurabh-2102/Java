package com.sorting;

public class BubbleSort {
    static void sort(int arr[]){
        int n=arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
//            System.out.println("Sorted array is: ");
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,9,8,7,1,0,2,3,5,87,41};
        BubbleSort ob = new BubbleSort();
        ob.sort(arr);
        printarr(arr);
    }
}
