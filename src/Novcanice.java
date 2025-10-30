import java.util.Scanner;

public class Novcanice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite iznos u eurima za uzvrat \t :");
        double iznosEuri = Double.parseDouble(sc.nextLine());
        // Množenje s 100 za izbjegavanje grešaka
        int ukupnoKovanica = (int) Math.round(iznosEuri * 100);

        double[] kovanice = {500, 200, 100, 50, 20, 10, 5, 2, 1,
                0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        int[] vrijednostKovanica = new int[kovanice.length];
        for (int i = 0; i < kovanice.length; i++) {
            vrijednostKovanica[i] = (int) Math.round(kovanice[i] * 100);
        }

        // Polje za spremanje
        int[] novoPolje = new int[kovanice.length];

        int ostatak = ukupnoKovanica;


        for (int i = 0; i < kovanice.length; i++) {
            if (ostatak >= vrijednostKovanica[i]) {
                novoPolje[i] = ostatak / vrijednostKovanica[i];
                ostatak = ostatak % vrijednostKovanica[i];
            }
        }

        System.out.println("Kovanice i novačnice za iznos u Eurima  :" + iznosEuri + "\t su");
        for (int i = 0; i < kovanice.length; i++) {
            if (novoPolje[i] > 0) {
                if (kovanice[i] >= 1)
                    System.out.println("Broj novčanica od iznosa  : €" + (int) kovanice[i] + "\t su :" + novoPolje[i]);
                else
                    System.out.println("Broj kovanica od iznosa : €" + kovanice[i] + "\t su :" + novoPolje[i]);
            }
        }

        sc.close();
    }
}
