package Minggu7;

public class Dosen extends Manusia {

    // Overriding method makan()
    @Override
    public void makan() {
        System.out.println("Dosen makan di Ruangan Dosen...");
    }

    public void lembur() {
        System.out.println("Dosen lembur membuat soal ujian untuk mahasiswa...");
    }
}
