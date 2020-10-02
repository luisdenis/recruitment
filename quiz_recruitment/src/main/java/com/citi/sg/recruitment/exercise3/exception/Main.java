package com.citi.sg.recruitment.exercise3.exception;

import java.util.Scanner;

/**
 * 
 * @author ld41514
 *
 */
// do not modify
public class Main {
    // NO RUN MAIN
    // EXECUTE JUNIT.
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        in.close();
    }
}