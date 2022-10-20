import.java.util.Scanner;

public class Antonius_Indra_Dharma_Prasetya_0806022210004_alpro_Nomor_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Angka : ");
        int N = input.nextInt();
        
        if (N % 2 == 0){
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}