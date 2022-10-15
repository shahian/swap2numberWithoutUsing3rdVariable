package com.shahian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter X and Y");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("befor swapping\nx=" + x + "\ny=" + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("after swapping\nx=" + x + "\ny=" + y);


    }
}
