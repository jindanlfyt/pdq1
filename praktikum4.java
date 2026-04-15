import java.util.Scanner;
public class Praktikumpertemuan4 {
 static Scanner sc=new Scanner(System.in);
 static int jumlahBarang=0;
 static String dataBarang="";
 static double grandTotal=0;
 public static void main(String[] a){
  int pilihan;
  do{
   System.out.println("SISTEM KASIR INIMARET");
   System.out.println("1. Entri Data Penjualan");
   System.out.println("2. Print Struk");
   System.out.println("3. Keluar");
   System.out.print("Pilih menu: ");
   pilihan=bacaInt();
   if(pilihan==1) entriData();
   else if(pilihan==2) printStruk();
   else if(pilihan==3) System.out.println("Terima kasih! Sampai jumpa.");
   else System.out.println("[!] Pilihan tidak valid.");
  }while(pilihan!=3);
 }

 
 static void entriData(){
  dataBarang=""; grandTotal=0;
  do{
   System.out.print("Jumlah barang yang ingin diinput: ");
   jumlahBarang=bacaInt();
   if(jumlahBarang<=0) System.out.println("[!] Jumlah barang harus lebih dari 0!");
   else if(jumlahBarang>5){ System.out.println("[!] Maksimal 5 barang! Mengatur ke 5."); jumlahBarang=5; }
  }while(jumlahBarang<=0);
  for(int i=1;i<=jumlahBarang;i++){
   System.out.print("Nama Barang: ");
   String nama=sc.nextLine().trim();
   while(nama.isEmpty()){ System.out.print("[!] Nama tidak boleh kosong. Nama Barang: "); nama=sc.nextLine().trim(); }
   int qty;
   do{ System.out.print("Quantity: "); qty=bacaInt(); if(qty<=0) System.out.println("[!] Quantity harus lebih dari 0!"); }while(qty<=0);
   double harga;
   do{ System.out.print("Harga Satuan: Rp "); harga=bacaDouble(); if(harga<=0) System.out.println("[!] Harga harus lebih dari 0!"); }while(harga<=0);
   double subtotal=qty*harga; grandTotal+=subtotal;
   dataBarang+=nama+" "+qty+" "+formatRp(harga)+" "+formatRp(subtotal)+"\n";
   System.out.println("✓ Subtotal "+formatRp(subtotal));
  }
  System.out.println("✓ Semua data berhasil disimpan!");
  System.out.println("Grand Total "+formatRp(grandTotal));
 }
 static void printStruk(){
  if(jumlahBarang==0||dataBarang.isEmpty()){ System.out.println("[!] Belum ada data. Silakan entri data terlebih dahulu."); return; }
  System.out.println("STRUK BELANJA INIMARET");
  System.out.println("Detail Barang:");
  System.out.print(dataBarang);
  System.out.println("TOTAL BELANJA "+formatRp(grandTotal));
 }
 static String formatRp(double n){ long b=(long)n; String s=Long.toString(b); StringBuilder sb=new StringBuilder(); int r=s.length()%3; if(r>0) sb.append(s,0,r); for(int i=r;i<s.length();i+=3){ if(sb.length()>0) sb.append('.'); sb.append(s,i,i+3); } return "Rp "+sb; }
 static int bacaInt(){ while(true){ try{return Integer.parseInt(sc.nextLine().trim()); }catch(NumberFormatException e){ System.out.print("[!] Masukkan angka bulat yang valid: "); }} }
 static double bacaDouble(){ while(true){ try{return Double.parseDouble(sc.nextLine().trim().replace(",",".")); }catch(NumberFormatException e){ System.out.print("[!] Masukkan angka yang valid: "); }} }
}
