package es1;

public class Main {
    static void main(String[] args) {
        System.out.println("Stringa pari o dispari");
        System.out.println(stringaPariDispari("ciao"));
        System.out.println(stringaPariDispari("cia"));

        System.out.println("\n");

        System.out.println("Anno bisestile");
        System.out.println(annoBisestile(1900));
        System.out.println(annoBisestile(2000));
        System.out.println(annoBisestile(2026));
    }

    static boolean stringaPariDispari(String string) {
        if (string.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            return true;
        } else if (anno % 100 == 0) {
            return true;
        } else if (anno % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
