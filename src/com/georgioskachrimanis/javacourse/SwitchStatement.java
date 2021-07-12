package com.georgioskachrimanis.javacourse;

public class SwitchStatement {

    public static void switchStatement(char switchValue) {
        switch (switchValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("The character: " + switchValue + " was found.");
                break;

            default:
                System.out.println("No valid character found!");
                break;
        }
    }
}
