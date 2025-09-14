public class MainBarang {
    public static void main(String[] args) {
        Barang b1 = new Barang("B001", "Laptop Gaming", 15000000, 10);
        HitungBarang hitung = new HitungBarang();

        hitung.tampilData(b1);
    }
}
