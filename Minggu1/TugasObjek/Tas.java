package PraktekPBO.Minggu1.TugasObjek;

public class Tas {
    public String warna;
    public int kapasitas;

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void setKapasitas(int newValue) {
        kapasitas = newValue;
    }

    public void IsiTas() {
        System.out.println("Tas berwarna " + warna + " sedang diisi barang.");
    }

    public void BarangKeluar() {
        System.out.println("Barang dikeluarkan dari tas berwarna " + warna + ".");
    }

    public void cetakInfo() {
        System.out.println("Tas dengan");
        System.out.println("Warna: " + warna);
        System.out.println("Kapasitas: " + kapasitas + " barang");
    }
}
