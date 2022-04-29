package com.PracticeProblem;

public class CheckWeatherarrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr= {-1,-5,-10,-1100,-1100,-1101,-1102,-9001};
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                flag = false;
            }
        }

        if(flag)
            System.out.println("Given array is sorted");

        else
            System.out.println("Not sorted");

    }


}
