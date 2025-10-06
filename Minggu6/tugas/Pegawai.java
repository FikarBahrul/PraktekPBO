package Minggu6.tugas;

public class Pegawai {
    String nip;
    String nama;
    String alamat;
    
    Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    String getNama() {
        return nama;
    }
    
    int getGaji() {
        return 0;
    }
}