package PraktekPBO.Minggu1.TugasObjek;

public class GuntingKertas extends Gunting {
    private String jenisKertas;

    public void setJenisKertas(String jenisKertas) {
        this.jenisKertas = jenisKertas;
    }

    public void potongKertas() {
        System.out.println("Berusaha memotong kertas...");
        System.out.println("Kertas "+jenisKertas + " telah terpotong oleh gunting dengan pegangan " + pegangan);
    }

    public String getJenisKertas() {
        return jenisKertas;
    }
    public void cetakInfo() {
        System.out.println("Gunting dengan");
        System.out.println("Pegangan: " + pegangan);
        System.out.println("Bahan: " + bahan);
        System.out.println("Jenis kertas: " + jenisKertas);
    }
}
