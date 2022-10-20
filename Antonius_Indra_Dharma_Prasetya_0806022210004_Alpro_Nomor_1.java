import java.util.Scanner;

public class Antonius_Indra_Dharma_Prasetya_0806022210004_Alpro_Nomor_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner format = new Scanner(System.in);
        

        System.out.print("Suhu Celcius : ");
        float Celcius = input.nextFloat();

        System.out.print("Konversi : ");
        String Konversi = format.nextLine();

        if (Konversi.equalsIgnoreCase("K")){
            System.out.println("Suhu Kelvin : " + (Celcius + 273.15));
        } else if (Konversi.equalsIgnoreCase("F")){
            System.out.println("Suhu Fahrenheit : " + ((Celcius * 9 / 5) + 32));
        } else if (Konversi.equalsIgnoreCase("R")){
            System.out.println("Suhu Reamur : " + Celcius*0.8);
        }
    }
}