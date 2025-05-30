package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_manajemen_seminar_java?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                    "root", "password");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
