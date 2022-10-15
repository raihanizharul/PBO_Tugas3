package Nusput.P3_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mahasiswa21F extends Mahasiswa {
    Mahasiswa21F(String nim,String nama, int nilai){
        super(nim,nama,nilai);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
        ArrayList<String> lulus= new ArrayList<>();
        ArrayList<String> TidakLulus=new ArrayList<>();
        ArrayList<String> nilaiA=new ArrayList<>();
        ArrayList<String> nilaiB=new ArrayList<>();
        ArrayList<String> nilaiC=new ArrayList<>();
        ArrayList<String> nilaiD=new ArrayList<>();
        ArrayList<String> nilaiE=new ArrayList<>();
        int jumlahLulus=0;
        int jumlahTidakLulus=0;
        int jumlahNilaiA=0;
        int jumlahNilaiB=0;
        int jumlahNilaiC=0;
        int jumlahNilaiD=0;
        int jumlahNilaiE=0;
        double jumlahSemuaNilai=0;
        double Rata2;

        for(int i=0;i<=3;i++){
            System.out.print("Isikan NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Isikan NAMA  : ");
            String nama = sc.nextLine();

            System.out.print("Isikan NILAI : ");
            int nilai = Integer.parseInt(sc.nextLine());

            mhs.add(new Mahasiswa21F(nim,nama,nilai));
            System.out.println("=============================================================");
        }
        if(mhs.get(0).getNilai()>=0 && mhs.get(0).getNilai()<=100 &&
        mhs.get(1).getNilai()>=0 && mhs.get(1).getNilai()<=100 &&
        mhs.get(2).getNilai()>=0 && mhs.get(2).getNilai()<=100 &&
        mhs.get(3).getNilai()>=0 && mhs.get(3).getNilai()<=100
        ){  
            System.out.println("");
            for(int i=0;i<=3;i++){
                mhs.get(i).infoMahasiswa();
                System.out.println("=============================================================");
            }
    
            System.out.println("Jumlah Mahasiswa : "+mhs.size());
            System.out.print("Jumlah Mahasiswa yang Lulus : ");
            for(int i=0;i<=3;i++){
                if(mhs.get(i).getGrade()=="A" || mhs.get(i).getGrade()=="B" || mhs.get(i).getGrade()=="C"){
                    jumlahLulus++;
                    lulus.add(mhs.get(i).getNama());
                }
                else{
                    jumlahTidakLulus++;
                    TidakLulus.add(mhs.get(i).getNama());
                }
            }
            if(jumlahLulus>0){
                System.out.print(jumlahLulus+" yaitu "+Arrays.toString(lulus.toArray()));
            }
            else{
                System.out.print("0");
            }
    
            System.out.println("");
            System.out.print("Jumlah Mahasiswa yang Tidak Lulus : ");
            if(jumlahTidakLulus>0){
                System.out.print(jumlahTidakLulus+" yaitu "+Arrays.toString(TidakLulus.toArray()));
            }
            else{
                System.out.print("0");
            }
    
            System.out.println("");
            for(int i=0;i<=3;i++){
                if(mhs.get(i).getGrade()=="A"){
                    jumlahNilaiA++;
                    nilaiA.add(mhs.get(i).getNama());
                }
                if(mhs.get(i).getGrade()=="B"){
                    jumlahNilaiB++;
                    nilaiB.add(mhs.get(i).getNama());
                }
                if(mhs.get(i).getGrade()=="C"){
                    jumlahNilaiC++;
                    nilaiC.add(mhs.get(i).getNama());
                }
                if(mhs.get(i).getGrade()=="D"){
                    jumlahNilaiD++;
                    nilaiD.add(mhs.get(i).getNama());
                }
                if(mhs.get(i).getGrade()=="E"){
                    jumlahNilaiE++;
                    nilaiE.add(mhs.get(i).getNama());
                }
            }
            if(jumlahNilaiA>0){
                System.out.println("Jumlah Mahasiswa dengan Nilai A = "+jumlahNilaiA+" yaitu "+nilaiA);
            }
            if(jumlahNilaiB>0){
                System.out.println("Jumlah Mahasiswa dengan Nilai B = "+jumlahNilaiB+" yaitu "+nilaiB);
            }
            if(jumlahNilaiC>0){
                System.out.println("Jumlah Mahasiswa dengan Nilai C = "+jumlahNilaiC+" yaitu "+nilaiC);
            }
            if(jumlahNilaiD>0){
                System.out.println("Jumlah Mahasiswa dengan Nilai D = "+jumlahNilaiD+" yaitu "+nilaiD);
            }
            if(jumlahNilaiE>0){
                System.out.println("Jumlah Mahasiswa dengan Nilai E = "+jumlahNilaiE+" yaitu "+nilaiE);
            }
    
            System.out.print("Rata-rata nilai mahasiswa adalah : ");
            jumlahSemuaNilai=mhs.get(0).getNilai()+mhs.get(1).getNilai()+mhs.get(2).getNilai()+mhs.get(3).getNilai();
            Rata2=jumlahSemuaNilai/mhs.size();
            System.out.print(mhs.get(0).getNilai()+"+"+mhs.get(1).getNilai()+"+"+mhs.get(2).getNilai()+"+"+mhs.get(3).getNilai()+" / "+mhs.size()+" = "+Rata2);    
        }
        else{
            System.out.println("Input nilai anda salah");
        }
   }
}
