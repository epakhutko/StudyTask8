package com.max.idea;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {
        double x=-10;
        double y=1;
        double z=101;
        Scanner inp = new Scanner(in).useLocale(Locale.ENGLISH);;
        System.out.println("Input array length");
        int n = inp.nextInt();
        double[] Arr;
        Arr = new double[n];
        double r;
        System.out.println("Input array contents");
        boolean b=false;
        for (int i=0; i<n; i++) {
            r = inp.nextDouble();
            Arr[i]=r;
            b= b || r==x || r==y || r==z;
        }

        if (b==true)
            System.out.println("Данное значение имеется в константах");

        return;

    }
}