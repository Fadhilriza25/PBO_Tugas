package P3;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float panjang = 2l;
        float lebar = 5l;
        float luas = panjang * lebar;
        
        System.out.println("Flowchart 1");
        System.out.print("Luas persegi panjang adalah : " + luas);
        System.out.println("");
        System.out.println("");

        System.out.println("Flowchart 2");
        System.out.print(" Masukan nilai jari-jari : ");
        float jari = input.nextFloat();
        float phi = 3.14f;
        float keliling = 2 * phi * jari;
        float luasl = phi * jari * jari;
        System.out.println("Luas = " + luasl);
        System.out.println("Keliling = " + keliling);
        System.out.println("");
        
        System.out.println("Flowchart 3");
        System.out.print("Masukan nilai jam : ");
        int jam = input.nextInt();
        System.out.print("Masukan nilai menit : ");
        int menit = input.nextInt();
        System.out.print("masukan nilai detik : ");
        int detik = input.nextInt();
        
        int totdet = jam*3600 + menit*60 + detik;
        System.out.println("total detik = " + totdet);
    }
 
}
