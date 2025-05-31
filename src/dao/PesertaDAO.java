package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Peserta;

public class PesertaDAO {
    public static void create(Peserta peserta) {
        String query = "INSERT INTO peserta (nama, email) VALUES (?, ?)";
        try (Connection conn = ConnectionProvider.getCon()) {
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, peserta.getNamaPeserta());
            ps.setString(2, peserta.getEmailPeserta());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getLatestId() {
        int idPeserta = 0;

        String query = "SELECT MAX(id_peserta) as id_peserta FROM peserta";
        try (Connection conn = ConnectionProvider.getCon()) {
            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                idPeserta = rs.getInt("id_peserta");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return idPeserta;
    }
}
