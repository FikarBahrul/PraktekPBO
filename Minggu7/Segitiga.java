package Minggu7;

public class Segitiga {
    private int sudut;

    // hitung total sudut jika hanya diketahui satu sudut (Overload A Parameter 1)
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // hitung total sudut jika diketahui dua sudut (Overload A Parameter 2)
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // hitung keliling dengan tiga sisi (Overload B Parameter 3)
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    //(Pythagoras) (Overload B Parameter 2)
    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return sisiA + sisiB + sisiC;
    }
}