package exercice5;

import java.util.Scanner;

public class TailleWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = 0;
        int taille = 0;

        System.out.println("Saisir un âge (1000 pour sortir):");

        try {

            while (age <= 0) {
                age = scanner.nextInt();
                if (age == 1000) {
                    System.out.println("Au revoir");
                    scanner.close();
                    return;
                } if (age < 0) {
                    System.out.println("Ce n'est pas votre vrai âge ;) essayez à nouveau ou saisissez 1000 pour sortir");
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
            scanner.close();
            return;
        }

        System.out.println("Saisir une taille en cm");

        try {

            while (taille <= 0) {
                taille = scanner.nextInt();
                if (taille == 1000) {
                    System.out.println("Au revoir");
                    scanner.close();
                    return;
                } else if (taille < 0) {
                    System.out.println("Ce n'est pas votre taille, c'est impossible ;) essayez à nouveau ou saisissez 1000 pour sortir");
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
            scanner.close();
            return;
        }

        scanner.close();

        if (age > 20 && taille < 100) {
            System.out.println("Vous êtes peut être un nain adulte?");
        } else if (age > 20 && taille > 200) {
            System.out.println("Vous êtes un géant adulte :)");
        } else if (age < 3 && taille < 50) {
            System.out.println("Vous êtes peut être un bébé");
        } else if ((age >= 15 && age <= 18) && (taille > 150 && taille < 180)) {
            System.out.println("Vous êtes un ado !");
        } else {
            System.out.println("Merci pour les infos ;)");
        }

    }
}
