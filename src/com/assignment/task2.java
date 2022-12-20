package com.assignment;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("________________________________");

        System.out.println("Enter number:");
        int some;
        some = sc.nextInt();

        if(some >= 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }

        System.out.println("________________________________");
        System.out.println("Enter something:");
        char ch;
        ch = sc.next().charAt(0);

        if(Character.isLetter(ch))
        {
            System.out.println("It is a letter");
        }
        else
        {
            System.out.println("It is not a letter");
        }



        System.out.println("________________________________");

        int a,b;
        System.out.println("Enter number a:");
        a = sc.nextInt();
        System.out.println("Enter number b:");
        b = sc.nextInt();
        System.out.println("a/b");
        System.out.println("Quotient:"+(a/b));
        System.out.println("Remainder"+(a%b));


        System.out.println("________________________________");

        int year;
        System.out.println("Enter Year:");
        year = sc.nextInt();
        if(year%4 == 0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }




        System.out.println("________________________________");

        float percentage;
        char grade;
        System.out.println("Enter Percent:");
        percentage = sc.nextFloat();

        if(percentage > 90)
        {
            grade = 'A';
        }
        else if(percentage > 75)
        {
            grade = 'B';
        }
        else if(percentage > 65)
        {
            grade = 'C';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("Final Grade:"+ grade);

        System.out.println("________________________________");
        int c,d;
        System.out.println("Enter number c:");
        c = sc.nextInt();
        System.out.println("Enter number d:");
        d = sc.nextInt();
        System.out.println("Enter operator");
        char op;
        op = sc.next().charAt(0);
        switch(op)
        {
            case '+':
                System.out.println("Result:"+ (c+d));
                break;
            case '-':
                System.out.println("Result:"+ (c-d));
                break;
            case '*':
                System.out.println("Result:"+ (c*d));
                break;
            case '/':
                System.out.println("Result:"+ (c/d));
                break;
            default:
                System.out.println("Invalid input");
                break;

        }

        System.out.println("________________________________");

        int go;
        while(true)
        {
            System.out.println("Enter number:");
            go = sc.nextInt();
            if(go >= 0)
            {
                System.out.println("Good Going");
            }
            else
            {
                System.out.println("It's Over");
                break;
            }
        }

        System.out.println("________________________________");
        int units, temp;
        System.out.println("Enter number of Units:");
        units = sc.nextInt();
        float cost = 0;

        if(units > 300)
        {
            temp = units - 300;
            cost += temp * 2.5;
            units = 300;
        }
        if(units > 120)
        {
            temp = units - 120;
            cost += temp * 1.1;
            units = 120;
        }
        if(units > 90)
        {
            temp = units - 90;
            cost += temp * 0.75;
            units = 90;
        }
        if(units > 60)
        {
            cost += 60 * 0.3;
        }

        System.out.println("Total Bill:"+ (cost+cost*0.2));

        System.out.println("________________________________");

        System.out.println("________________________________");

        System.out.println("________________________________");
    }
}
