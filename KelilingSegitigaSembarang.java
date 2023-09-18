import java.util.Scanner;

public class KelilingSegitigaSembarang {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // double alas, tinggi, luas;
        double sisi_a, sisi_b, sisi_c, keliling;


        System.out.println("*** KELILING SEGITIGA SEMBARANG ***");

        System.out.print("Masukkan panjang sisi a : ");
        sisi_a = input.nextDouble();
        System.out.print("Masukkan panjang sisi b : ");
        sisi_b = input.nextDouble();
        System.out.print("Masukkan panjang sisi C : ");
        sisi_c = input.nextDouble();

        // sisi_c = Math.sqrt( Math.pow(sisi_a,2) + Math.pow(sisi_b,2) );

        keliling = sisi_a + sisi_b + sisi_c;
        System.out.println("Keliling Segitiga adalah "+ keliling);
    }
}
