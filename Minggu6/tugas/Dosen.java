package Minggu6.tugas;

public class Dosen extends Pegawai {
    int jumlahSKS;
    int TARIF_SKS;
    
    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    
    void setSKS(int sks) {
        this.jumlahSKS = sks;
        this.TARIF_SKS = 70000;
    }
    
    int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}