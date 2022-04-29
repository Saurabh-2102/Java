package com.DSA;

import java.util.Scanner;

public class Firstandlast {
    public static void fun(String FullName){
        String[] first = FullName.split(" ");
        for(int i = 0;i<1;i++){
            System.out.println("First name: "+first[0]);
            System.out.println("Last name : "+first[1]);
        }
    }
    public static void main(String[] args) {
        String FullName = "Saurabh kumar";
        fun(FullName);

    }
}
