package com.DSA;

public class UniqueCountSum  {
    static int Sum(int[] arr){
        int sum=0;
        int[] visitedarr = new int[arr.length];
        int visited = -1;
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visitedarr[j]=visited;
                }

            }
            if(visitedarr[i]!=visited){
                visitedarr[i] = count;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(visitedarr[i]==1) {
                sum+=arr[i];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Sum(arr));

    }
}
