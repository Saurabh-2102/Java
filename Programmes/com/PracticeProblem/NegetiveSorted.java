package com.PracticeProblem;

import java.util.ArrayList;

public class NegetiveSorted {
    public static void main(String[] args) {
        int[] arr = {-1,-5,-10,-1100,-1100,-1101,-1102,-9001};
        ArrayList<Integer> res = new ArrayList<>();
        int flag = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]<arr[i+1]){
//                System.out.println("Array is not sorted: ");
                flag = 1;
                break;
            }
        }
        if(flag ==0)
//            System.out.println("Array is sorted:");
        for (int i = 0; i <arr.length ; i++) {
            res.add(arr[i]);
        }
        System.out.println(res);
    }
}
