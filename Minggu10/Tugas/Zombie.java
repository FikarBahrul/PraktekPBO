package Minggu10.Tugas;

public abstract class Zombie implements IDestroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}
