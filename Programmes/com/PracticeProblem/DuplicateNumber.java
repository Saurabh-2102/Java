package com.PracticeProblem;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,0,5,1,6,7,8};
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]) {
                    temp[j] = 2;
                }
                else{
                    temp[j]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(temp[i]==2){
                System.out.print(temp[i]+ " ");
            }
        }
    }
}
