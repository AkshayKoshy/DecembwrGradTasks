package com.assignment;

import java.util.*;

public class task7 {

    static Set<int[]> subArrays = new HashSet<>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> dupeFinder = new HashMap<Character, Integer>();
        String userInput;
        System.out.println("Enter String:");
        userInput = sc.nextLine();
        int nonDupeFound = 0;
        char soln = 0;

        for(int i =0;i<userInput.length();i++)
        {
            if(dupeFinder.containsKey(userInput.charAt(i)))
            {
                dupeFinder.put(userInput.charAt(i),dupeFinder.get(userInput.charAt(i)) + 1);
            }
            else
            {
                dupeFinder.put(userInput.charAt(i), 1);
            }
        }

        for(Character key: dupeFinder.keySet())
        {
            if(dupeFinder.get(key)==1)
            {
                nonDupeFound = 1;
                soln = key;
                break;

            }
        }

        if(soln != 0)
        {
            System.out.println("First non dupe element is "+soln);
        }
        else {
            System.out.println("No non-dupe element found");
        }


        System.out.println("-----------------------------------------------------------");

        String userInput1, userInput2;
        System.out.println("Enter String 1:");
        userInput1 = sc.nextLine();
        System.out.println("Enter String 2:");
        userInput2 = sc.nextLine();
        int overlapCount = 0,overlapCountRev = 0, index = -1, indexRev = -1;

        for(int i= 0;i<userInput1.length();i++)
        {
            overlapCount = 0;
            if(userInput1.charAt(i)== userInput2.charAt(0) && (i+userInput2.length())<= userInput1.length())
            {
                index = i;
                for(int j=0;j<userInput2.length();j++)
                {

                    if(userInput1.charAt(i+j)==userInput2.charAt(j))
                    {
                        overlapCount++;
                    }
                }
            }
            if(overlapCount == userInput2.length())
            {
                break;
            }
        }
//        for(int i= 0;i<userInput1.length();i++)
//        {
//            overlapCountRev = 0;
//            if(userInput1.charAt(i)== userInput1.charAt(0) && (i-userInput2.length())> 0)
//            {
//                indexRev = i;
//                for(int j=userInput2.length()-1,k = 0;j>=0;j--, k++)
//                {
//                    if(userInput1.charAt(i-j)==userInput2.charAt(k))
//                    {
//                        overlapCountRev++;
//                    }
//                }
//            }
//            if(overlapCountRev == userInput2.length())
//            {
//                break;
//            }
//        }

        if(overlapCount == userInput2.length())
        {
            System.out.println("Intersection found at index "+ index);
        }
//        else if(overlapCountRev == userInput2.length())
//        {
//            System.out.println("Intersection(reverse) found at index "+ indexRev);
//        }
        else
        {
            System.out.println("No intersection found.");
        }

        System.out.println("-----------------------------------------------------------");

        HashMap<Character, Integer> dupeFinder1 = new HashMap<Character, Integer>();
        String userInput3;
        System.out.println("Enter String:");
        userInput3 = sc.nextLine();
        int dupeFound = 0;
        soln = 0;

        for(int i =0;i<userInput3.length();i++)
        {
            if(dupeFinder1.containsKey(userInput3.charAt(i)))
            {
                dupeFinder1.put(userInput3.charAt(i),dupeFinder1.get(userInput3.charAt(i)) + 1);
            }
            else
            {
                dupeFinder1.put(userInput3.charAt(i), 1);
            }
        }


        for(Character key: dupeFinder1.keySet())
        {
            if(dupeFinder1.get(key)!=1)
            {
                dupeFound = 1;
                soln = key;
                break;

            }
        }

        if(soln != 0)
        {
            System.out.println("First dupe element is "+soln);
        }
        else {
            System.out.println("No dupe element found");
        }

        System.out.println("-----------------------------------------------------------");

        String userInput4;
        System.out.println("Enter String:");
        userInput4 = sc.nextLine();

        String[] splitString = userInput4.split(" ");
        System.out.println("Size of the string is "+splitString.length);

        System.out.println("-----------------------------------------------------------");

