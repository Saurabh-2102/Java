package com.Merges;

public class MergeSort {
    public static void sort(int[] arr,int st,int end){
        if(st<end){
            int mid = (st+end)/2;
            sort(arr,st,mid);
            sort(arr,mid+1,end);
            merge(arr,st,mid,end);
        }
        }
        public static void merge(int[] arr,int st,int mid,int end) {
            int n1 = mid - st + 1;
            int n2 = end - mid;
            int[] left = new int[n1];
            int[] right = new int[n2];
            for (int i = 0; i < n1; ++i){
                left[i] = arr[st + i];
        }
            for (int j = 0; j < n2; ++j) {
                right[j] = arr[mid + 1 + j];
            }
            int i = 0;
            int j = 0;
            int k = st;
            while (i < n1 && j < n2) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            while (i < n1) {
                arr[k] = left[i];
                i++;
                k++;
            }
            while (j < n2) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
    static void Printarray(int[] arr){
        for(int m=0;m<arr.length;m++){
            System.out.print(arr[m]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {9,6,1,4,7,8,3,6,9,7,45,85,10};
        MergeSort ob = new MergeSort();
        ob.sort(arr,0,arr.length-1);
        Printarray(arr);

    }
}
