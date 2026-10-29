package P4;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================================================================================");
        System.out.println("                              SISTEM PENGELOLAAN NILAI MAHASISWA                                     ");
        System.out.println("=====================================================================================================");
        System.out.print("Input jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] npm = new String[jumlah];
        String[] nama = new String[jumlah];
        char[] huruf = new char[jumlah];
        String[] status = new String[jumlah];
        double[] tugas = new double[jumlah];
        double[] uts = new double[jumlah];
        double[] uas = new double[jumlah];
        double[] akhir = new double[jumlah];

        int lulus = 0, tidakLulus = 0;
        double totalNilai = 0;
        double nilaiTertinggi = Double.MIN_VALUE;
        double nilaiTerendah = Double.MAX_VALUE;


        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("---------------------------------------------");
            System.out.print("NPM : ");
            npm[i] = input.nextLine();
            System.out.print("Nama : ");
            nama[i] = input.nextLine();

            System.out.print("Nilai Tugas : ");
            tugas[i] = input.nextDouble();
            System.out.print("Nilai UTS   : ");
            uts[i] = input.nextDouble();
            System.out.print("Nilai UAS   : ");
            uas[i] = input.nextDouble();

            akhir[i] = (tugas[i] * 0.30) + (uts[i] * 0.30) + (uas[i] * 0.40);

            if (akhir[i] >= 80) {
                huruf[i] = 'A'; status[i] = "LULUS"; lulus++;
            } else if (akhir[i] >= 70) {
                huruf[i] = 'B'; status[i] = "LULUS"; lulus++;
            } else if (akhir[i] >= 60) {
                huruf[i] = 'C'; status[i] = "LULUS"; lulus++;
            } else if (akhir[i] >= 50) {
                huruf[i] = 'D'; status[i] = "TIDAK LULUS"; tidakLulus++;
            } else {
                huruf[i] = 'E'; status[i] = "TIDAK LULUS"; tidakLulus++;
            }

            // Update statistik
            totalNilai += akhir[i];
            if (akhir[i] > nilaiTertinggi) nilaiTertinggi = akhir[i];
            if (akhir[i] < nilaiTerendah) nilaiTerendah = akhir[i];

            input.nextLine(); 
            System.out.println();
        }

        
        System.out.println("=====================================================================================================");
        System.out.println("                                    DAFTAR NILAI MAHASISWA                                           ");
        System.out.println("=====================================================================================================");
        System.out.printf("%-3s %-12s %-25s %-6s %-6s %-6s %-6s %-6s %-12s\n",
                          "No", "NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf", "Status");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-3s %-12s %-25s %-6s %-6s %-6s %-6s %-6s %-12s\n",
                              (i+1), npm[i], nama[i], tugas[i], uts[i], uas[i], akhir[i], huruf[i], status[i]);
        }

        System.out.println("");
        System.out.println("STATISTIK NILAI");
        System.out.println("========================================");
        System.out.println("Jumlah Mahasiswa       : " + jumlah);
        System.out.println("Jumlah Mahasiswa Lulus : " + lulus);
        System.out.println("Jumlah Tidak Lulus     : " + tidakLulus);
        System.out.println("Nilai Tertinggi        : " + nilaiTertinggi);
        System.out.println("Nilai Terendah         : " + nilaiTerendah);
        System.out.println("Rata-rata Kelas        : " + (totalNilai/jumlah));
    }
}
