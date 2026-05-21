import java.util.Scanner;

public class minggu9 {

    // 1. Fungsi luas persegi panjang
    static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    // 2. Fungsi factorial (rekursif)
    static double factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 3. Overloading: hitung(int, int) → penjumlahan
    static double hitung(int a, int b) {
        return a + b;
    }

    // 3. Overloading: hitung(double, double) → perkalian
    static double hitung(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // === 1. Luas Persegi Panjang ===
        System.out.println("=== Luas Persegi Panjang ===");
        System.out.print("Masukkan panjang : ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar   : ");
        double lebar = sc.nextDouble();
        double luas = luasPersegiPanjang(panjang, lebar);
        System.out.println("Hasil Luas       : " + luas);

        // === 2. Factorial ===
        System.out.println("\n=== Factorial ===");
        System.out.print("Masukkan bilangan n : ");
        int n = sc.nextInt();
        double hasil = factorial(n);
        System.out.println(n + "! = " + hasil);

        // === 3. Hitung - Penjumlahan (int) ===
        System.out.println("\n=== Hitung Penjumlahan (int) ===");
        System.out.print("Masukkan a (int) : ");
        int a = sc.nextInt();
        System.out.print("Masukkan b (int) : ");
        int b = sc.nextInt();
        double jumlah = hitung(a, b);
        System.out.println("Hasil Penjumlahan : " + jumlah);

        // === 3. Hitung - Perkalian (double) ===
        System.out.println("\n=== Hitung Perkalian (double) ===");
        System.out.print("Masukkan a (double) : ");
        double x = sc.nextDouble();
        System.out.print("Masukkan b (double) : ");
        double y = sc.nextDouble();
        double kali = hitung(x, y);
        System.out.println("Hasil Perkalian : " + kali);

        sc.close();
    }
}
