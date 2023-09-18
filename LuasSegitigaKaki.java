import java.util.Scanner;

public class LuasSegitigaKaki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alas, tinggi, luas;

        System.out.println("*** LUAS SEGITIGA SIKU - SIKU ***");

        System.out.print("Masukkan alas :");
        alas = input.nextDouble();
        System.out.print("Masukkan tinggi :");
        tinggi = input.nextDouble();

        luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga adalah "+ luas);
    }
}
