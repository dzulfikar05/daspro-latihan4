import java.util.Scanner;

public class LuasPersegiPanjang{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang, lebar, luas;

        System.out.println("*** LUAS PERSEGI PANJANG ***");
        System.out.print("Masukkan Panjang :");
        panjang = input.nextDouble();
        
        System.out.print("Masukkan Lebar :");
        lebar = input.nextDouble();

        luas = panjang * lebar;
        System.out.println("Luas Pesegi Panjang adalah "+ luas);

    }
}