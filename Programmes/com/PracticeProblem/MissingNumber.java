package com.PracticeProblem;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[100];
        int arrSum = 0;
        int Sumof1to10 = 10*(11)/2;
        for(int i=0;i<arr.length;i++){
//            arrSum += arr[i];
            arrSum = arrSum + arr[i];

        }

        if(arrSum == Sumof1to10){
            System.out.println("no missing element");
        }
        else{
            System.out.println(Sumof1to10-arrSum);
        }
    }
}
