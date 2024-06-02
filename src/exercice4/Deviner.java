package exercice4;

import java.util.*;

import java.util.Scanner;

public class Deviner {

    static final Random random = new Random();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bestscore = 100;
        int partie = 0;

        while (true) {

            int bingo = random.nextInt(100) + 1;
            int coups = 1;
            int guess = 0;

            System.out.println();
            System.out.println("Saissisez des nombres entre 1 et 100 jusqu'à ce que vous deviniez un choix de l'ordinateur.");
            System.out.println("Vous pouvez toujours quitter le programme en entrant le nombre 1000.");
            System.out.println("Bonne chance !");


            while (bingo != guess) {
                System.out.println("Devinez un nombre entre 1 and 100:");
                guess = scanner.nextInt();

                if (guess == 1000) {
                    System.out.println("Au revoir");
                    scanner.close();
                    return;
                } else if (guess < 0 || guess > 100) {
                    System.out.println();
                    System.out.println("Le nombre est pas entre 0 and 100");
                } else if (guess > bingo) {
                    System.out.println();
                    System.out.println("L’entier est supérieur à BINGO");
                    coups += 1;
                } else if (guess < bingo) {
                    System.out.println();
                    System.out.println("L’entier est inférieur à BINGO");
                    coups += 1;
                }
            }

            if (bingo == guess) {
                System.out.println();
                System.out.println("Félicitations !");
                System.out.println("vous avez deviné le numéro en " + coups + " coups");
                partie += 1;
                if (coups < bestscore) {
                    bestscore = coups;
                }

                System.out.println("Une autre partie?");
                System.out.println("1 - oui, bien sur");
                System.out.println("2 - non, ça suffit");
                int answer = scanner.nextInt();

                if (answer == 2) {
                    System.out.println("Bien joué !");
                    System.out.println("Vous avez joué " + partie + " parties.");
                    System.out.println("Le meilleur resultat: " + bestscore);
                    scanner.close();
                    return;

                }
            }
        }
    }
}