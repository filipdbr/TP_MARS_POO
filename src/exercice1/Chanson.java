package exercice1;

public class Chanson {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + " kilomètre" + (i > 1 ? "s" : "") + "à pied, ça use, ça use");
            System.out.println(i + " kilomètre" + (i > 1 ? "s" : "") + "à pied ça use les souliers.");
        }
    }
}

