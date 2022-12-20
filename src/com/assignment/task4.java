package com.assignment;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("________________________________");

        int[] a = new int[5];
        for(int i = 0; i<5;i++)
        {
            System.out.println("Enter number for array (max 5):");
            a[i] = sc.nextInt();
        }

        for(int i = 0;i<5;i++)
        {
            System.out.print(a[i]+":");
        }
        System.out.println("");
        System.out.println("________________________________");

        int sum = 0;
        for(int i=0;i<5; i++)
        {
            sum += a[i];
        }

        System.out.println("Average:"+ (sum/5));



        System.out.println("________________________________");

        int num, flag = 0;
        System.out.println("Enter number to search for:");
        num = sc.nextInt();

        for(int i = 0;i<5;i++)
        {
            if(a[i] == num) {
                System.out.println("Element found at index "+(i+1));
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Element not found.");
        }

        System.out.println("________________________________");

        flag = 0;
        System.out.println("Enter number to search for:");
        num = sc.nextInt();
        int[] b = {1,2,3,4,5,6,7,8,9,10};
        int low = 0, high = b.length, mid;
        for(int i = 0 ;i<b.length;i++)
        {
            mid = ((low+high)/2);
            if(b[mid] == num)
            {
                System.out.println("Element found at "+ (mid+1));
                flag = 1;
                break;
            }
            else if(b[mid]>num){
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("Element not found");
        }



        System.out.println("________________________________");

        int[][] mat1 = {{1,0},{0,1}}, mat2 = {{1,0},{0,1}}, matsoln;
        matsoln = new int[mat1.length][mat2[0].length];
        for(int i =0; i < mat1.length; i++)
        {
            for(int j = 0; j<mat1[i].length;j++)
            {
                matsoln[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        System.out.println("Solution:");
        for(int i =0; i < mat1.length; i++)
        {
            for(int j = 0; j<mat1[i].length;j++)
            {
                System.out.print(matsoln[i][j]+ " ");
            }
            System.out.println("");
        }

        System.out.println("________________________________");

        int[] c = {1,2,4,5,6};
        int target, soln1 =0, soln2 =0;
        flag =0;
        System.out.println("Enter target:");
        target = sc.nextInt();
        for(int i =0 ; i< c.length;i++)
        {
            for(int j =0 ; j< c.length;j++)
            {
                if(a[i]+a[j]== target)
                {
                    soln1 = a[i];
                    soln2 = a[j];
                    flag = 1;
                    break;
                }
            }
        }

        if(flag ==1)
        {
            System.out.println("solution:"+ soln1 +"+"+soln2+"="+target);
        }
        else
        {
            System.out.println("No solution found.");
        }

        System.out.println("________________________________");

        int[] array = {2,2,3,3,4,4,4,11,11,11,11};
        int dupecheck = array[0];
        for(int i = 1;i < array.length;i++)
        {
            if(dupecheck == array[i])
            {
                array[i] = 0;
            }
            else
            {
                dupecheck = array[i];
            }
        }

        for(int i = 0;i < array.length;i++)
        {
            for(int j = 1;j < array.length-1;j++) {
                if (array[j] == 0) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for(int i = 0 ;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("________________________________");

        int[] d = {1,4,10,-3};
        flag =0;
        System.out.println("Enter target:");
        target = sc.nextInt();
        for(int i =0 ; i< d.length;i++)
        {
            for(int j =0 ; j< d.length;j++)
            {
                if(d[i]+d[j]== target)
                {
                    soln1 = i;
                    soln2 = j;
                    flag = 1;
                    break;
                }
            }
        }

        if(flag ==1)
        {
            System.out.println("solution:"+ soln1 +"+"+soln2);
        }
        else
        {
            System.out.println("No solution found.");
        }

        System.out.println("________________________________");
    }


}
