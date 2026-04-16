import java.util.Scanner;
import java.util.ArrayList;

public class besokmaret {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int inputInt = 0;
        double totalHarga = 0;

        System.out.println("Masukkan harga barang yang dibeli: (Masukkan 0 untuk selesai)");
        do {
            int inputUser = inputScanner.nextInt();
            inputInt = inputUser;
            totalHarga += inputInt;
        } while (inputInt != 0);

        System.out.println("Total harga barang yang dibeli: " + totalHarga);

        System.out.print("Ingin menggunakan sistem yang lebih advanced? (y/n) : ");
        String inputString = inputScanner.next();
        ArrayList<String> dataBarang = new ArrayList<>();

        while (inputString.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama barang yang dibeli : ");
            String namaBarang = inputScanner.next();
            System.out.print("Masukkan jumlah barang yang dibeli: ");
            int jumlahBarang = inputScanner.nextInt();
            System.out.print("Masukkan harga barang yang dibeli: ");
            int hargaBarang = inputScanner.nextInt();
            int totalHargaAdvanced = jumlahBarang * hargaBarang;

            dataBarang.add(namaBarang + " = " + jumlahBarang + " x " + hargaBarang + " = " + totalHargaAdvanced);
            System.out.print("Ingin menambah barang lagi? (y/n) : ");
            inputString = inputScanner.next();
        }

        for (String item : dataBarang) {
            System.out.println(item);
        }
    }
}






    inputScanner.close();
    }
}
