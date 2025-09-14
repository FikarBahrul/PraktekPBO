package Minggu2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM PEMINJAMAN VIDEO GAME ===\n");
        
        Member member1 = new Member("M001", "Andika");
        Member member2 = new Member("M002", "Rahmat");
        
        System.out.println("Daftar Member:");
        member1.tampilData();
        member2.tampilData();
        System.out.println();
        
        VideoGame game1 = new VideoGame("Limbus Company", 15000);
        VideoGame game2 = new VideoGame("Call of Duty", 20000);
        VideoGame game3 = new VideoGame("Plant vs Zombie : Modern Warfare", 12000);
        
        System.out.println("Daftar Game:");
        game1.tampilData();
        game2.tampilData();
        game3.tampilData();
        System.out.println();
        
        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman(member1, game1, 3);
        TransaksiPeminjaman transaksi2 = new TransaksiPeminjaman(member2, game2, 5);
        TransaksiPeminjaman transaksi3 = new TransaksiPeminjaman(member1, game3, 2);
        
        transaksi1.tampilTransaksi();
        transaksi2.tampilTransaksi();
        transaksi3.tampilTransaksi();
        
        int totalPendapatan = transaksi1.getTotalHarga() + transaksi2.getTotalHarga() + transaksi3.getTotalHarga();
        
        System.out.println("TOTAL PENDAPATAN TOKO: Rp " + totalPendapatan);
    }
}