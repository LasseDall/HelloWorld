package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean systemRunning=true;
        double tomme;
        double CM;
        System.out.println("Velkommen til tommeomregneren");
        do { System.out.println("Indtast antal tommer:");Scanner keyboard = new Scanner(System.in);
        tomme=keyboard.nextDouble();
        System.out.println(tomme + " tommer svarer til " + tomme*2.54 + " Cm");}while(systemRunning=true);

    }
}
