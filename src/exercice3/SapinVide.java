package exercice3;

import java.util.Scanner;

public class SapinVide {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int h = 0;

        do {
            System.out.println("Saisissez la hauteur du sapin (superieur a 1) : ");

            try {
                h = scanner.nextInt();
                if (h <= 1) {
                    System.out.println("Le nombre doit etre superieur a 1 : ");
                }
            } catch (Exception e) {
                System.out.println("Error");
            }

        } while (h <= 1);

        scanner.close();

        int[] stars = new int[h];
        stars[0] = 1; // le premier etoile est toujours 1
        for (int i = 1; i < h; i++) {
            stars[i] = stars[i-1]*2;
        }

        int base = stars[h-1]; // Nombre d'étoiles au niveau le plus bas

        for (int i = 0; i < h; i++) {
            int space = (base-stars[i])/2;

            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j < stars[i]; j++)
                System.out.print("*");

            System.out.println();


        }
    }
}
