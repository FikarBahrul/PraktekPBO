package PraktekPBO.Minggu1.TugasObjek;
public class SendokTeh extends Sendok {
    private String bentukGagang;
    
    public void setBentukGagang(String newValue) {
        bentukGagang = newValue;
    }

    public void adukTeh() {
        System.out.println("Mengaduk teh menggunakan Sendok " + merk + " dengan gagang " + bentukGagang);
        System.out.println("Teh teraduk rata dan siap diminum");
    }
    public void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Bahan: " + bahan);
        System.out.println("Bentuk gagang: " + bentukGagang);
    }
}