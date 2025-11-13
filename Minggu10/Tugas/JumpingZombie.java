package Minggu10.Tugas;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        double healPercent = 0;
        switch(level) {
            case 1: healPercent = 0.3; break;
            case 2: healPercent = 0.4; break;
            case 3: healPercent = 0.5; break;
        }
        health += (int)(health * healPercent);
    }

    @Override
    public void destroyed() {
        health -= (int)(health * 0.01);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie =>\n" + super.getZombieInfo();
    }
}
