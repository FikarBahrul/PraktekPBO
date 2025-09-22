package Minggu4.fikar.relasiclass.percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi (String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = null; //jika tidak ada asisten
    }
    public KeretaApi (String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    public String info(){
        String info = "";
        info += "Nama: "+this.nama +"\n";
        info += "Kelas: "+this.kelas +"\n";
        info += "Masinis: "+this.masinis.info() +"\n";
        //info += "Asisten: "+this.asisten.info() +"\n";
        
        //Modifikasi untuk check adanya asisten
        if (this.asisten != null) { 
            info += "Asisten: " + this.asisten.info() + "\n";
        } else {
            info += "(Asisten tidak hadir...)\n";
        }
        return info;
    }
}
