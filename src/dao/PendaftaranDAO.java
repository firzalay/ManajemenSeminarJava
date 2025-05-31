package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
