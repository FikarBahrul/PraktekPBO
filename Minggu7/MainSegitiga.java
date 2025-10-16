package Minggu7;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("=<>= Hitung Total Sudut =<>=");
        System.out.println("Total sudut (1 sudut diketahui): " + segitiga.totalSudut(60));
        System.out.println("Total sudut (2 sudut diketahui): " + segitiga.totalSudut(60, 40));

        System.out.println("\n=<>= Hitung Keliling =<>=");
        System.out.println("Keliling dengan 3 sisi: " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling segitiga siku-siku (a,b): " + segitiga.keliling(3, 4));
    }
}
