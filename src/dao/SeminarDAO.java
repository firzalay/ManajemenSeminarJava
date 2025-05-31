package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

    public static ArrayList<Seminar> getAllSeminar() {
        ArrayList<Seminar> arrayList = new ArrayList<>();
        String query = "SELECT * FROM seminar";

        try (Connection conn = ConnectionProvider.getCon()) {
            PreparedStatement ps = conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_seminar");
                String tema = rs.getString("tema");
                int totalSesi = rs.getInt("total_sesi");
                String tanggal = rs.getString("tanggal");

                Seminar seminar = new Seminar(id, tema, totalSesi, tanggal);
                arrayList.add(seminar);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return arrayList;

    }
}
