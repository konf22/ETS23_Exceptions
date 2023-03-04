package org.campus02.nummerraten;

import java.util.Random;
import java.util.Scanner;

public class NummerRaten {

    public static void main(String[] args) {
        // zufällige Zahl erzeugen, zwischen inkl. 0 und exkl. 10
        int randomNumber = new Random().nextInt(10);

        // initialer input
        int input = -1;

        // Scanner für Benutzereingaben
        Scanner scanner = new Scanner(System.in);

        while (input != randomNumber) {
            System.out.println("Bitte eine Zahl eingeben: ");
            String console = scanner.next();
            try {
                // kritischen Programmcode
                input = parseInput(console);
            } catch (NotANumberException e) {
                // exception fangen
                e.printStackTrace();
            } finally {
                // wird auf jeden fall ausgeführt
                if (input != randomNumber) {
                    System.out.println("Leider nein. Rate weiter");
                }
            }
        }
        System.out.println("Super. Die Zahl wurde erraten");
    }

    private static int parseInput(String text) throws NotANumberException {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new NotANumberException(text + " is not a number", e);
        }
    }
}
