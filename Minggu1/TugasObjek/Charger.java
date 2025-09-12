package PraktekPBO.Minggu1.TugasObjek;
public class Charger {
    public String merk;
    public int panjangKabel;
    public int dayaOutput;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setPanjangKabel(int newValue) {
        panjangKabel = newValue;
    }

    public void setDayaOutput(int newValue) {
        dayaOutput = newValue;
    }

    public void IsiDaya() {
        System.out.println("Charger " + merk + " sedang mengisi daya.");
    }

    public void StopIsi() {
        System.out.println("Charger " + merk + " menghentikan pengisian daya.");
    }

    public void cetakInfo() {
        System.out.println("Charger dengan");
        System.out.println("Merk : " + merk);
        System.out.println("Panjang Kabel : " + panjangKabel + " cm");
        System.out.println("Daya Output : " + dayaOutput + " Watt");
    }
}
