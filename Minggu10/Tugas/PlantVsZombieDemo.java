package Minggu10.Tugas;

import java.util.Scanner;

public class PlantVsZombieDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== GAME: PLANT vs ZOMBIE ===");
        System.out.print("Masukkan health awal Walking Zombie: ");
        int wzHealth = sc.nextInt();
        System.out.print("Masukkan level Walking Zombie (1-3): ");
        int wzLevel = sc.nextInt();

        System.out.print("Masukkan health awal Jumping Zombie: ");
        int jzHealth = sc.nextInt();
        System.out.print("Masukkan level Jumping Zombie (1-3): ");
        int jzLevel = sc.nextInt();

        System.out.print("Masukkan kekuatan Barrier: ");
        int barrierStrength = sc.nextInt();

        boolean gameRunning = true;
        int ronde = 1;

        // Inisialisasi objek tetap
        WalkingZombie wz = new WalkingZombie(wzHealth, wzLevel);
        JumpingZombie jz = new JumpingZombie(jzHealth, jzLevel);
        Barrier b = new Barrier(barrierStrength);
        Plant p = new Plant();

        while (gameRunning) {
            System.out.println("\n=== RONDE " + ronde + " ===");
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);

            // Jika semua zombie mati
            if (wz.health <= 0 && jz.health <= 0) {
                System.out.println("\n Semua zombie mati! Plant menang!");
                break;
            }

            // Jika barrier hancur
            if (b.getStrength() <= 0) {
                System.out.println("\n Barrier hancur! Zombie menang!");
                break;
            }

            // Hanya tampilkan saat zombie menyembuhkan diri
            System.out.println("\nZombie menyembuhkan diri...");
            wz.heal();
            jz.heal();
            System.out.println(wz.getZombieInfo());
            System.out.println(jz.getZombieInfo());

            ronde++;
        }

        System.out.println("\n=== GAME OVER ===");
        sc.close();
    }
}
