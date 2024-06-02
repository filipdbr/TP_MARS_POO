package exercice5;

import java.util.Scanner;

public class Taille {

    public static void main(String[] args) {

        System.out.println("Saisir un âge :");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age <= 0) {
            System.out.println("Ce n'est pas votre vrai âge ;) essayez à nouveau");
        }

        System.out.println("Saisir une taille en cm");

        int taille = scanner.nextInt();

        if (taille <= 0) {
            System.out.println("C'est pas possible que ce soit ta taille");
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
            System.out.println("ok, ok");
        }

    }
}
