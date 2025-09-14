package Minggu2;

public class Member {
    private String id;
    private String namaMember;
    
    public Member(String id, String namaMember) {
        this.id = id;
        this.namaMember = namaMember;
    }
    
    public String getId() { 
        return id; 
    }
    
    public String getNamaMember() { 
        return namaMember; 
    }
    
    public void tampilData() {
        System.out.println("ID: " + id + ", Nama: " + namaMember);
    }
}
