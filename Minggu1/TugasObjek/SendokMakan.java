package PraktekPBO.Minggu1.TugasObjek;


public class SendokMakan extends Sendok {
    private String ukuran;
    private int jumlahMakanan;
    
    public void setUkuran(String newValue) {
        ukuran = newValue;
    }

    public void setJumlahMakanan(int jumlah) {
        this.jumlahMakanan = jumlah;
    }
    
    public void adukMakanan() {
        System.out.println("Sendok"+ merk + " mengaduk makanan.");
    }
    
    public void ambilMakanan(int jumlahAmbil) {
        if (jumlahMakanan >= jumlahAmbil) {
            jumlahMakanan -= jumlahAmbil;
            System.out.println("Sendok "+merk + " digunakan untuk mengambil " + jumlahAmbil + " buah.");
            System.out.println("Sisa makanan : " + jumlahMakanan + " porsi");
        } else {
            System.out.println("Makanan tidak cukup! Hanya tersisa " + jumlahMakanan + " porsi");
        }
    }
    public void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Bahan: " + bahan);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Jumlah makanan: " + jumlahMakanan);
    }
}
