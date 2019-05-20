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

    //INSERE UM OBJETO DO TIPO CLIENTE NO BANCO DE DADOS
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

     //VERIFICA SE O EMAIL  SENHA EXISTE NO BANCO DE DADOS
    //CASO EXISTE, RETORNA TRUE, SENÃO FALSE
    public static Boolean usuarioExiste(Cliente cliente) throws SQLException {
        con = Conexao.getConnection();

        String sql = "SELECT id FROM clientes WHERE email = ?";

        try {
            PreparedStatement pdo = con.prepareStatement(sql);

            pdo.setString(1, cliente.getEmail());

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
    
    
    //VERIFICA SE O EMAIL E A SENHA EXISTE NO BANCO DE DADOS
    //CASO EXISTE, RETORNA UM OBJETO CLIENTE
    public static Cliente fazerLogin(String email, String senha) throws SQLException {
        con = Conexao.getConnection();

        String sql = "SELECT * FROM clientes WHERE email = ? AND senha = ?";

        try {
            PreparedStatement pdo = con.prepareStatement(sql);

            pdo.setString(1, email);
            pdo.setString(2, senha);

            ResultSet lista = pdo.executeQuery();

            if (lista.next()) {
                Cliente cli = new Cliente();
                cli.setId(lista.getInt("id"));
                cli.setNome(lista.getString("nome"));
                
                return cli;
            }

            lista.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;

    }    

}
