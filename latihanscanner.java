//1. import class
import java.util.Scanner;
public class latihanscanner {
    public static void main(String[] args) {
        //2. deklarasi scanner
        Scanner Scanner = new Scanner(System.in);
        
        //3. input (deklarasi variabel)
        //value dalam variabel harus diberikan nilai default
        String namabarang = "";
        int harga = 0, jumlahbeli = 0, total = 0;

        //teks input
        System.out.print("Masukkan nama barang: "); //println input nya di bawah
        namabarang = Scanner.nextLine(); //nextLine untuk string
        System.out.print("harga barang: ");
        harga = Scanner.nextInt(); //nextInt untuk integer
        System.out.print("jumlah beli: ");
        jumlahbeli = Scanner.nextInt(); //nextInt untuk integer

        //4. output
        total = harga * jumlahbeli;
        System.out.println("Nama barang: " + namabarang);
        System.out.println("Harga barang: " + harga);
        System.out.println("Jumlah beli: " + jumlahbeli);
        System.out.println("Total: " + total);

        System.out.println(); //untuk memberi jarak

        //if else untuk diskon
        //diskon 10% jika total belanja lebih dari 100.000
        //operator perhitungan: + - * / %
        //operator perbandingan: > < >= <= == !=
    

        if (total > 100000) {
            System.out.println("Anda mendapatkan diskon 10%");
            total = total - (total * 10 / 100);
            System.out.println("Total setelah diskon: " + total);
        } else {
            System.out.println("Tidak mendapatkan diskon");
        }


        //5. close scanner
       Scanner.close();

    }
}
