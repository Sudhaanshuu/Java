package com.suku;

import java.util.Scanner;

public class TemConvert {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.print("Enter the Tempature in Celcesu ");
        float temC=su.nextFloat();

        float temF=(temC*9/5)+32;
        System.out.println(temF);
    }
}
