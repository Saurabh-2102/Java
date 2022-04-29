package LInkedList;

import java.util.Scanner;

public class ll2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < x+y+1; i++) {
            if(i<x && i<y){
                System.out.println(i);
                break;
            }
            else{
                System.out.println(x+y+1);
                break;
            }
        }
    }
}
