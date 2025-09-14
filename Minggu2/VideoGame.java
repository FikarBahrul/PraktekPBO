package Minggu2;

public class VideoGame {
    public String namaGame;
    public int hargaSewa;
    
    public VideoGame(String namaGame, int hargaSewa) {
        this.namaGame = namaGame;
        this.hargaSewa = hargaSewa;
    }
    
    public String getNamaGame() { 
        return namaGame; 
    }
    
    public int getHargaSewa() { 
        return hargaSewa; 
    }
    
    public void tampilData() {
        System.out.println("Game: " + namaGame + ", Harga: Rp " + hargaSewa + "/hari");
    }
}