package org.example;

/**
 * Hello world!
 *
 */

import java.util.Scanner;
public class App
{
    static Scanner scanner = new Scanner(System.in);
    public static String yourName(String name ) {
        return name;
    }


        public static void main(String[] args){
            System.out.println(" Are you "+yourName("AMir"));

            scanner.close();
    }
}