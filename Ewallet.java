package qone;

import java.util.*;

public class EWallet{
    static Scanner sc = new Scanner(System.in);
    // 1. Deklarasi 3 Arraylist untuk data pengguna
    static ArrayList<String> listOfNama = new ArrayList<>();
    static ArrayList<String> listOfNoHp = new ArrayList<>();
    static ArrayList<Integer> listOfSaldo = new ArrayList<>();
    public static void main(String[] args){
        // 2. Tampilkan menu
        do { 
            // 3. Sout isi menu
            menu();
            System.out.print("Masukkan Nomor Menu : ");
            int opsi = sc.nextInt();
            sc.nextLine(); // JADI NEXTINT ITU SELALU ADA BUG KETIKA HABIS USER MASUKKNO ANGKA E KADANG GA KE INPUT ATUA MALA INPUT SETELA E DI SKIP TERUS CARA NGATASI E KASI SC.NEXTLINE();
            switch(opsi) {
                // 4. Case-case pakai add, set, remove, get dari arraylist
                case 1:
                    tambahPengguna();
                    break;
                case 2:
                    updateSaldo();
                    break;
                case 3:
                    hapusPengguna();
                    break;
                case 4:
                    tampilSaldo();
                    break;
                case 5:
                    System.out.println("Bye !");
                    System.exit(0);
                    break;
                default:
                    break;
                // dan seterusnya sampai case 5
            }
        } while (true);

    }
    public static void menu(){
        System.out.println("Menu E Wallet");
        System.out.println("1. Tambah Pengguna");
        System.out.println("2. Top Up Saldo");
        System.out.println("3. Hapus Pengguna");
        System.out.println("4. Tampilkan Saldo dari Pengguna");
        System.out.println("5. Keluar");
    }
    public static void hapusPengguna(){
        tampilSaldo();
        
        System.out.print("Masukkan nomor urut pengguna yg ingin dihapus ? : ");
        int toDel = sc.nextInt()-1;
        sc.nextLine();

        listOfNama.remove(toDel);
        listOfNoHp.remove(toDel);
        listOfSaldo.remove(toDel);
    }
    public static void tambahPengguna(){
        System.out.print("Berapa Banyak pengguna yang ingin anda input : ");
        int qty = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qty; i++) {
            System.out.print("Nama User ke  - " + (i+1) + " : ");
            String nama = sc.nextLine();
            System.out.print("No Hp User ke - " + (i+1) + " : ");
            String noHp = sc.nextLine();
            System.out.print("Saldo User ke - " + (i+1) + " : ");
            int saldo = sc.nextInt();
            sc.nextLine();

            listOfNama.add(nama);
            listOfNoHp.add(noHp);
            listOfSaldo.add(saldo);
        }
    }
    public static void tampilSaldo(){
        int size = listOfNama.size();
        for (int i = 0; i < size; i++) {
            System.out.println("User - " + (i+1));
            System.out.println("Nama  : "+listOfNama.get(i));
            System.out.println("No Hp : "+listOfNoHp.get(i));
            System.out.println("Saldo : "+listOfSaldo.get(i));
        }
    }
    public static void updateSaldo(){
        if(listOfNama.isEmpty()){ // iki lek semisal gaono data pengguna alias kosong de e bakal exit function alias kode sg nde bawa kaya tampilSaldo dst gaakan jalan.
            System.out.println("Gaada Data Pengguna");
            return;
        }
        tampilSaldo();
        
        System.out.print("Masukkan nomor urut pengguna : ");
        int index = sc.nextInt()-1;
        sc.nextLine();

        System.out.println("User - " + listOfNama.get(index) + ", Saldo : " + listOfSaldo.get(index));

        System.out.print("Masukkan nominal top up saldo : ");
        int newSaldo = sc.nextInt();
        listOfSaldo.set(index, newSaldo + listOfSaldo.get(index));
    }
}
