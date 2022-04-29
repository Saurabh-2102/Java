package com.String;

public class Array012 {
    public static void main(String[] args) {
        int[] arr = {2,1,0,2,1,2,1,1,2,0,1,2,2,2,1,0};
        int count0=0,count1=0,count2=0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i] ==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
            if(arr[i]==2){
                count2++;
            }
        }
        for(int i = 0;i<count0;i++){
            arr[i]=0;
        }
        for(int i = count0;i<count1+count0;i++){
            arr[i]=1;
        }
        for(int i = count1;i<count2+count0+count1;i++){
            arr[i]=2;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
