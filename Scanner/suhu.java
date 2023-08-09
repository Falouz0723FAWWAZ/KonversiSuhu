import java.util.Scanner;

public class suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan celcius");
        double celcius = input.nextDouble();
        System.out.println("masukan suhu");
        int opsi = input.nextInt();
        
        if(opsi == 1){
            double hasilF = (celcius * 9/5) + 32;
            System.out.println("Hasilnya adalah: " + hasilF); 

        }
        else if (opsi == 2){
            double hasilK = celcius + 273.15;
            System.out.println("Hasilnya adalah: " + hasilK);
        }
        else if (opsi == 3){
            double hasilR = celcius * 4/5;
            System.out.println("Hasilnya adalah: " + hasilR);
        }

        else{
            System.out.println("ITU GAK ADA BLOK");
        }

    }    
}
