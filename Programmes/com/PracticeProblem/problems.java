package com.PracticeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problems {
    public static void main(String[] args) {
        int[] arr = {12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;
        List<List> lst = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
          //6
        for (int i = 0; i <= n-1; i++){
            int low = i+1 ;
            int high = n - 1;
            while(low<high){
                int sum = arr[low] + arr[i] + arr[high];
                if(sum==target){
                   List<Integer> list=new ArrayList<>();
                   list.add(arr[low]);
                    list.add(arr[i]);
                    list.add(arr[high]);
                    lst.add(list);
                    low++;
                    high--;
                }
                else if(sum<target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        System.out.println(lst);
    }

}

