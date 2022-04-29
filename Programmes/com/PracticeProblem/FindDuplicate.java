package com.PracticeProblem;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,5,8,7,4,3,9,7,9,1,9,1,1,6,1};
        int exists = -1;
        int[] temp=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            int count = 1;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    temp[j] = exists;
                    count++;
                }
            }
            if(temp[i]!=exists){
                temp[i]=count;
            }

        }
        for (int i=0;i<arr.length;i++){
            if(temp[i]==1)
            System.out.println(arr[i]+" || "  +temp[i]+" times, ");
        }

    }
}
