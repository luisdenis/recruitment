package com.citi.sg.recruitment.quiz.result;

public class Main9 {
    public static void main(String args[]) {
        String s1 = "abc";
        String s2 = new String("abc");

        if (s1 == s2)
            System.out.print(1);
        else
            System.out.print(2);

        if (s1.equals(s2))
            System.out.print(3);
        else
            System.out.print(4);
    }
}
