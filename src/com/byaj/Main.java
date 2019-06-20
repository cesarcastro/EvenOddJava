package com.byaj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("First number -> ");
        int x = read.nextInt();
        System.out.print("Next number -> ");
        int y = read.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " EVEN");
            } else {
                System.out.println(i + " ODD");
            }
        }
    }
}
