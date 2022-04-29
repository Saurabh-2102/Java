package com.PracticeProblem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row");
        int M = sc.nextInt();
        System.out.println("enter the size of the column");
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        System.out.println("enter the "+M*N+" elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("your array of size ["+M+"] ["+N+"] is :");
        for(int i=0;i<M;i++){

            for(int j=0;j<N;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
