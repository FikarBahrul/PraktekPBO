package Minggu3;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Peminjaman: " + donny.getLimitPinjaman());
        
        int pilihan;
        do {
            System.out.println("\n-~- Menu -~-");
            System.out.println("1.Pinjam Uang");
            System.out.println("2.Bayar Angsuran");
            System.out.println("3.Lihat Status Pinjaman");
            System.out.println("4.Keluar");
            System.out.print("Pilih menu: ");
            
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan jumlah uang yang ingin dipinjam: Rp ");
                    int jumlahPinjam = input.nextInt();
                    System.out.println("\nMeminjam uang " + jumlahPinjam + "...");
                    donny.pinjam(jumlahPinjam);
                    System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjaman());
                    break;
                    
                case 2:
                    if (donny.getJumlahPinjaman() == 0) {
                        System.out.println("\nAnda tidak memiliki pinjaman yang harus dibayar.");
                    } else {
                        System.out.println("\nJumlah pinjaman saat ini: Rp " + donny.getJumlahPinjaman());
                        System.out.print("Masukkan jumlah angsuran: Rp ");
                        int jumlahAngsuran = input.nextInt();
                        System.out.println("\nMembayar angsuran " + jumlahAngsuran + "...");
                        donny.angsur(jumlahAngsuran);
                        System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjaman());
                    }
                    break;
                    
                case 3:
                    System.out.println("\n -~- Log Pinjaman -~-");
                    System.out.println("Nama: " + donny.getNama());
                    System.out.println("Limit Pinjaman: Rp " + donny.getLimitPinjaman());
                    System.out.println("Jumlah Pinjaman Saat Ini: Rp " + donny.getJumlahPinjaman());
                    System.out.println("Sisa Limit: Rp " + (donny.getLimitPinjaman() - donny.getJumlahPinjaman()));
                    break;
                    
                case 4:
                    System.out.println("\nKeluar dari program...");
                    break;
                    
                default:
                    System.out.println("\nPilihan anda salah coba silahkan pilih lagi antara 1 sampai 4.");
            }
            
        } while (pilihan != 4);
        
        input.close();
    }
}