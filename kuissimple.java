import java.util.Scanner;
public class kuiskasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int jumlah;
        do {
            System.out.print("Masukkan jumlah produk terjual (0 untuk selesai): ");
            jumlah = input.nextInt();
            if (jumlah != 0) {
                total += jumlah;
            }
        } while (jumlah != 0);
        System.out.println("Total produk terjual: " + total);
    }
}
 
