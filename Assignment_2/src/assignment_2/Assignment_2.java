package assignment_2;

import java.io.*;

public class Assignment_2 {
    public static void main(String[] args) {
        try {
            BufferedReader d = new BufferedReader(
                new InputStreamReader(System.in));

            System.out.println("Enter the 1st String:");
            String s = d.readLine();

            // String functions
            int y = s.length();
            System.out.println("Length of string is " + y);

            String z = s.toUpperCase();
            System.out.println("String in upper case: " + z);

            String l = s.toLowerCase();
            System.out.println("String in lower case: " + l);

            if (s.length() > 3) {
                char m = s.charAt(3);
                System.out.println("Character at index 3: " + m);
            }

            String o = s.replace('a', 'b');
            System.out.println("Replaced string: " + o);

            if (s.length() >= 5) {
                String n = s.substring(2, 5);
                System.out.println("Substring from index 2 to 5: " + n);
            }

            System.out.println("Enter the character to find index:");
            String s2 = d.readLine();
            int a = s.indexOf(s2);
            System.out.println("Index of character: " + a);

            System.out.println("Enter the character to find last index:");
            String s3 = d.readLine();
            int b = s.lastIndexOf(s3);
            System.out.println("Last index of character: " + b);

            System.out.println("Enter the 2nd String:");
            String s1 = d.readLine();

            String p = s.concat(s1);
            System.out.println("Concatenated string: " + p);

            boolean b1 = s.equals(s1);
            if (b1) {
                System.out.println("Strings are equal");
            } else {
                System.out.println("Strings are not equal");
            }

            // StringBuffer functions
            StringBuffer sf = new StringBuffer("Coding Atharva");
            System.out.println("String = " + sf);
            System.out.println("Length = " + sf.length());
            System.out.println("Capacity = " + sf.capacity());

            sf.setLength(6);
            System.out.println("After setting length: " + sf);

            sf.setCharAt(0, 'K');
            System.out.println("SetCharAt string: " + sf);

            sf.setCharAt(0, 'C');

            int a1 = 7;
            sf.append(a1);
            System.out.println("Appended string: " + sf);

            sf.insert(6, " Atharva");
            System.out.println("Inserted string: " + sf);

            sf.reverse();
            System.out.println("Reverse string: " + sf);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}