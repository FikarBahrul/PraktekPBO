package Minggu4.fikar.relasiclass.tugasPerpus;

public class Buku {
    private String judul;
    private Penulis penulis;
    private boolean tersedia;

    public Buku(String judul, Penulis penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public String info() {
        return "Judul: " + judul +
               "\nPenulis: " + penulis.getNama() +
               "\nStatus: " + (tersedia ? "Tersedia" : "Dipinjam") + "\n";
    }
}
