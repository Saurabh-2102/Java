package com.Stack;

import java.util.Scanner;
import java.util.Stack;

public class LongestvalidParenthesis {
    public static int findMaxLen(String str)
        {
            int n = str.length();
            Stack<Integer> stk = new Stack<>();
            stk.push(-1);
            int result = 0;

            for (int i = 0; i < n; i++)
            {
                if (str.charAt(i) == '(')
                    stk.push(i);


                else
                {

                    if (!stk.empty())
                    {
                        stk.pop();
                    }


                    if (!stk.empty())
                        result = Math.max(result, i - stk.peek());

                    else
                        stk.push(i);
                }
            }

            return result;
        }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int res = findMaxLen(str);
        System.out.println(res);
        }
    }

