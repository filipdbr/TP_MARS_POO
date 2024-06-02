package exercice5;

import java.util.Scanner;

public class TailleDoLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int taille = 0;

        do {
            System.out.println("Saisir un âge (pour sortir entrez 1000) :");
            try {
                age = scanner.nextInt();
                if (age <= 0) {
                    System.out.println("Ce n'est pas votre vrai âge ;) essayez à nouveau (pour sortir entrez 1000");
                }
                if (age == 1000) {
                    System.out.println("Au revoir");
                    scanner.close();
                    return;
                }
            } catch (Exception e) {
                System.out.println("Error");
                scanner.close();
                return;
            }
        } while (age <= 0);

        do {
            System.out.println("Saisir une taille en cm (pour sortir entrez 1000)");
            try {
                taille = scanner.nextInt();
                if (taille <= 0) {
                    System.out.println("C'est pas possible que ce soit ta taille. essayez à nouveau ou saisissez 1000 pour sortir");
                }
                if (taille == 1000) {
                    System.out.println("Au revoir");
                    scanner.close();
                    return;
                }
            } catch (Exception e) {
                System.out.println("Error");
                scanner.close();
                return;
            }
        }  while (taille <= 0);

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
