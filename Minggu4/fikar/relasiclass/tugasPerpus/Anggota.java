package Minggu4.fikar.relasiclass.tugasPerpus;

public class Anggota {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void pinjamBuku(Buku buku) {
        if (buku.isTersedia()) {
            buku.setTersedia(false);
            System.out.println(nama + " meminjam \"" + buku.getJudul() + "\"");
        } else {
            System.out.println("Maaf, buku sudah dipinjam!");
        }
    }
}
