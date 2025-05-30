package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_manajemen_seminar_java",
                    "root", "password");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
