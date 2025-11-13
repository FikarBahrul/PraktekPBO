package Minggu10.Tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        double healPercent = 0;
        switch(level) {
            case 1: healPercent = 0.2; break;
            case 2: healPercent = 0.3; break;
            case 3: healPercent = 0.4; break;
        }
        health += (int)(health * healPercent);
    }

    @Override
    public void destroyed() {
        health -= (int)(health * 0.02);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie =>\n" + super.getZombieInfo();
    }
}
