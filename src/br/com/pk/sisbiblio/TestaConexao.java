package br.com.sisbiblio;

import br.com.sisbiblio.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        conn.close();
    }

        
}
