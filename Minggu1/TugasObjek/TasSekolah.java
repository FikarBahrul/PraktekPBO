package PraktekPBO.Minggu1.TugasObjek;

public class TasSekolah extends Tas {
    private String jenisSekolah;
    private int jumlahBuku;
    private int barangSekarang = 0;

    public void setJenisSekolah(String newValue) {
        jenisSekolah = newValue;
    }

    public void setJumlahBuku(int newValue) {
        jumlahBuku = newValue;
        barangSekarang = jumlahBuku;
    }

    public void bawaBuku() {
        System.out.println("Tas sekolah " + warna + " membawa " + jumlahBuku + " buku");
    }

    public void tambahBarang(int jumlah) {
        if (barangSekarang + jumlah <= kapasitas) {
            barangSekarang += jumlah;
            System.out.println(jumlah + " barang ditambahkan ke tas. Total barang sekarang: " + barangSekarang);
        } else {
            System.out.println("Tas penuh! Tidak bisa menambahkan " + jumlah + " barang.");
        }
    }

    public void keluarkanBarang(int jumlah) {
        if (barangSekarang >= jumlah) {
            barangSekarang -= jumlah;
            System.out.println(jumlah + " barang dikeluarkan dari tas. Total barang sekarang: " + barangSekarang);
        } else {
            System.out.println("Barang di tas tidak cukup! Hanya tersisa " + barangSekarang + " barang.");
        }
    }

    public void cetakInfo() {
        System.out.println("Tas Sekolah dengan");
        System.out.println("Warna: " + warna);
        System.out.println("Kapasitas: " + kapasitas + " barang");
        System.out.println("Jenis Sekolah: " + jenisSekolah);
        System.out.println("Jumlah Buku: " + jumlahBuku);
        System.out.println("Barang sekarang di tas: " + barangSekarang);
    }
}
