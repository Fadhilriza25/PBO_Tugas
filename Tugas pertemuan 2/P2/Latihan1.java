package P2;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Tahun;
        System.out.print("Masukan Tahun (1909 - 2024) : ");
        Tahun = input.nextInt();
        
        if (Tahun < 1909 || Tahun > 2024){
            System.out.println("Tahun yang anda input tidak masuk dalam range");
        } else {
            if (Tahun % 4 == 0){
                System.out.println(Tahun + " adalah tahun kabisat");
            } else {
                System.out.println(Tahun + " bukan tahun kabisat");
            }              
        }
    }
}
