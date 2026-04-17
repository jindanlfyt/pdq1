import java.util.Scanner;
public class kuiskasir {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // variabel
        int totalProdukA = 0;
        int totalProdukB = 0;
        int totalProdukC = 0;
        int pilihan;
        int jumlah;
        
        // proses
        do {
            System.out.println("\n=== Menu Pilihan Produk ===");
            System.out.println("1. Produk A");
            System.out.println("2. Produk B");
            System.out.println("3. Produk C");
            System.out.println("0. Selesai");
            System.out.print("Pilih produk (1/2/3/0): ");
            pilihan = input.nextInt();
            
            if (pilihan == 0) {
                break;
            } else if (pilihan == 1) {
                System.out.print("Masukkan jumlah Produk A: ");
                jumlah = input.nextInt();
                totalProdukA += jumlah;
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah Produk B: ");
                jumlah = input.nextInt();
                totalProdukB += jumlah;
            } else if (pilihan == 3) {
                System.out.print("Masukkan jumlah Produk C: ");
                jumlah = input.nextInt();
                totalProdukC += jumlah;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (true);
        
        System.out.println("\n=== Total Produk Terjual ===");
        System.out.println("Produk A: " + totalProdukA);
        System.out.println("Produk B: " + totalProdukB);
        System.out.println("Produk C: " + totalProdukC);
    }
}
 
