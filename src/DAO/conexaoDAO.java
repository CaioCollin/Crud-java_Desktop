package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexaoDAO {

    public Connection conectaBD() {

        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro);
        }

        return conn;
    }

}
