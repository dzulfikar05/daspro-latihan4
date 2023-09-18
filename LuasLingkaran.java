import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jari, luas, phi = 3.14;

        System.out.println("*** LUAS LINGKARAN ***");
        System.out.print("Masukkan Jari - jari :");
        jari = input.nextDouble();

        luas = phi * jari * jari ;
        System.out.println("Luas Lingkaran adalah "+ luas);

    }
}
