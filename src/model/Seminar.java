package model;

public class Seminar {
    private int id_seminar;
    private String tema;
    private int total_sesi;
    private String tanggal;
    
    public Seminar(String tema, int total_sesi, String tangggal) {
        this.tema = tema;
        this.total_sesi = total_sesi;
        this.tanggal = tangggal;
    }

    public int getId_seminar() {
        return id_seminar;
    }
    public void setId_seminar(int id_seminar) {
        this.id_seminar = id_seminar;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public int getTotal_sesi() {
        return total_sesi;
    }
    public void setTotal_sesi(int total_sesi) {
        this.total_sesi = total_sesi;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    };
}
