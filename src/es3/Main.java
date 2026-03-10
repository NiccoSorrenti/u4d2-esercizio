package es3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = "";

        while (!s.equals(":q")) {
            System.out.println("Inserisci una stringa");
            s = scanner.nextLine();
        }


    }
}
