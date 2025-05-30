package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Seminar;

public class SeminarDAO {
    public static void create(Seminar seminar) {
        String query = "INSERT INTO seminar (tema, total_sesi, tanggal) VALUES (?, ?, ?)";
        try (Connection conn = ConnectionProvider.getCon()) {
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, seminar.getTema());
            ps.setInt(2, seminar.getTotal_sesi());
            ps.setString(3, seminar.getTanggal());

            ps.executeUpdate();
            System.out.println("Seminar berhasil ditambahkan!");
        } catch (Exception e) {
            System.out.println("Seminar gagal ditambahkan!");
            e.printStackTrace();
        }
    }
}
