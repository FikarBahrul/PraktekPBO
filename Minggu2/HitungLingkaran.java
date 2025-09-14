package Minggu2;
public class HitungLingkaran {

    public double hitungLuas(Lingkaran lingkaran) {
        return lingkaran.phi * lingkaran.r * lingkaran.r;
    }

    public double hitungKeliling(Lingkaran lingkaran) {
        return 2 * lingkaran.phi * lingkaran.r;
    }
}
