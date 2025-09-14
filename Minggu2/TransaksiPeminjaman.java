package Minggu2;

public class TransaksiPeminjaman {
    public Member member;
    public VideoGame game;
    public int lamaSewa;
    public int totalHarga;
    
    public TransaksiPeminjaman(Member member, VideoGame game, int lamaSewa) {
        this.member = member;
        this.game = game;
        this.lamaSewa = lamaSewa;
        this.totalHarga = hitungTotalHarga();
    }
    
    public int hitungTotalHarga() {
        return lamaSewa * game.getHargaSewa();
    }
    
    public void tampilTransaksi() {
        System.out.println("=== TRANSAKSI PEMINJAMAN ===");
        System.out.println("Member: " + member.getNamaMember());
        System.out.println("Game: " + game.getNamaGame());
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Total Harga: Rp " + totalHarga);
        System.out.println("==========================");
    }
    
    public int getTotalHarga() {
        return totalHarga;
    }
}