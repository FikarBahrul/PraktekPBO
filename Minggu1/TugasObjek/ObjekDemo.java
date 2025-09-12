package PraktekPBO.Minggu1.TugasObjek;

public class ObjekDemo {
    public static void main(String[] args) {
        SendokMakan sendokM = new SendokMakan();
        SendokTeh sendokT = new SendokTeh();
        SendokSerbaguna sendokS = new SendokSerbaguna();
        GuntingKertas gunting = new GuntingKertas();
        ChargerLaptop charger = new ChargerLaptop();
        TasSekolah tas = new TasSekolah();

        //Sendok Makan (Inheritance dari Sendok)
        sendokM.setMerk("Noble");
        sendokM.setBahan("Stainless Steel");
        sendokM.setUkuran("Kecil");
        sendokM.setJumlahMakanan(10);
        sendokM.cetakStatus();
        sendokM.adukMakanan();
        sendokM.ambilMakanan(8);
        sendokM.ambilMakanan(3);

        System.out.println();

        //Sendok Teh (Inheritance dari Sendok)
        sendokT.setMerk("Swan");
        sendokT.setBahan("Plastik");
        sendokT.setBentukGagang("Melengkung");
        sendokT.cetakStatus();
        sendokT.adukTeh();
        
        System.out.println();

        //Sendok Serbaguna (Inheritance dari sendok dengan implementasi dari Sendok Makan dan Sendok Teh/ Multiple Inheritance)
        sendokS.setMerk("Royal");
        sendokS.setBahan("Besi");
        sendokS.setUkuran("Sedang");
        sendokS.setJumlahMakanan(15);
        sendokS.cetakStatus();
        sendokS.adukMakanan();
        sendokS.ambil(5);
        sendokS.adukTeh();

        System.out.println();

        //Gunting Kertas (Inheritance dari Gunting)
        gunting.setPegangan("Plastik");
        gunting.setBahan("Besi");
        gunting.setJenisKertas("HVS A4");
        gunting.cetakInfo();
        gunting.potongKertas();
        
        System.out.println();

        // Charger Laptop (Inheritance dari Charger)
        charger.setMerk("Anker");
        charger.setPanjangKabel(150);
        charger.setDayaOutput(65);
        charger.setTipePort("USB-C");
        charger.setMaxWatt(100);
        charger.cetakInfo();
        charger.IsiDaya();
        charger.chargeFast();
        charger.StopIsi();

        System.out.println();
        
        // Tas Sekolah (Inheritance dari Tas)
        tas.setWarna("Biru");
        tas.setKapasitas(20);
        tas.setJenisSekolah("SMA");
        tas.setJumlahBuku(0);
        tas.cetakInfo();
        tas.IsiTas();
        tas.bawaBuku();
        tas.BarangKeluar();
        tas.tambahBarang(8);
        tas.tambahBarang(15);
        tas.keluarkanBarang(3);
    }
}
