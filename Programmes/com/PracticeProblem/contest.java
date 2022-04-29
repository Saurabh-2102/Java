package com.PracticeProblem;


import java.util.*;
public class contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strarr = new String[n];
        String[] res = new String[n];
        char[] chr = {'e','k','l','p','y','q','r','b','g','j','d','w','t','c','a','x','z','n','s','i','f','v','h','m','o','u'};
        char[] chr1 = {'/','*','+','-'};
        String str = "2 + 5 + 5 - 6 / 3 * 4";
        str = str.replaceAll("\\s", "");
        System.out.println(str);

        int res1 =(int)str.charAt(0)+(int)str.charAt(2);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        for (int i = 0; i <n ; i++) {
//            strarr[i] = sc.next();
        }
        int k = 0;
        System.out.println(res1);

        for (int j = 0; j < chr.length; j++) { // 0
            for (int i = 0; i < n; i++) { //0
                char ch = strarr[i].charAt(0);
                if(ch == chr[j]){
                    res[k++] = strarr[i];
                }
            }
        }



//        for (int j = 0; j < chr.length; j++) { // 0
//                for (int i = 0; i < n; i++) { //0
//                    char ch = strarr[i].charAt(0);
//                        if(ch == chr[j]){
//                            res[k++] = strarr[i];
//                        }
//                    }
//            }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        }
}
