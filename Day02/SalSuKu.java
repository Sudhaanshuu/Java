package com.suku;

import java.util.Scanner;

public class SalSuKu {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.println("Enter your Salary");
        float inSal=su.nextFloat();
        float fSal=0;

        if (inSal>1000){
            fSal=inSal+200;
        }else {
            fSal=inSal+1000;

        }
        System.out.println(fSal);
    }
}
