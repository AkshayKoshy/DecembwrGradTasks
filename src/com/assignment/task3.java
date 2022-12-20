package com.assignment;

import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("________________________________");

        fibonacci();

        System.out.println("________________________________");

        int n, soln;
        System.out.println("Enter number to find factorial of:");
        n = sc.nextInt();
        soln = factorial(n);
        System.out.println("Factorial is "+soln);



        System.out.println("________________________________");

        String a, rev;
        System.out.println("Enter String:");
        a = sc.next();
        StringBuilder a1 = new StringBuilder(a);
        rev = a1.reverse().toString();
        int flag = 0;

        for(int i=0; i < a.length();i++)
        {
            if(a.charAt(i) != rev.charAt(i))
            {
                System.out.println("Not a palindrome");
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            System.out.println("Is a Palindrome");
        }


        System.out.println("________________________________");

        int number;
        System.out.println("Enter Number:");
        number = sc.nextInt();
        flag = 0;
        for(int i = 2 ; i <= (number/2); i++)
        {
            if(number%i == 0)
            {
                System.out.println("Not a prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Prime number");
        }



        System.out.println("________________________________");

        for(int i = 1 ; i<= 5; i++)
        {
            for(int j=0; j<5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("________________________________");

        int input1, largest = 0, smallest= 999999 ;
        while(true)
        {
            System.out.println("Enter number (Enter -1 to exit):");
            input1 = sc.nextInt();
            if(input1 == -1)
            {
                break;
            }
            if(input1 > largest)
            {
                largest = input1;
            }
            if(smallest > input1)
            {
                smallest = input1;
            }

            System.out.println("Smallest:"+smallest+" Largest:"+largest);

        }

        System.out.println("________________________________");

        for(int i = 1 ; i<= 6; i++)
        {
            for(int k=0;k<i;k++)
            {
                if(k < 5) {
                    System.out.print("* ");
                }
            }
            for(int j=1; j<6-i;j++)
            {
                System.out.print("  ");
            }
            if(i==6)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            for(int j=1; j<6-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=0;k<i;k++)
            {
                if(k < 5) {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }

        System.out.println("________________________________");
    }

    static void fibonacci()
    {
        int first = 0, second = 1, pos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n (n > 2):");
        pos = sc.nextInt();

        System.out.print(first);
        for(int i=0;i<pos-1;i++)
        {
            int temp;
            temp = second;
            second = first+ second;
            first = temp;
            System.out.print(":"+first);
        }
        System.out.println("");

    }

    static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            int temp = 1;
            for(int i =1; i <=n ; i++)
            {
                temp *= i;
            }
            return temp;
        }

    }
}
