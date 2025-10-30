import java.util.Scanner;

public class IzracunVisina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brojVisina = 10;
        double[] visine = new double[brojVisina];
        double suma = 0.0;

        System.out.println("Unesite visinu :" + brojVisina + "ljudi u metrima");
        for (int i = 0; i < brojVisina; i++) {
            System.out.println((i + 1) + " \t Visina : ");
            visine[i] = Double.parseDouble(sc.nextLine());
            suma += visine[i];
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

        sc.close();

    }

}
