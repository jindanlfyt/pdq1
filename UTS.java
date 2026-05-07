import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah mahasiswa
        int jumlahMahasiswa;
        do {
            System.out.print("Masukkan jumlah mahasiswa (minimal 10): ");
            jumlahMahasiswa = sc.nextInt();
            sc.nextLine(); // Konsumsi newline
            if (jumlahMahasiswa < 10) {
                System.out.println("Minimal 10 mahasiswa!");
            }
        } while (jumlahMahasiswa < 10);

        // Deklarasi array
        String[] nim = new String[jumlahMahasiswa];
        String[] nama = new String[jumlahMahasiswa];
        int[] nilai = new int[jumlahMahasiswa];
        String[] grade = new String[jumlahMahasiswa];

        // Input data mahasiswa
        System.out.println("\n=== INPUT DATA MAHASISWA ===");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("NIM mahasiswa ke-" + (i + 1) + ": ");
            nim[i] = sc.nextLine();

            System.out.print("Nama: ");
            nama[i] = sc.nextLine();

            int nilaiInput;
            do {
                System.out.print("Nilai (0-100): ");
                nilaiInput = sc.nextInt();
                sc.nextLine(); // Konsumsi newline
                if (nilaiInput < 0 || nilaiInput > 100) {
                    System.out.println("Nilai harus antara 0-100!");
                }
            } while (nilaiInput < 0 || nilaiInput > 100);
            nilai[i] = nilaiInput;

            // Tentukan grade
            grade[i] = tentukanGrade(nilai[i]);
            System.out.println();
        }

        // Tampilkan data
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.printf("%-3s| %-10s| %-20s| %-5s| %-5s%n", "No", "NIM", "Nama", "Nilai", "Grade");
        System.out.println("---|------------|----------------------|-------|------");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.printf("%-3d| %-10s| %-20s| %-5d| %-5s%n", (i + 1), nim[i], nama[i], nilai[i], grade[i]);
        }

        // Hitung mahasiswa di bawah grade B
        int jumlahBelumLulus = 0;
        for (String g : grade) {
            if (g.equals("C+") || g.equals("C")) {
                jumlahBelumLulus++;
            }
        }

        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Jumlah mahasiswa: " + jumlahMahasiswa);
        System.out.println("Mahasiswa dengan grade B ke atas: " + (jumlahMahasiswa - jumlahBelumLulus));
        System.out.println("Mahasiswa dengan nilai di bawah grade B: " + jumlahBelumLulus);

        sc.close();
    }

    private static String tentukanGrade(int nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 65) return "B";
        else if (nilai >= 60) return "C+";
        else return "C";
    }
}
