import.java.util.Scanner;

public class Antonius_Indra_Dharma_Prasetya_0806022210004_Alpro_Nomor_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Anda : ");
        String Nama = input.nextLine();
        
        System.out.print("Jenis Kelamin (L/P) : ");
        String Jenis = input.nextLine();
        
        System.out.print("Menikah (Y/T)? :");
        String Menikah = input.nextLine();
        
        if (Jenis.equalsIgnoreCase("l")){
            System.out.println("Hello, Mr." + Nama);
        } else if (Jenis.equalsIgnoreCase("P") && Menikah.equalsIgnoreCase("Y")){
            System.out.println("Hello, Mrs. " + Nama);
        } else {
            System.out.println("Hello, Ms. " + Nama);
        }
        
    }
}