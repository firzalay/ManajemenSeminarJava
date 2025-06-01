package model;

public class Kehadiran {
    private int idKehadiran;
    private int idPendaftaran;
    private int sesiKe;
    private String statusKehadiran;
    
    public Kehadiran(int idPendaftaran, int sesiKe, String statusKehadiran) {
        this.idPendaftaran = idPendaftaran;
        this.sesiKe = sesiKe;
        this.statusKehadiran = statusKehadiran;
    }
    
    public int getIdKehadiran() {
        return idKehadiran;
    }
    public void setIdKehadiran(int idKehadiran) {
        this.idKehadiran = idKehadiran;
    }
    public int getIdPendaftaran() {
        return idPendaftaran;
    }
    public void setIdPendaftaran(int idPendaftaran) {
        this.idPendaftaran = idPendaftaran;
    }
    public int getSesiKe() {
        return sesiKe;
    }
    public void setSesiKe(int sesiKe) {
        this.sesiKe = sesiKe;
    }
    public String getStatusKehadiran() {
        return statusKehadiran;
    }
    public void setStatusKehadiran(String statusKehadiran) {
        this.statusKehadiran = statusKehadiran;
    }


}
