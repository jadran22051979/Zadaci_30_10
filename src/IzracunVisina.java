import java.util.Scanner;

public class IzracunVisina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Definiranje broja unosa visina
        int brojVisina = 10;
        //Polje tipa double koje ima 10 unosa
        double[] visine = new double[brojVisina];
        double suma = 0.0;

        System.out.println("Unesite visinu :" + brojVisina + "\tljudi u metrima");
        try {
            for (int i = 0; i < brojVisina; i++) {
                //U ispisu će ići od visine 1
                System.out.println((i + 1) + " \t Visina : ");
                //Punjenje polja visine tipa double s unosima
                visine[i] = Double.parseDouble(sc.nextLine());
                //U slučaju da je visina manja od 0.0 i veća od 2.5 ispisujemo poruku
                if (visine[i] <= 0.0 || visine[i] > 2.5) {
                    System.out.println("\n Molimo unesite visinu veću od 0.0 i manju od 2.5 metara");
                    //Umanji i za 1 tj.traži ponovni unos za unos i
                    i--;
                    //Idi u slijedeću iteraciju
                    continue;
                }

                //Suma je zbroj visina koje će nam kasnije služiti za izračun prosjeka itd
                suma += visine[i];
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Pogreška u unosu!Molimo unesite brojčanu vrijednost!");
        }
        //Prosječna visina
        double proscjenaVisina = suma / brojVisina;
        System.out.println("\nProsječna visina = " + proscjenaVisina + " metara");

        //Najniža visina
        double minimalnaVisina = visine[0];
        for (int i = 1; i < brojVisina; i++) {
            if (visine[i] < minimalnaVisina) {
                minimalnaVisina = visine[i];
            }
        }
        System.out.println("Najniža visina  = " + minimalnaVisina + " metara");

        //Najvisa visina
        double najvisaVisina = visine[0];
        for (int i = 1; i < brojVisina; i++) {
            if (visine[i] > najvisaVisina) {
                najvisaVisina = visine[i];
            }
        }
        System.out.println("Najviša visina je = " + najvisaVisina + " metara");

        //Dio za izračun studenata iznad prosječne visine
        int brojacIznadProsjeka = 0;
        for (int i = 1; i < brojVisina; i++) {
            if (visine[i] > proscjenaVisina) {
                brojacIznadProsjeka++;
            }
        }
        System.out.println("Broj studenata iznad prosječne visine je = " + brojacIznadProsjeka);

        //Dio za izračun studenata iznad  visine od 1.75 metara
        int visinaManjaOd = 0;
        double visinaTrazena = 1.75;
        for (int i = 1; i < brojVisina; i++) {
            if (visine[i] < visinaTrazena) {
                visinaManjaOd++;
            }
        }
        System.out.println("Broj studenata ispod  visine od 1,75 metara je = " + visinaManjaOd);

        sc.close();

    }

}
