package com.PracticeProblem;


import java.util.HashMap;
import java.util.Map;

public class MInDiffrenceAmongTwoArray {

//    Time complexty => o(n)
    public static void main(String[] args) {
        int[] a1={240, 124, 86, 111, 2, 84, 954, 27, 89};
        int[] a2={1, 3, 954, 19, 8};
        int min = Integer.MAX_VALUE;
        int arrow1 = 0;
        int arrow2 = 0;
        int arr[] = new int[2];
     while(a1.length>arrow1 && a2.length >arrow2){

         int ans = Math.abs(a1[arrow1] - a2[arrow2]);
         if(ans<min){
             min = ans;
             arr[0] = a1[arrow1];
             arr[1] = a2[arrow2];
         }
         if(a1[arrow1]<a2[arrow2]){
             arrow1++;
         }
         else{
             arrow2++;
         }
     }
        System.out.println(arr[0]+" "+arr[1]);
        System.out.println("Minumum value is: " + min);

    }


}
