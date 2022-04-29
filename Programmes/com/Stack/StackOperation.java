package com.Stack;

import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 5; i++) {
            st.push(i);
        }
        st.push(6);
        System.out.println(st.peek());
//        System.out.println(st.stream());
        System.out.println("size : " + st.size());
        System.out.println(st.empty());
        st.pop();
        System.out.println(st);
    }
}
