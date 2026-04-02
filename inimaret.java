import java.util.Scanner;
public class inimaret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //daftarmember (nama, alamat, no hp)
        String namaMember="", alamat="", nohp="";
        String jawaban = scanner.nextLine();

        //transaksi belanja (nama barang, harga barang, jumlah beli, total harga)
        String namaBarang;
        double hargaBarang = 0, jumlahBeli = 0, totalHarga = 0, diskon = 0, totalBayar = 0;

        //double untuk perhitungan diskon, karena diskon bisa berupa desimal (misal 10% = 0.1)
        //contoh double hargaBarang = 0, jumlahBeli = 0, totalHarga = 0, diskon = 0, totalBayar = 0;

        //ditanyakan mau daftar member atau tidak
        //berikan text input "Apakah Anda ingin mendaftar sebagai member? (ya/tidak): "
        System.out.print("Apakah Anda ingin mendaftar sebagai member? (ya/tidak): ");
        jawaban = scanner.nextLine();

        //cek jawaban user, jawaban ya atau tidak menggunakan if
        //equals = case sensitive (perhatikan huruf besar kecil)
        //equalsIgnoreCase = tidak case sensitive (tidak memperhatikan huruf besar kecil)

        if (jawaban.equalsIgnoreCase("ya")) {
            //jika ya, maka input nama, alamat, no hp
            System.out.print("Masukkan nama: ");
            namaMember = scanner.nextLine();

            System.out.print("Masukkan alamat: ");
            alamat = scanner.nextLine();

            System.out.print("Masukkan no hp: ");
            nohp = scanner.nextLine();
            System.out.print("Apakah Anda ingin lanjut belanja? (ya/tidak): ");
            jawaban = scanner.nextLine();
            if (jawaban.equalsIgnoreCase("ya")) {
                //jika ya, maka input nama barang, harga barang, jumlah beli
                System.out.print("Masukkan nama barang: ");
                namaBarang = scanner.nextLine();

                System.out.print("Masukkan harga barang: ");
                hargaBarang = scanner.nextDouble();

                System.out.print("Masukkan jumlah beli: ");
                jumlahBeli = scanner.nextDouble();

                System.out.println(); //untuk memberi jarak

                totalBayar = hargaBarang * jumlahBeli;
                System.out.println("Total bayar: " + totalBayar);

                //hitung diskon
                if (totalBayar > 100000.0) { //diskon 5% jika total bayar lebih dari 100.000
                    diskon = totalBayar * 0.05 * 0.02;
                } else if (totalBayar > 300000.0) {
                    diskon = totalBayar * 0.1 * 0.2; //diskon 10% jika total bayar lebih dari 300.000
                } else {
                    diskon = 0; //tidak mendapatkan diskon
                }

            }

        } else {
            //jika tidak, maka tampilkan "Selamat Belanja!"
            System.out.println("Selamat Berbelanja!");

        }

        scanner.close();
    }
}