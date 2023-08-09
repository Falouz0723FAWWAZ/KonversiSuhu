import java.util.Scanner;

public class kondisi {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.println("Masukan angka anda");
        int number = angka.nextInt();
        if(number < 0){
            System.out.println("Angka ini adalah negatif");
        }

        else if(number > 0){
            System.out.println("Angka ini adalah positif");
        }

        else {
            System.out.println("angka ini adalah 0");
        }
    }
}
