package Minggu2;
public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        HitungLingkaran hitung = new HitungLingkaran();

        System.out.println("Jari-jari: " + lingkaran.r);
        System.out.println("Luas Lingkaran: " + hitung.hitungLuas(lingkaran));
        System.out.println("Keliling Lingkaran: " + hitung.hitungKeliling(lingkaran));
    }
}
