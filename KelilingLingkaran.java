import java.util.Scanner;

public class KelilingLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jari, keliling, phi = 3.14;

        System.out.println("*** KELILING LINGKARAN ***");
        System.out.print("Masukkan Jari - jari :");
        jari = input.nextDouble();

        keliling = 2* phi * jari ;
        System.out.println("Keliling Lingkaran adalah "+ keliling);

    }
}
