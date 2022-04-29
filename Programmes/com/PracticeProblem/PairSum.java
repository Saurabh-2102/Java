package com.PracticeProblem;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 10;
        int flag = 0;
        for (int b = 0; b < arr.length; b++){
            for (int a = b+1; a < arr.length; a++){
                if(arr[b]+arr[a] == sum){
                    System.out.println(arr[b]+" + "+arr[a]+" gives the sum of "+sum);
                    flag = 1;
                }
            }
        }
        if(flag == 0)
            System.out.println("No pair is there ;)");
    }
}

