import java.util.Scanner;
//deklarasi class
public class p3pdq1 {
    //deklarasi method main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        System.out.print("Masukkan nama mhs: ");
        String nama = input.nextLine();

        //input jumlah sks yang diambil, menggunakan int karena jumlah sks biasanya berupa bilangan bulat
        System.out.print("Masukkan total SKS yang diambil semester ini: ");
        int sksDiambil = input.nextInt();

        //input IP semester, menggunakan double karena bisa berupa desimal (misal 3.25)
        System.out.print("Masukkan IP semester: ");
        double ip = input.nextDouble(); //ip untuk indeks prestasi, menggunakan double karena bisa berupa desimal

        //validasi IP
        if (ip < 0.00 || ip > 4.00) {
            System.out.println("INVALID");
            input.close();
            return;
            
        }

        //hitung sks maksimal berdasarkan ip
        int sksMaks = hitungSksMaks(ip);
        double ipRounded = Math.round(ip * 100.0) / 100.0; //iprounded untuk membatasi 2 angka di belakang koma

        //output hasil perhitungan
        System.out.println(); //untuk memberikan jarak antara input dan output

        System.out.println("Hasil perhitungan:");
        System.out.println("Nama: " + nama);
        System.out.println("IP semester: " + ipRounded);
        System.out.println("SKS yang mau diambil: " + sksDiambil);
        System.out.println("SKS maksimal berdasarkan IP: " + sksMaks);

        //cek apakah sks yang diambil sesuai dengan aturan
        if (sksDiambil <= sksMaks) {
            System.out.println("Status: SKS sudah sesuai dengan aturan.");
            //jika sks yang diambil sesuai dengan aturan, maka tampilkan pesan "Status: SKS sudah sesuai dengan aturan."
        } else {
            System.out.println("Status: SKS melebihi batas maksimal, kurangi jumlah SKS.");
        }

        input.close();
    }

    //method untuk menghitung sks maksimal berdasarkan ip
    private static int hitungSksMaks(double ip) {
        int ipLevel = (int) ip;
        
        // Menggunakan switch-case untuk menentukan SKS maksimal berdasarkan level IP
        switch (ipLevel) {
            case 4:
            case 3:
                return 24;
            case 2:
                if (ip >= 2.50) {
                    return 22;
                } else if (ip >= 2.00) {
                    return 20;
                } else {
                    return 18;
                }
            case 1:
                if (ip >= 1.50) {
                    return 18;
                } else {
                    return 15;
                }
            default:
                return 15;
        }
    }
}