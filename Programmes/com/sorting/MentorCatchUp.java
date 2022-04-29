package com.sorting;

public class MentorCatchUp {
    static int CountThelength(String str){
        int count = 1;
//        char[] arr = new char[ ];
        for(int i = 0; i<str.length(); i++)
            if(str.charAt(i) == ' ' )
                count ++;


        int n = str.length();
        return count;
    }

    public static void main(String[] args) {
     String str = "I Love My INDIA, It is a great Country";
     int result = str.split(" ").length;
        System.out.println("using split: "+ result);

     int lnt = CountThelength(str);
        System.out.println("without Split: "+lnt);

    }
}
