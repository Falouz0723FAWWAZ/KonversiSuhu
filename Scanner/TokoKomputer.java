import java.util.Scanner;

public class TokoKomputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama barang");
        String NamaBarang = input.nextLine();
        System.out.println("Harga Barang");
        double HargaBarang = input.nextDouble();
        System.out.println("Jumlah beli");
        double JumlahBeli = input.nextDouble();
        double Total = HargaBarang*JumlahBeli;
        double diskon = 0.1*Total;
        System.out.println("Masukan pembayaran");
        double Pembayaran = input.nextDouble();
        double kembalian = Pembayaran-(Total-diskon);
        System.out.println("Kembalian "+kembalian);

    }
    
}
