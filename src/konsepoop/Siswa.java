package konsepoop;

public class Siswa {
    public String Nama = new String();
    public String NIS = new String();
    Siswa(String Nama, String NIS ){
        this.Nama = Nama;
        this.NIS = NIS;
        
        }
    public void print(){
        System.out.println("Nama: "+ this.Nama);
        System.out.println("NIS: "+ this.NIS);
        
    }
    
    
}
