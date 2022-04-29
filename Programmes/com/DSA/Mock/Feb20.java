package com.DSA.Mock;

public class Feb20 {
    static void BubbleSort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                }
            }
            }
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={6,5,7,1,2,8,3};
        BubbleSort(arr);

    }
}
