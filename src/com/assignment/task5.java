package com.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("________________________________");

        String str = "Consultadd";
        char[] revstr = str.toCharArray();
        int l = str.length()-1;
        for(int i =0;i< str.length();i++,l--)
        {

            revstr[l] = str.charAt(i);
        }

        String rev = String.valueOf(revstr);

        System.out.println(revstr);


        System.out.println("________________________________");

        String str2 = "Consultadd Pvt";
        String[] strchr2 = str2.split(" ");
        String[] revstr2 = new String[strchr2.length];
        for(int i = 0 ;i<strchr2.length; i++)
        {
            char[] revchr2 = new char[strchr2[i].length()];
            l = strchr2[i].length()-1;
            for(int j = 0; j<strchr2[i].length();j++,l--)
            {
                revchr2[l] = strchr2[i].charAt(j);

            }
            revstr2[i] = String.valueOf(revchr2);
        }

        String finalstr = revstr2[0].trim()+ " "+ revstr2[1].trim();

        System.out.println(finalstr);

        System.out.println("________________________________");

        String str31, str32;

        System.out.println("Enter String 1:");
        str31 = sc.nextLine();
        System.out.println("Enter String 2:");
        str32 = sc.nextLine();

        System.out.println("String 1:"+str31);
        System.out.println("String 2:"+str32);

        char[] strchr31 = str31.toCharArray();
        char[] strchr32 = str32.toCharArray();

        Arrays.sort(strchr31);
        Arrays.sort(strchr32);

        int flag = 0;

        if(strchr31.length != strchr32.length)
        {
            System.out.println("THey are not anagrams of each other");
        }
        else
        {
            for(int i =0;i<strchr31.length;i++)
            {
                if(strchr31[i]!=strchr32[i])
                {
                    flag = 1;
                    break;
                }
            }

            if(flag == 1)
            {
                System.out.println("They are not anagrams of each other");
            }
            else
            {
                System.out.println("They are anagrams of each other");
            }
        }

        System.out.println("________________________________");

        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        String str41;
        System.out.println("Enter String:");
        str41 = sc.nextLine();

        for(int i =0;i<str41.length();i++)
        {
            if(count.containsKey(str41.charAt(i)))
            {
                count.put(str41.charAt(i),count.get(str41.charAt(i)) + 1);
            }
            else
            {
                count.put(str41.charAt(i), 1);
            }
        }

        System.out.println(count);

        System.out.println("________________________________");

        HashMap<String, Integer> count1 = new HashMap<String, Integer>();
        count1.put("Vowels", 0);
        count1.put("Consonants", 0);
        String str51;
        System.out.println("Enter String:");
        str51 = sc.nextLine();

        for(int i =0;i<str51.length();i++)
        {
            char temp = str51.toLowerCase().charAt(i);
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
            {
                count1.put("Vowels",count1.get("Vowels") + 1);
            }
            else
            {
                count1.put("Consonants",count1.get("Consonants") + 1);
            }
        }

        System.out.println(count1);

        System.out.println("________________________________");

        String str61, str62;
        System.out.println("Enter String:");
        str61 = sc.nextLine();

        System.out.println("Enter substring:");
        str62 = sc.nextLine();

        int flag1 = 0;

        for(int i =0;i<str61.length();i++)
        {
            flag1 = 0;

            if(str61.charAt(i) == str62.charAt(0))
            {
                if(i == str61.length() - 1)
                {
                    break;
                }
                for(int j = 0; j<str62.length();j++)
                {
                    if(str61.charAt(i+j) == str62.charAt(j))
                    {
                        flag1++;
                    }
                }

            }
            if(flag1 == str62.length())
            {
                break;
            }

        }
        if(flag1 == str62.length())
        {
            System.out.println("String contains substring");
        }
        else
        {
            System.out.println("String does not contain substring");
        }

        System.out.println("________________________________");

        String str71;
        System.out.println("Enter String:");
        str71 = sc.nextLine();
        boolean soln = isUnique(str71);

        System.out.println("The String "+str71+" is an isogram:"+ soln);

        System.out.println("________________________________");

        HashMap<Character, Integer> count3 = new HashMap<Character, Integer>();
        count3.put('{', 0);
        count3.put('[', 0);
        count3.put('(', 0);
        String str81;
        System.out.println("Enter String:");
        str81 = sc.nextLine();
        int flagwrong = 0;

        for(int i =0;i<str81.length();i++)
        {
            if(count3.containsKey(str81.charAt(i)))
            {
                count3.put(str81.charAt(i),count3.get(str81.charAt(i)) + 1);
            }
            else if(str81.charAt(i) == ')')
            {
                count3.put('(',count3.get('(')-1);
            }
            else if(str81.charAt(i) == ']')
            {
                count3.put('[',count3.get('[')-1);
            }
            else if(str81.charAt(i) == '}')
            {
                count3.put('{',count3.get('{')-1);
            }
            else{
                System.out.println("Invalid input");
                flagwrong = 1;
                break;
            }
        }

        flag = 0;
        for(Integer value: count3.values())
        {
            if(value != 0)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 1 && flagwrong == 0)
        {
            System.out.println(" Braces are not balanced");
        }
        else if(flag == 0 && flagwrong == 0)
        {
            System.out.println(" Braces are balanced");
        }
        else
        {
            System.out.println("Invalid input");
        }


        System.out.println("________________________________");
    }

    static boolean isUnique(String s)
    {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();

        for(int i =0;i<s.length();i++)
        {
            if(count.containsKey(s.charAt(i)))
            {
                return false;
            }
            else
            {
                count.put(s.charAt(i), 1);
            }
        }

        return true;
    }
}
