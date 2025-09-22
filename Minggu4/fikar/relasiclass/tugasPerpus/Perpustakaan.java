package Minggu4.fikar.relasiclass.tugasPerpus;

public class Perpustakaan {
    private String nama;
    private Buku[] daftarBuku;
    private int jumlahBuku = 0;

    public Perpustakaan(String nama, int kapasitas) {
        this.nama = nama;
        this.daftarBuku = new Buku[kapasitas];
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku++] = buku;
        } else {
            System.out.println("Perpustakaan penuh!");
        }
    }

    public void tampilkanBuku() {
        System.out.println("Perpustakaan: " + nama);
        for (Buku buku : daftarBuku) {
            if (buku != null) {
                System.out.println(buku.info());
            }
        }
    }
}
