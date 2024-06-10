package com.suku;

import java.util.Scanner;

public class SuMax {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        int num1=su.nextInt();
        int num2=su.nextInt();
        int num3=su.nextInt();

        if (num1>num2&&num1>num3){
            System.out.println("Largest Numer is "+num1);
        }else if (num2>num1&&num2>num3){
            System.out.println("Largest Numer is "+num2);

        } else
            System.out.println("Largest Numer is "+num3);
    }
}
