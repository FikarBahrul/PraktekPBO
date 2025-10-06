package Minggu6.tugas;

public class DaftarGajiDemo {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(10);
        
        Dosen dosen1 = new Dosen("D001", "Dr. Rusdi", "Malang");
        dosen1.setSKS(12);
        
        Dosen dosen2 = new Dosen("D002", "Prof. Cecep", "Surabaya");
        dosen2.setSKS(16);

        Dosen dosen3 = new Dosen("D003", "Dr. Zahra", "Solo");
        dosen3.setSKS(14);
        
        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);
        daftar.addPegawai(dosen3);
        
        daftar.printSemuaGaji();
    }
}