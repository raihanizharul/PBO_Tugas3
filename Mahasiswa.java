package Nusput.P3_3;

public class Mahasiswa {
    int jumlahMahasiswa=0;
    String nim,nama,grade;
    int nilai;

    public Mahasiswa(String nim,String nama,int nilai){
        this.nim=nim;
        this.nama=nama;
        this.nilai=nilai;
        this.jumlahMahasiswa+=1;
    }
    public int getJumlahMahasiswa(){
        return this.jumlahMahasiswa;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim=nim;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setNilai(int nilai){
        this.nilai=nilai;
    }
    public int getNilai(){
        return nilai;
    }
    
    public void SetGrade(){
        if(getNilai()<=100 && getNilai()>=80){
            setGrade("A");
        }
        else if(getNilai()<=79 && getNilai()>=70){
            setGrade("B");
        }
        else if(getNilai()<=79 && getNilai()>=70){
            setGrade("C");
        }
        else if(getNilai()<=69 && getNilai()>=60){
            setGrade("D");
        }
        else{
            setGrade("E");
        }        
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public String getGrade(){
        return this.grade;
    }
         

    public void infoMahasiswa(){
        System.out.println("NIM\t: "+getNim());
        System.out.println("Nama\t: "+getNama());
        System.out.println("Nilai\t: "+getNilai());
        SetGrade();
        System.out.println("Grade\t: "+getGrade());
    }
}
