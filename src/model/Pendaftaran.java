package model;

public class Pendaftaran {
    private int idPendaftaran;
    private int idPeserta;
    private int idSeminar;
    private String statusLulus;
    
    public Pendaftaran(int idPeserta, int idSeminar) {
        this.idPeserta = idPeserta;
        this.idSeminar = idSeminar;
    }
    
    public int getIdPendaftaran() {
        return idPendaftaran;
    }
    public void setIdPendaftaran(int idPendaftaran) {
        this.idPendaftaran = idPendaftaran;
    }
    public int getIdPeserta() {
        return idPeserta;
    }
    public void setIdPeserta(int idPeserta) {
        this.idPeserta = idPeserta;
    }
    public int getIdSeminar() {
        return idSeminar;
    }
    public void setIdSeminar(int idSeminar) {
        this.idSeminar = idSeminar;
    }
    public String getStatusLulus() {
        return statusLulus;
    }
    public void setStatusLulus(String statusLulus) {
        this.statusLulus = statusLulus;
    }
}
