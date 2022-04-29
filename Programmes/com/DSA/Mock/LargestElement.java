package com.DSA.Mock;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {8,7,3,9,5,1,9};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){

                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
//            else if(arr[i]>max2){
//                max2=arr[i];
//            }
        }
        System.out.println("maximum");
        System.out.println(max);
        System.out.println("Minumum");
        System.out.println(min);

//        int[] arr = {1,2,3,4,5,6,7,7,8,9,10};
//        int value = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==i+1){
//                value = arr[i]+1;
//
//            }
//
//        }
//        if(value == 0){
//        System.out.println("value is not missing");
//        }
//        else{
//            System.out.println(value);
//        }


    }
}





