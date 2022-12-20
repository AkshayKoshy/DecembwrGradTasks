package com.assignment;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String name = "Akshay Koshy";
        System.out.println(name);

        System.out.println("________________________________");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String input1 = sc.nextLine();

        System.out.println("Result:"+ input1);

        System.out.println("________________________________");
        int a = 10, b = 20;
        System.out.println("a:"+a+" b:"+b);
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println(" After Swap with temp variable \n a:"+a+" b:"+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" After Swap without temp variable \n a:"+a+" b:"+b);

        System.out.println("________________________________");

        System.out.println("a:"+a+" b:"+b);
        int c = a + b;
        System.out.println("Sum: "+ c);


        System.out.println("________________________________");

        System.out.println("Enter the Radius of Circle");
        int r;
        r = sc.nextInt();
        float area;

        System.out.println("Area of circle:"+ (r*r*3.14));

        System.out.println("________________________________");
    }
}
