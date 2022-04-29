package com.sorting;


public class mock {
    static void PosAndNeg(int[] arr){
        int[] newarr = new int[arr.length];
        int j = 0;
        for(int i=0;i<arr.length;i++)
                if(arr[i]>=0)
                    newarr[j++] = arr[i];

        for(int i= 0;i<arr.length;i++)
            if(arr[i]<0)
                newarr[j++]=arr[i];
        for(int i= 0;i<arr.length;i++)
            arr[i] = newarr[i];

    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        PosAndNeg(arr);
        System.out.println(arr);

        for(int i= 0;i<arr.length;i++)
        System.out.println(arr[i]+" ");





    }
}
