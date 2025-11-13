package Minggu10.Tugas;

public class Barrier implements IDestroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }
    public int getStrength() {
    return strength;
    }


    @Override
    public void destroyed() {
        strength -= (int)(strength * 0.1);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}
