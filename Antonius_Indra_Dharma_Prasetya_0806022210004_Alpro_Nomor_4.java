import java.util.Scanner;

public class Antonius_Indra_Dharma_Prasetya_0806022210004_Alpro_Nomor_4 {

    public static void main(String[] args) {
        float GajiKotor, Pajak;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Total jam kerja : ");
        int Jam = input.nextInt();
        
        if (Jam > 40){
            GajiKotor = (float) ((40 * 6) + ((Jam-40) * 6 * 1.5));
        } else {
            GajiKotor = (float) (Jam * 6);
        }
        
        if (GajiKotor > 250){
            Pajak = GajiKotor * 12/100;
        } else {
            Pajak = GajiKotor * 10/100;
        }
        System.out.println("Gaji Kotor : " + GajiKotor);
        System.out.println("Pajak : " + Pajak);
        System.out.println("Gaji Bersih : " + (GajiKotor - Pajak));
        
    }
}
