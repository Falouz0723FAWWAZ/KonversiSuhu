import java.util.Scanner;

public class scanner{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Masukan alas" );
        int alasSegitiga = scanner.nextInt();
        System.out.println("masukan tinggi");
        int tinggi = scanner.nextInt();


        //!Operasi
        int hasil = alasSegitiga*tinggi/2;
        System.out.println("hasil"+" " + hasil);
        

        
        
    }
}