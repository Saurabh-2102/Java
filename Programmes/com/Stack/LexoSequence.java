package com.Stack;

import java.util.Scanner;
import java.util.Stack;

public class LexoSequence {
    static void smallestSubsequence(int []arr, int K)
{

    // Length of String
    int N = arr.length;

    // Stores the minimum subsequence
    Stack<Integer> answer = new Stack<>();

    // Traverse the String S
    for (int i = 0; i < N; ++i) {

        // If the stack is empty
        if (answer.isEmpty()) {
            answer.add(arr[i]);
        }
        else {

            // Iterate till the current
            // character is less than the
            // the character at the top of stack
            while ((!answer.isEmpty())
                    && (arr[i] < answer.peek())

                    // Check if there are enough
                    // characters remaining
                    // to obtain length K
                    && (answer.size() - 1 + N - i >= K)) {
                answer.pop();
            }

            // If stack size is < K
            if (answer.isEmpty() || answer.size() < K) {

                // Push the current
                // character into it
                answer.add(arr[i]);
            }
        }
    }

    // Stores the resultant String
    String ret="";

    // Iterate until stack is empty
    while (!answer.isEmpty()) {
        ret+=(answer.peek());
        answer.pop();
    }

    // Reverse the String
    ret = reverse(ret);

    // Print the String
    char[] ans = new char[ret.length()];
    for (int i = 0; i < ans.length; i++) {
        ans[i]=ret.charAt(i);
    }
    for (int i = 0; i < ans.length; i++) {
        System.out.print(ans[i]+" ");
    }
}
    static String reverse(String input) {
        char[] a = input.toCharArray();
        int l, r = a.length - 1;
        for (l = 0; l < r; l++, r--) {
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        smallestSubsequence(arr, K);
    }
}
