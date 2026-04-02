import java.util.Scanner;
public class tokomeduro {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        // variabel
        String nama_barang;
        int harga_barang;
        int jumlah_barang;
        int total_harga;
        int uang_bayar;
        int uang_kembali;

        // proses

        System.out.print("Masukkan nama barang: ");
        nama_barang = input.nextLine();

        System.out.print("Masukkan harga barang: ");
        harga_barang = input.nextInt();

        System.out.print("Masukkan jumlah barang: ");
        jumlah_barang = input.nextInt();

        total_harga = harga_barang * jumlah_barang;

        System.out.println("Total harga: " + total_harga);

        System.out.print("Masukkan uang bayar: ");
        uang_bayar = input.nextInt();

        if (uang_bayar >= total_harga) {
            uang_kembali = uang_bayar - total_harga;
            System.out.println("Uang kembali: " + uang_kembali);
        } else {
            System.out.println("Uang bayar tidak cukup.");
        }

        input.close();
    }
}