package com.citi.sg.recruitment.exercise1.comparator;

import java.util.Arrays;
import java.util.Scanner;

//NOT NODIFY
public class Main {

    // NO RUN MAIN
    // EXECUTE JUNIT.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}
