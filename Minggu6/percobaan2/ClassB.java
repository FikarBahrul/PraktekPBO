package Minggu6.percobaan2;

public class ClassB extends ClassA {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }
    public void getNilaiZ(){
        System.out.println("nilai z: " + z);
    }
    public void getJumlah(){
        //Modified
        System.out.println("jumlah: " + (getX()+getY()+z));
    }
}