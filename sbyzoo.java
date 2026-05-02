import java.util.Scanner;

public class sbyzoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variabel
        String[] kategori = new String[10];
        int[] harga = new int[10];
        int[] jumlahBeli = new int[10];

        int n = 0; // jumlah kategori
        int pilihan;

        //proses
        do {
            System.out.println("\n=== Pemesanan Tiket SurabayaZoo ===");
            System.out.println("1. Input Kategori dan Harga");
            System.out.println("2. Input Jumlah Beli");
            System.out.println("3. Lihat Total Bayar");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah kategori: ");
                    n = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Kategori ke-" + (i + 1) + ": ");
                        kategori[i] = input.nextLine();
                        System.out.print("Harga: ");
                        harga[i] = input.nextInt();
                        input.nextLine();
                    }
                    break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.print("Jumlah beli untuk " + kategori[i] + ": ");
                        jumlahBeli[i] = input.nextInt();
                    }
                    break;

                case 3:
                    int total = 0;
                    System.out.println("\n=== Rincian ===");
                    for (int i = 0; i < n; i++) {
                        int subtotal = harga[i] * jumlahBeli[i];
                        System.out.println(kategori[i] + 
                            " -> " + jumlahBeli[i] + " x " + harga[i] + 
                            " = " + subtotal);
                        total += subtotal;
                    }
                    System.out.println("Total Bayar: " + total);
                    break;

                case 4:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);

        input.close();
    }
}
