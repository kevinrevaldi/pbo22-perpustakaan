package entity;

public class DaftarAkunEntity {
    private String idakun;
    private String nama , alamat , notlp , pw , kursus;

    public String getKursus() {
        return kursus;
    }

    public void setKursus(String kursus) {
        this.kursus = kursus;
    }

    public DaftarAkunEntity(String idakun, String nama, String alamat, String notlp, String pw, String kursus) {
        this.idakun = idakun;
        this.nama = nama;
        this.alamat = alamat;
        this.notlp = notlp;
        this.pw = pw;
        this.kursus = kursus;
    }

    public String getIdakun() {
        return idakun;
    }

    public void setIdakun(String idakun) {
        this.idakun = idakun;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;

    }
}

