package com.DSA;
//
public class Mock16feb {
    public static void Bubblesort(int arr[]){

        for(int i = 0; i<arr.length; i++){
            for(int j = 0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();


    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,0};
        Bubblesort(arr);
        int[] arr1=new int[arr.length];
        int count = 0;


//        another way
        int j=0;

        for (int i = 0;i<arr.length;i++){
            if(arr[i] == 0)
                arr1[j++] = arr[i];
        }
        for (int i = 0;i<arr.length;i++){

            if(arr[i]== 1)
            arr1[j++]=arr[i];
        }
        for (int i = 0;i<arr.length;i++){
            if(arr[i]== 2)
                arr1[j++]=arr[i];
        }
        System.out.println("another way ");
        for(int i = 0;i<arr1.length;i++)
        System.out.print(arr1[i]+" ");

    }
}



