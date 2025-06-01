package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Kehadiran;

public class KehadiranDAO {
    public static void create(Kehadiran kehadiran) {
        String query = "INSERT INTO kehadiran (id_pendaftaran, sesi_ke, status_kehadiran) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionProvider.getCon()) {
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, kehadiran.getIdPendaftaran());
            ps.setInt(2, kehadiran.getSesiKe());
            ps.setString(3, kehadiran.getStatusKehadiran());

            ps.executeUpdate();
            System.out.println("Kehadiran berhasil dicatat!");
        } catch (Exception e) {
            System.out.println("Kehadiran gagal dicatat!");
            e.printStackTrace();
        }
    }
}
