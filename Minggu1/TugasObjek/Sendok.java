package PraktekPBO.Minggu1.TugasObjek;


public class Sendok {
    public String merk;
    public String bahan;
    
    public void setMerk(String newValue) {
        merk = newValue;
    }
    
    public void setBahan(String newValue) {
        bahan = newValue;
    }
    public void cetakStatus() {
        System.out.println("Sendok dengan");
        System.out.println("Merk : " + merk);
        System.out.println("Bahan : " + bahan);
    }
}