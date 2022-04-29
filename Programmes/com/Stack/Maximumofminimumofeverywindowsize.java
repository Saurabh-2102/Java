package com.Stack;
import java.util.*;

public class Maximumofminimumofeverywindowsize {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        for (int k = 1; k < n; k++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n-k ; i++) {
                int min = arr[i];
                for (int j = 1; j < k; j++) {
                    if (arr[i+j] < min)
                        min = arr[i+j];

                }
                if(min>max)
                    max = min;
            }
            System.out.println(max);

        }

    }
}
