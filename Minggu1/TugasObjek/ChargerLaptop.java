package PraktekPBO.Minggu1.TugasObjek;

public class ChargerLaptop extends Charger {
    private String tipePort;
    private int maxWatt;
    private int kapasitasBaterai = 100;
    private int bateraiSaatIni = 50;

    public void setTipePort(String newValue) {
        tipePort = newValue;
    }

    public void setMaxWatt(int newValue) {
        maxWatt = newValue;
    }

    public void chargeFast() {
        int tambahDaya = maxWatt / 10;
        if (bateraiSaatIni + tambahDaya > kapasitasBaterai) {
            bateraiSaatIni = kapasitasBaterai;
        } else {
            bateraiSaatIni += tambahDaya;
        }
        System.out.println("Charger laptop " + merk + " mengisi daya cepat " + maxWatt + "W. Baterai sekarang: " + bateraiSaatIni + "%");
    }
    public void cetakInfo() {
        System.out.println("Charger Laptop dengan");
        System.out.println("Merk: " + merk);
        System.out.println("Panjang Kabel: " + panjangKabel + " cm");
        System.out.println("Daya Output: " + dayaOutput + " Watt");
        System.out.println("Tipe Port: " + tipePort);
        System.out.println("Max Watt: " + maxWatt + "W");
        System.out.println("Baterai Saat Ini: " + bateraiSaatIni + "% / Kapasitas: " + kapasitasBaterai + "%");
    }
}
