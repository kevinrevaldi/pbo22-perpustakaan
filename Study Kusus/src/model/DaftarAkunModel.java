package model;

import entity.DaftarAkunEntity;

import java.util.ArrayList;

public class DaftarAkunModel {
    private ArrayList<DaftarAkunEntity> daftarAkunEntityArrayList;
    public DaftarAkunModel(){
        daftarAkunEntityArrayList= new ArrayList<DaftarAkunEntity>();
    }
    public void insertDataDaftarAkun(DaftarAkunEntity daftarakun){
        daftarAkunEntityArrayList.add(daftarakun);
    }
    public ArrayList<DaftarAkunEntity> getDaftarAkunEntityArrayList(){
        return daftarAkunEntityArrayList;
    }
    public  ArrayList<DaftarAkunEntity> alldatakursus(){
        return daftarAkunEntityArrayList;
    }

    public void view(){
        for(DaftarAkunEntity daftarAkun : daftarAkunEntityArrayList){
            System.out.println("======================");
            System.out.println("ID Akun :"+daftarAkun.getIdakun());
            System.out.println("Nama depan : "+daftarAkun.getNama());
            System.out.println("Alamat : "+daftarAkun.getAlamat());
            System.out.println("Nomer Telephone : "+daftarAkun.getNotlp());
            System.out.println("Password: "+daftarAkun.getPw());
            System.out.println("Kursus: "+daftarAkun.getKursus());
        }
    }

    public int cekData(String idakun, String pw){
        int loop = 0;
        for(DaftarAkunEntity daftarAkunEntity : daftarAkunEntityArrayList){
            if (daftarAkunEntity.getIdakun().equals(idakun) && daftarAkunEntity.getPw().equals(pw)){
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }

    public int search (int index)
    {
        if (index < this.daftarAkunEntityArrayList.size())
            return index;
        else
            return -1;
    }

    public void delete(int index)
    {
        if (search(index)==-1)
        {
            System.out.println("data tidak ditemukan");
        }
        if (index == -1)
        {
            System.out.println("data tidak ditemukan");
        }
        else
        {
            daftarAkunEntityArrayList.remove(index);
            System.out.println("berhasil dihapus");
        }
    }

    public void update( int index, int pilih, String data){
        if (search(index)==-1){
            System.out.println("Data tidak ditemukan");
        }else{
            switch (pilih){
                case 1:
                    daftarAkunEntityArrayList.get(index).setIdakun(data);
                    break;
                case 2:
                    daftarAkunEntityArrayList.get(index).setNama(data);
                    break;
                case 3:
                    daftarAkunEntityArrayList.get(index).setAlamat(data);
                    break;
                case 4:
                    daftarAkunEntityArrayList.get(index).setNotlp(data);
                    break;
                case 5:
                    daftarAkunEntityArrayList.get(index).setPw(data);
                    break;
                case 6:
                    daftarAkunEntityArrayList.get(index).setKursus(data);
                    break;
                default:
            }
        }
    }
    public DaftarAkunEntity showDataAKun (int index){
        return daftarAkunEntityArrayList.get(index);
    }
}
