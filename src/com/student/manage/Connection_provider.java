package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_provider {
    public static Connection createC() {
        Connection con = null;
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // database details
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/student_manage?useSSL=false&serverTimezone=UTC";

            // create the connection
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
