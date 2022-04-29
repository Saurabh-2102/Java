package com.PracticeProblem;
// O(n)


import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("give an input to find string element in String array: ");
        String str = sc.next();
        int[] a1={240, 124, 86, 111, 2, 84, 954, 27, 89};
        String[] strarr= {"ashwini","saurabh","nicky","suraj","karthik"};
        int serchkey = 27;
        for (int i = 0; i < a1.length; i++) {
            if(a1[i]==serchkey) {
                System.out.println("search key is found at : "+i+"th index. ");
            }
        }
    }
}
