package es4;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        System.out.println(contoAllaRovescia(20));
    }

    static String contoAllaRovescia(int secondi) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Inserisci il tempo per il conto alla rovescia");
        secondi = Integer.parseInt(scanner.nextLine());


        if (secondi > 20) {
            secondi = 20;
        } else if (secondi < 0) {
            secondi = Math.abs(secondi);
        }

        String report = "";

        for (int i = secondi; i >= 1; i--) {
            if (i % 2 == 0) {
                report += "[OK] Secondo " + i + "\n";
            } else {
                report += "[CHECK] Secondo " + i + "\n";
            }

            if (i == 10) {
                report += "--- SEPARAZIONE STADIO ---\n";
            }
        }


        return report;
    }
}
