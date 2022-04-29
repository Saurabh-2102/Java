package com;

public class Mergesorts {
    public static void sort(int[] arr,int st,int end){
        if(st<end){
            int mid = (st + end)/2;
            sort(arr,st,mid);
            sort(arr,mid+1,end);
            merge(arr,st,mid,end);
        }
    }

    private static void merge(int arr[],int st,int mid,int end) {
        int n1 = mid - st + 1;
        int n2 = end - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[st + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        int i =0;
        int j = 0;
        int k = st;


        while (i < n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while (i<n1){
            arr[k++] = left[i++];
        }
        while( j<n2){
            arr[k++] = right[j++];
        }
    }
    private static void printarr(int arr[],int n){
        for( int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr={3,9,7,2,8,4,0,1,87,5};
        sort(arr,0,arr.length-1);
        printarr(arr,arr.length);

    }
}
