import java.util.Scanner;

public class KelilingSegitigaSiku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sisi_a, sisi_b, sisi_c, keliling;

        System.out.println("*** KELILING SEGITIGA SIKU - SIKU ***");

        System.out.print("Masukkan panjang alas : ");
        sisi_a = input.nextDouble();
        System.out.print("Masukkan panjang tinggi : ");
        sisi_b = input.nextDouble();
        
        // System.out.print("Masukkan panjang sisi C : ");
        // sisi_c = input.nextDouble();

        sisi_c = Math.sqrt( Math.pow(sisi_a,2) + Math.pow(sisi_b,2) );

        keliling = sisi_a + sisi_b + sisi_c;
        System.out.println("Keliling Segitiga adalah "+ keliling);

    }
}
