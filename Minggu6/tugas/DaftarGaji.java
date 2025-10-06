package Minggu6.tugas;

public class DaftarGaji {
    Pegawai[] listPegawai;
    int jumlah;
    
    DaftarGaji(int ukuran) {
        listPegawai = new Pegawai[ukuran];
        jumlah = 0;
    }
    
    void addPegawai(Pegawai p) {
        listPegawai[jumlah] = p;
        jumlah++;
    }
    
    void printSemuaGaji() {
        System.out.println("=><><><><= Gaji Dosen =><><><><=");
        for (int i = 0; i < jumlah; i++) {
            Pegawai p = listPegawai[i];
            System.out.println("Nama: " + p.getNama());
            System.out.println("Gaji: Rp " + p.getGaji());
            System.out.println("------------------------");
        }
    }
}