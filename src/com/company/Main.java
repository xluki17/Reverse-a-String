package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj napis:");
        String napis = odczyt.nextLine();

        String reverse = "";

        for (int i = napis.length() - 1; i >= 0; i--) {

            reverse = reverse + napis.charAt(i);
        }

        System.out.println("Odwrócony napis to:  " + reverse);

    }
}
