package com.citi.sg.recruitment.exercise4.factorial;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author ld41514
 *
 */
public class Main {
    // Complete the factorial function below. <---- HERE
    static int factorial(int n) {

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(factorial(n));
        scanner.close();
    }

}