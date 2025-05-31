package model;

public class Peserta {
    private int idPeserta;
    private String namaPeserta;
    private String emailPeserta;
    
    public Peserta(String namaPeserta, String emailPeserta) {
        this.namaPeserta = namaPeserta;
        this.emailPeserta = emailPeserta;
    }

    public int getIdPeserta() {
        return idPeserta;
    }
    public void setIdPeserta(int idPeserta) {
        this.idPeserta = idPeserta;
    }
    public String getNamaPeserta() {
        return namaPeserta;
    }
    public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }
    public String getEmailPeserta() {
        return emailPeserta;
    }
    public void setEmailPeserta(String emailPeserta) {
        this.emailPeserta = emailPeserta;
    }
}
