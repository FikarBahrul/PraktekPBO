package PraktekPBO.Minggu1.TugasObjek;


public class Gunting {
    public String pegangan;
    public String bahan;

    public void setPegangan(String newValue) {
        pegangan = newValue;
    }

    public void setBahan(String newValue) {
        bahan = newValue;
    }

    public void cetakInfo() {
        System.out.println("Gunting dengan");
        System.out.println("Pegangan : " + pegangan);
        System.out.println("menggunakan bahan : "+bahan);
    }
}
