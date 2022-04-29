package com.PracticeProblem;
// O(log n)

public class BinarySearch {
    public static void main(String[] args) {
        int[] a1={22,45,77,111,114,214,542,874,987,7895};
        int search = 77;
        int low = 0;
        int flag = 0;
        int high = a1.length-1; //9
          while(high>=low) {
              int mid = (low+high)/2;
              if (search == a1[mid]) {
                  System.out.println("value found at : " + mid);
                  flag = 1;
                  break;
              }
              else if (search < a1[mid]) {
                  high = mid - 1;
              }
              else {
                  low = mid + 1;
              }
          }
          if(flag==0) {
              System.out.println("element is not found");
          }

    }
}
