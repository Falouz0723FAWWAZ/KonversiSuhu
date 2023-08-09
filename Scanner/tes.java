import java.util.Scanner;

public class tes {

    public static void main(String[] args) {
        
        Scanner x= new Scanner(System.in);
        
        System.out.println("siapa namamu?");
        String nama = x.nextLine();
        System.out.println("Halo "   + nama);

        System.out.println("asal mana?");
        String asal = x.nextLine();
        System.out.println("kamu berasal dari" + asal);
    }
    
}