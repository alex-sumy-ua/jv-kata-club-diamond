package org.kata3.ui;

import java.util.Scanner;

public class UI {

    private int output;

    public UI() {
        this.output = 1;
    }

    public int getOutput() {
        return output;
    }

    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        String regex;

        System.out.println("""
                
                Please, type the following data
                
                diamond dimension (positive non-zero odd number): """);

        while(true) {
            input = scanner.nextLine();
            regex = "^[13579]$|^[1-9][0-9]*[13579]$";
            if (input.matches(regex)) {
                output = Integer.parseInt(input);
                break;
            }
            System.out.println("Incorrect input. Try again:");
        }

        System.out.println("Thank you! The diamond dimension is " + output);
    }

}
