/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mysql.jdbc.Connection;
import dominio.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Carlos-TP
 */
public class ClienteDAO {

    private static Connection con;

    public static void inserir(Cliente cliente) throws SQLException {
        con = Conexao.getConnection();

        String sql = "INSERT INTO clientes (nome, email, senha, status, ip) VALUES (?, ?, ? ,?, ?)";

        PreparedStatement pdo = con.prepareStatement(sql);

        pdo.setString(1, cliente.getNome());
        pdo.setString(2, cliente.getEmail());
        pdo.setString(3, cliente.getSenha());
        pdo.setString(4, "0");
        pdo.setString(5, cliente.getIp());

        pdo.executeUpdate();

        pdo.close();

    }

    public static Boolean usuarioExiste(Cliente cliente) throws SQLException {
        con = Conexao.getConnection();

        String sql = "SELECT id FROM clientes WHERE email = ? AND senha = ?";

        try {
            PreparedStatement pdo = con.prepareStatement(sql);

            pdo.setString(1, cliente.getEmail());
            pdo.setString(2, cliente.getSenha());

            ResultSet lista = pdo.executeQuery();

            if (lista.next()) {
                return true;
            }

            lista.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;

    }

}
