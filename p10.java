import java.util.Scanner;

public class p10 {

   static void cetakgaris(String garis, int panjang) {
       for (int i = 0; i < panjang; i++) {
           System.out.print(garis);
       }
       System.out.println();
   }

   static void tampilkanmhs(String nama, String nim, double ipk) {
       System.out.println("Nama : " + nama);
       System.out.println("NIM  : " + nim);
       System.out.println("IPK  : " + ipk);
   }

   static void cetaktabel(int angka) {
       for (int i = 1; i <= 10; i++) {
           System.out.println(angka + " x " + i + " = " + (angka * i));
       }
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String garis = "=";
       System.out.print("cetak garis?: ");
       int panjang = sc.nextInt();
       sc.nextLine();
    
       System.out.print("masukkan nama: ");
       String nama = sc.nextLine();
       System.out.print("masukkan nim: ");
       String nim = sc.nextLine();
       System.out.print("masukkan ipk: ");
       double ipk = sc.nextDouble();
       sc.nextLine();

       cetakgaris(garis, panjang);
       System.out.println("none");
       cetakgaris(garis, panjang);
       System.out.println("none");
       cetakgaris(garis, panjang);
       System.out.println("none");

       cetakgaris(garis, panjang);
       tampilkanmhs(nama, nim, ipk);
       cetakgaris(garis, panjang);

       System.out.print("masukkan perkalian: ");
       int angka = sc.nextInt();
       sc.nextLine();

       cetakgaris(garis, panjang);
       tampilkanmhs(nama, nim, ipk);
       cetakgaris(garis, panjang);

       cetaktabel(angka);
       cetakgaris(garis, panjang);

       sc.close();
   }
}
