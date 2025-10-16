package Minggu7;

public class MainManusia {
    public static void main(String[] args) {
        // Dynamic method dispatch
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        System.out.println("<>=<> Objek Dosen <>=<>");
        m1.bernafas();   // panggil method dari superclass
        m1.makan();      // panggil method override milik Dosen

        // Casting untuk akses method spesifik Dosen
        if (m1 instanceof Dosen) {
            ((Dosen) m1).lembur();
        }

        System.out.println("\n=<>= Objek Mahasiswa =<>=");
        m2.bernafas();   // panggil method dari superclass
        m2.makan();      // panggil method override milik Mahasiswa

        // Casting untuk akses method spesifik Mahasiswa
        if (m2 instanceof Mahasiswa) {
            ((Mahasiswa) m2).tidur();
        }
    }
}