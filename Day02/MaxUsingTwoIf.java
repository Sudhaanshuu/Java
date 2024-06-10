package com.suku;

import java.util.Scanner;

public class MaxUsingTwoIf {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        int n1=su.nextInt();
        int n2=su.nextInt();
        int n3=su.nextInt();

        int maxSu=n1;
        if (n2>maxSu)
            maxSu=n2;

        if (n3>maxSu)
            maxSu=n3;

        System.out.println(maxSu);
    }
}
