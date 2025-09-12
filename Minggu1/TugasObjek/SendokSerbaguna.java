package PraktekPBO.Minggu1.TugasObjek;
interface AdukTeh{
    void adukTeh();
}

interface AmbilMakanan {
    void ambil(int jumlah);
}

public class SendokSerbaguna extends Sendok implements AmbilMakanan, AdukTeh {
    private int jumlahMakanan;
    private String ukuran;

    public void setUkuran(String ukuran) { this.ukuran = ukuran; }
    public void setJumlahMakanan(int jumlah) { this.jumlahMakanan = jumlah; }

    public void ambil(int jumlah) {
        if (jumlahMakanan >= jumlah) {
            jumlahMakanan -= jumlah;
            System.out.println("Sendok " + merk + " mengambil " + jumlah + " porsi.");
            System.out.println("Sisa makanan: " + jumlahMakanan);
        } else {
            System.out.println("Makanan tidak cukup! Hanya tersisa " + jumlahMakanan);
        }
    }

    public void adukTeh() {
        System.out.println("Sendok serbaguna " + merk + " sedang mengaduk teh.");
    }

    public void adukMakanan() {
        System.out.println("Sendok serbaguna " + merk + " sedang mengaduk makanan.");
    }
    public void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Bahan: " + bahan);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Jumlah makanan: " + jumlahMakanan);
    }
}
