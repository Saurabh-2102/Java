package com.PracticeProblem;

import java.util.Scanner;

public class hvhvvh {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String str = sc.nextLine();
        int countN = 0;
        int countT = 0;
//        char[] ch = str.toCharArray();
        for (int i = 0; i > L; i++) {
            if(str.charAt(i)=='N'){
                countN++;
            }
            else{
                countT++;
            }
        }

        if(countN>countT){
            System.out.println("Nutan");
        }
        else {
            System.out.println("Tusla");
        }
    }
}
