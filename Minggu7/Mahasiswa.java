package Minggu7;

public class Mahasiswa extends Manusia {

    // Overriding method makan()
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan di kantin milik kampus...");
    }

    public void tidur() {
        System.out.println("Mahasiswa tidak sanggup untuk begadang, mahasiswa tertidur lelap...");
    }
}
