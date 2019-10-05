package com.company;

import java.util.Scanner;

public class dowhile2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=1;
        int x=0;
        while (a%5!=0){
            a = in.nextInt();
            if(a>10)
                x=x+a;
        }
        System.out.println(x);
    }
}
