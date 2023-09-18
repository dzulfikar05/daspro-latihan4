import java.util.Scanner;

public class KelilingPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sisi, keliling;

        System.out.println("*** KELILING PERSEGI ***");
        System.out.print("Masukkan Sisi :");
        sisi = input.nextDouble();

        keliling = 4 * sisi;
        System.out.println("Keliling Persegi adalah "+ keliling);
    }
}
