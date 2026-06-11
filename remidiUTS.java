import java.util.Scanner;

public class remidi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nilai[] = new double[7];
        double akhir;
        String huruf;

        System.out.println("Program Nilai Mhs");

        System.out.print("Nilai Tugas : ");
        nilai[0] = input.nextDouble();

        System.out.print("Nilai Kuis : ");
        nilai[1] = input.nextDouble();

        System.out.print("Nilai Praktikum : ");
        nilai[2] = input.nextDouble();

        System.out.print("Nilai Kolaboratif : ");
        nilai[3] = input.nextDouble();

        System.out.print("Nilai Inovatif : ");
        nilai[4] = input.nextDouble();

        System.out.print("Nilai UTS : ");
        nilai[5] = input.nextDouble();

        System.out.print("Nilai UAS : ");
        nilai[6] = input.nextDouble();

        akhir = (nilai[0] * 15 / 100) +
                (nilai[1] * 5 / 100) +
                (nilai[2] * 20 / 100) +
                (nilai[3] * 10 / 100) +
                (nilai[4] * 10 / 100) +
                (nilai[5] * 20 / 100) +
                (nilai[6] * 20 / 100);

        if (akhir >= 85) {
            huruf = "A";
        } else if (akhir >= 70) {
            huruf = "B";
        } else if (akhir >= 60) {
            huruf = "C";
        } else if (akhir >= 50) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        System.out.println("Nilai Akhir = " + akhir);
        System.out.println("Nilai Huruf = " + huruf);

    }
}
