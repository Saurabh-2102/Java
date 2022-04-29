package com.DSA.Mock;


// Java program to print largest contiguous array sum


class Kadane
{
    public static void main(String[] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int size = a.length;
        int max_so_far = a[0], max_ending_here = a[0];

        for (int i = 1; i < size; i++)
        {


            max_so_far = Math.max(a[i],max_so_far+a[i]);
            max_ending_here =Math.max(max_ending_here,max_so_far);

//            max_ending_here = max_ending_here + a[i];
//            if (max_so_far < max_ending_here)
//                max_so_far = max_ending_here;
//            if (max_ending_here < 0)
//                max_ending_here = 0;
        }
        System.out.println(max_ending_here);
    }
}
