package br.com.pk.sisbiblio;

import br.com.pk.sisbiblio.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        conn.close();
    }

        
}
