package com.sorting;

public class mock2 {
    void Sum(int arr[],int sum){
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[i] == (sum - arr[j])){
                    System.out.println("Pairs with sum" + sum + "are (" + arr[i]+","+ arr[j]+")");
                }
            }

        }


    }


    public static void main(String[] args) {
        int[] arr= {1, 5, 7, -1};
        int sum = 6;
        mock2 ob = new Sum();
    }
}

/*Examples:

        Input  :  arr[] = {1, 5, 7, -1},
        sum = 6
        Output :  2
        Pairs with sum 6 are (1, 5) and (7, -1)

        Input  :  arr[] = {1, 5, 7, -1, 5},
        sum = 6
        Output :  3
        Pairs with sum 6 are (1, 5), (7, -1) &
        (1, 5)

 */