        int toCheckArm,sum = 0, num,temp;
        System.out.println("Enter Number:");
        toCheckArm = sc.nextInt();
        num = toCheckArm;
        while(num >= 10)
        {
            temp = num%10;
            num = num/10;
            sum += temp*temp*temp;
        }

        sum += num*num*num;

        if(sum== toCheckArm)
        {
            System.out.println("It is an armstrong number");
        }
        else
        {
            System.out.println("It is not a armstrong number");
        }

        System.out.println("-----------------------------------------------------------");

        HashMap<Character, Integer> dupeFinder3 = new HashMap<>();
        String userInput5;
        System.out.println("Enter String:");
        userInput5 = sc.next();

        for(int i =0;i<userInput5.length();i++)
        {
            if(dupeFinder3.containsKey(userInput5.charAt(i)))
            {
                dupeFinder3.put(userInput5.charAt(i),dupeFinder3.get(userInput5.charAt(i)) + 1);
            }
            else
            {
                dupeFinder3.put(userInput5.charAt(i), 1);
            }
        }

        System.out.println(dupeFinder3);

        System.out.println("-----------------------------------------------------------");

        String userInput6;
        System.out.println("Enter String:");
        userInput6 = sc.next();


        permutations(userInput6, "");


        System.out.println("-----------------------------------------------------------");

        int[] a = {1,2,5,4,3,6,7,8,11,10};
        System.out.println("Array is:"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Largest element is:"+a[a.length-1]);

        System.out.println("-----------------------------------------------------------");

        String userInput7;
        System.out.println("Enter String:");
        userInput7 = sc.next();


        combinations(userInput6, "");

        System.out.println("-----------------------------------------------------------");

        HashMap<Character, Integer> sortMap = new HashMap<>();
        sortMap.put('z',10);
        sortMap.put('c',11);
        sortMap.put('d',15);
        sortMap.put('b',1);
        sortMap.put('n',2);
        sortMap.put('o',6);

        System.out.println(sortMap);
        System.out.println("By value:");
        sortMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        System.out.println("\nBy key:");
        sortMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("-----------------------------------------------------------");

        int[] b = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array is:"+ Arrays.toString(b));

        int userIntInput;
        System.out.println("Enter number");
        userIntInput = sc.nextInt();

        for(int i =0;i<b.length;i++)
        {
            for(int j =i+1;j<b.length-1;j++)
            {
                int[] temp1 = Arrays.copyOfRange(b,i,j);
                subArrays.add(temp1);
            }
        }
//        subArrays(b,null);
        Set<String> subArraySoln = new HashSet<>();
        for(int[] i: subArrays)
        {
            System.out.println(Arrays.toString(i));
            sum = 0;
            for(int j = 0;j<i.length;j++)
            {
                sum+=i[j];
            }
            if(userIntInput == sum)
            {
                subArraySoln.add(Arrays.toString(i));
            }
        }
        System.out.println(subArraySoln);


    }

//    private static void subArrays(int[] s, int[] answer) {
//
//        subArrays.add(answer);
//        int pre;
//        int[] rest;
//        for(int i =0;i<s.length;i++)
//        {
//            int size = i+(s.length-i);
//            rest = new int[size];
//            pre = s[i];
//            int[] temp = new int[answer.length+1];
//            System.arraycopy(Arrays.copyOfRange(answer,0,answer.length),0,temp,0,answer.length);
//            temp[temp.length-1] = pre;
//            System.arraycopy(Arrays.copyOfRange(s,0,i),0,rest,0,i);
//            System.arraycopy(Arrays.copyOfRange(s,i+1,s.length-1),0,rest,i,(s.length-i));
//            subArrays(rest, temp);
//        }
//    }
    private static void combinations(String s, String answer) {

        System.out.println(answer);
        char pre;
        String rest;
        for(int i =0;i<s.length();i++)
        {
            pre = s.charAt(i);
            rest = s.substring(0,i) + s.substring(i+1);
            combinations(rest, answer+ pre);
        }
    }

    private static void permutations(String s, String answer) {
        if(s.length()==0)
        {
            System.out.println(answer);
            return;
        }
        char pre;
        String rest;
        for(int i =0;i<s.length();i++)
        {
            pre = s.charAt(i);
            rest = s.substring(0,i) + s.substring(i+1);
            permutations(rest, answer+ pre);
        }
    }
}
