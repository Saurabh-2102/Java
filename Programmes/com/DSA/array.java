package com.DSA;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = input.nextInt();
        int[] temp = new int[n];
        int j=0;

        int[] arr = new int[n];
        System.out.println("enter the " + n + " elements:");

        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
            System.out.print(arr[i]);
        }
        for(int i= 0;i<n;i++)
            if(arr[i]==0){
                temp[j++]=arr[i];
            }
        for(int i= 0;i<n;i++)
            if(arr[i]==1){
                temp[j++]=arr[i];
            }
        for(int i= 0;i<n;i++)
            if(arr[i]==2){
                temp[j++]=arr[i];
            }
        System.out.println("this is temp array;");
        for(int i=0;i<n;i++)
        System.out.print(temp[i]+" ");
// 3*o(n)

    }
}



//        int[] array = {1,2,3,4,5,6,7};


//        System.out.println(array.length);

/*
asymptotic notation

// big o (worst)
theta (average)
omega (best)




 */