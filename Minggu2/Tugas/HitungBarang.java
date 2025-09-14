public class HitungBarang {
    public int hitungHargaJual(Barang barang) {
        return (int)(barang.hargaDasar - (barang.diskon / 100 * barang.hargaDasar));
    }

    public void tampilData(Barang barang) {
        System.out.println("Kode Barang   : " + barang.kode);
        System.out.println("Nama Barang   : " + barang.namaBarang);
        System.out.println("Harga Dasar   : Rp" + barang.hargaDasar);
        System.out.println("Diskon        : " + barang.diskon + "%");
        System.out.println("Harga Jual    : Rp" + hitungHargaJual(barang));
    }
}