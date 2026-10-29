package TugasPBO3;

import java.util.Scanner;

public class Sepeda {
    int jarakTempuh;
    String sepeda;

 
    void Melaju() {
        jarakTempuh += 10;
        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object sepeda " + sepeda + " Jarak tempuh " + jarakTempuh + " Km");
    }


    void Mundur() {
        jarakTempuh -= 5;
        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object sepeda " + sepeda + " Jarak tempuh " + jarakTempuh + " Km");
    }


    void Berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object sepeda " + sepeda + " Jarak tempuh akhir " + jarakTempuh + " Km");
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        Sepeda mysepeda = new Sepeda();
        mysepeda.jarakTempuh = 0; // mulai dari 0 km

        System.out.print("Masukan merek sepeda : ");
        mysepeda.sepeda = input.nextLine();

        int pilihan;
        do {
            System.out.println("\n=== MENU SEPEDA ===");
            System.out.println("1. Bergerak maju");
            System.out.println("2. Bergerak mundur");
            System.out.println("3. Berhenti");
            System.out.println("0. Exit");
            System.out.print("Pilih aksi: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    mysepeda.Melaju();
                    break;
                case 2:
                    mysepeda.Mundur();
                    break;
                case 3:
                    mysepeda.Berhenti();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}

