import java.util.Scanner;
public class LuasPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sisi, luas;

        System.out.println("*** LUAS PERSEGI ***");
        System.out.print("Masukkan Sisi :");
        sisi = input.nextDouble();

        luas = sisi * sisi;
        System.out.println("Luas Persegi adalah "+ luas);
    }
}
