package Minggu10.Tugas;

public class Plant {
    public void doDestroy(IDestroyable d) {
        d.destroyed(); // polymorphism ke zombie atau barrier
    }
}
