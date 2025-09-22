package Minggu4.fikar.relasiclass.tugasPerpus;

public class MainPerpus {
    public static void main(String[] args) {

        Penulis p1 = new Penulis("Andrea Hirata");
        Penulis p2 = new Penulis("Tere Liye");

        Buku b1 = new Buku("Edensor", p1);
        Buku b2 = new Buku("Pulang", p2);

        Perpustakaan perpus = new Perpustakaan("Perpustakaan Nasional Republik Indonesia", 5);
        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);

        perpus.tampilkanBuku();

        Anggota a1 = new Anggota("Adam");
        Anggota a2 = new Anggota("Roiyan");
        a1.pinjamBuku(b1);
        a2.pinjamBuku(b1);
        a2.pinjamBuku(b2);
        System.out.println();

        perpus.tampilkanBuku();
    }
}
