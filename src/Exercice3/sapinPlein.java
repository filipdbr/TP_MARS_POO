package Exercice3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sapinPlein {
    public static void main(String[] args) {
        System.out.println("Saisissez la hauteur du sapin (superieur a 1) : ");

        try {
            Scanner scanner = new Scanner(System.in);

            int h = scanner.nextInt();

            if (h <= 1) {
                System.out.println("Le nombre doit être supérieur à 1");
                return;
            }

            scanner.close();

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < h - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Vous n'avez pas saisi un nombre valide");
        }
    }
}
