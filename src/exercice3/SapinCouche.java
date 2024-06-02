package exercice3;

import java.util.Scanner;

public class SapinCouche {
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
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < h - i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Vous n'avez pas saisi un nombre valide");
        }
    }
}
