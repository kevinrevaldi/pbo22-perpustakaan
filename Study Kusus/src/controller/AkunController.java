package controller;

import entity.DaftarAkunEntity;

import javax.swing.table.DefaultTableModel;

public class AkunController{
    int indexlogin = 0;
    public AkunController(){

    }
    public DaftarAkunEntity getData(){
        return AllObjectModel.daftarAkunModel.showDataAKun(indexlogin);
    }
    public void daftarKursus(String idakun, String nama, String alamat, String notlp, String pw, String kursus){
        AllObjectModel.daftarAkunModel.insertDataDaftarAkun(new DaftarAkunEntity(idakun,nama,alamat,notlp,pw,kursus));
    }

    public void login(String idakun, String pw){
        indexlogin = AllObjectModel.daftarAkunModel.cekData(idakun,pw);
    }
    public void viewAkun(){
        AllObjectModel.daftarAkunModel.view();
    }

    public void hapusakun(int index){
        AllObjectModel.daftarAkunModel.delete(index-1);
    }
    public void editakun(int index, int pilih, String data){
        AllObjectModel.daftarAkunModel.update(index-1,pilih,data);
    }

    public DefaultTableModel daftarkursus(){
        DefaultTableModel dafkurrsus = new DefaultTableModel();
        Object[] kolom ={"No","Id Akun","Nama","Alamat","Password","No.tlp","Kelas"};
        dafkurrsus.setColumnIdentifiers(kolom);
        int size = AllObjectModel.daftarAkunModel.alldatakursus().size();
        for (int i=0;i<size;i++){
            Object [] data = new Object[7];
            data[0] = i+1;
            data[1] = AllObjectModel.daftarAkunModel.alldatakursus().get(i).getIdakun();
            data[2] = AllObjectModel.daftarAkunModel.alldatakursus().get(i).getNama();
            data[3] = AllObjectModel.daftarAkunModel.alldatakursus().get(i).getAlamat();
            data[4] = AllObjectModel.daftarAkunModel.alldatakursus().get(i).getPw();
            data[5] = AllObjectModel.daftarAkunModel.alldatakursus().get(i).getNotlp();
            data[6] = AllObjectModel.daftarAkunModel.alldatakursus().get(i).getKursus();

            dafkurrsus.addRow(data);
        }
        return dafkurrsus;
    }

}
