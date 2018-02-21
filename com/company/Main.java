package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter any string");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        recursion(text, text.length() - 1);
    }

    private static void recursion(String line, int lastIndex) {
        if (lastIndex == 0) {
            System.out.println(line.charAt(lastIndex));
            return;
        }
        System.out.print(line.charAt(lastIndex));
        recursion(line, lastIndex - 1);
    }
}
