package exercice2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculette {

    public static void main(String[] args) {

        System.out.println("Saisissez le nombre de valeurs que vous souhaitez calculer :");

        Scanner scanner = new Scanner(System.in); // Initialisation du scanner

        try {
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Le nombre doit être supérieur à 0");
                return; // Sortie si l'entrée est invalide
            }

            double[] tab = new double[n];
            double total = 0;

            for (int i = 0; i < tab.length; i++) {
                System.out.println("Saisissez la valeur " + (i + 1) + " :");
                tab[i] = scanner.nextDouble();
                total += tab[i];
            }

            double moyenne = total / n;

            System.out.println("Le total est : " + total);
            System.out.println("La moyenne est : " + moyenne);

        } catch (InputMismatchException e) {
            System.out.println("Vous n'avez pas saisi un nombre valide");
        } finally {
            scanner.close();
        }
    }
}
