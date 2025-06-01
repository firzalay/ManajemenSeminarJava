package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Pendaftaran;

public class PendaftaranDAO {
    public static void create(Pendaftaran pendaftaran) {
        String query = "INSERT INTO pendaftaran (id_peserta,id_seminar) VALUES (?, ?)";
        try (Connection conn = ConnectionProvider.getCon()) {
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, pendaftaran.getIdPeserta());
            ps.setInt(2, pendaftaran.getIdSeminar());

            ps.executeUpdate();
            System.out.println("Peserta berhasil didaftarkan!");
        } catch (Exception e) {
            System.out.println("Peserta gagal didaftarkan!");
            e.printStackTrace();
        }
    }

    public static int getIdPendaftaran(int idPeserta, int idSeminar) {
        int idPendaftaran = 0;
        String query = "SELECT id_pendaftaran from pendaftaran where id_peserta = " + idPeserta + " AND id_seminar = " + idSeminar;
        try (Connection conn = ConnectionProvider.getCon()) {
            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                idPendaftaran = rs.getInt("id_pendaftaran");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return idPendaftaran;
    }
}
