package com.PracticeProblem;


import java.util.Arrays;
import java.util.Locale;

public class anagram {
    public static void main(String[] args) {
     String str = "car";
     String str1 = "RAC";
     boolean res = isAnagram(str,str1);
        System.out.println(res);

    }
    public static boolean isAnagram(String str,String str1){
        if(str.length() != str1.length())
            return false;
        else{
            char[] strc = str.toLowerCase().toCharArray();
            char[] str1c = str1.toLowerCase().toCharArray();
            Arrays.sort(strc);
            Arrays.sort(str1c);

            if(!Arrays.equals(strc,str1c))
                return false;

        }

        return true;
    }
}
