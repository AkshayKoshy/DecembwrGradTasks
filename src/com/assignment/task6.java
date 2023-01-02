package com.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CompletionException;

import static java.lang.Math.sqrt;

public class task6 {

    static class Student{
        String name;
        int enrollmentNo;

        Student()
        {
            name = "Unknown";
            enrollmentNo = 0;
        }

        Student(String s)
        {
            name = s;
            enrollmentNo = 0;
        }
        void print()
        {
            System.out.println("Name:"+name+"\nEnrollment Number:"+enrollmentNo);
        }
    }

    static class Triangle{
        int side1,side2,side3;
        float area;

        float findArea(int a, int b, int c)
        {
            float p = (a+b+c)/2;
            float area = (float) sqrt(p*(p-a)*(p-b)*(p-c));

            return area;
        }
    }

    static class Employee {
        String name, address;
        int year;

        Employee(String s, String addr, int y)
        {
            name = s;
            address = addr;
            year = y;
        }
    }

    static class Reactangle
    {
        int length, breadth;

        Reactangle()
        {
            length = 0;
            breadth = 0;
        }

        Reactangle(int a)
        {
            length = a;
            breadth = a;
        }

        Reactangle(int a, int b)
        {
            length = a;
            breadth = b;
        }

        void area()
        {
            System.out.println("Area:"+length+"*"+breadth+":"+length*breadth);
        }
    }

    static class Complex
    {
        int real, imaginary;

        void add(int r1,int i1,int r2,int i2)
        {
            System.out.println("("+r1+"+"+i1+"i)");
            System.out.println("+("+r2+"+"+i2+"i)");
            System.out.println("=");
            System.out.println(""+(r1+r2)+"+"+(i1+i2)+"i");
            System.out.println("------------------------");
        }

        void sub(int r1,int i1,int r2,int i2)
        {
            System.out.println("("+r1+"+"+i1+"i)");
            System.out.println("-("+r2+"+"+i2+"i)");
            System.out.println("=");
            System.out.println(""+(r1-r2)+"+"+(i1-i2)+"i");
            System.out.println("------------------------");
        }
        void product(int r1,int i1,int r2,int i2)
        {
            System.out.println("("+r1+"+"+i1+"i)");
            System.out.println("*("+r2+"+"+i2+"i)");
            System.out.println("=");
            System.out.println(""+((r1*r2)-(i1*i2))+"+"+((i1*r2)+(r1*i2))+"i");
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("________________________________");

        Student s = new Student();
        s.name = "Amay";
        s.enrollmentNo = 132;

        s.print();

        System.out.println("________________________________");

        Triangle t = new Triangle();
        float area;
        t.side1 = 3;
        t.side2 = 4;
        t.side3 = 5;
        area = t.findArea(t.side1,t.side2,t.side3);

        System.out.println("Area: "+  area);


        System.out.println("________________________________\n");

        Employee e1 = new Employee("Robert","64C- Walls Street", 1994);
        Employee e2 = new Employee("Sam","68D- Walls Street", 2000);
        Employee e3 = new Employee("John","26B- Walls Street", 1999);

        System.out.format("-----------------------------------------------------%n");
        System.out.format("%10s|%20s|%20s|%n","Name","Year","Address");
        System.out.format("-----------------------------------------------------%n");
        System.out.format("%10s|%20s|%20s|%n",e1.name,e1.year,e1.address);
        System.out.format("-----------------------------------------------------%n");
        System.out.format("%10s|%20s|%20s|%n",e2.name,e2.year,e2.address);
        System.out.format("-----------------------------------------------------%n");
        System.out.format("%10s|%20s|%20s|%n",e3.name,e3.year,e3.address);
        System.out.format("-----------------------------------------------------%n");

        System.out.println("________________________________");

        Student s1 = new Student("Akshay");
        Student s2 = new Student();

        s1.print();
        s2.print();

        System.out.println("________________________________");

        Reactangle none = new Reactangle();
        Reactangle one = new Reactangle(1);
        Reactangle two = new Reactangle(1,2);

        none.area();
        one.area();
        two.area();

        System.out.println("________________________________");

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        System.out.println("Enter real part of complex number 1:");
        c1.real = sc.nextInt();
        System.out.println("Enter imaginary part of complex number 1:");
        c1.imaginary = sc.nextInt();
        System.out.println("Enter real part of complex number 2:");
        c2.real = sc.nextInt();
        System.out.println("Enter imaginary part of complex number 2:");
        c2.imaginary = sc.nextInt();

        c1.add(c1.real,c1.imaginary,c2.real,c2.imaginary);
        c1.sub(c1.real,c1.imaginary,c2.real,c2.imaginary);
        c1.product(c1.real,c1.imaginary,c2.real,c2.imaginary);

        System.out.println("________________________________");

    }
}


