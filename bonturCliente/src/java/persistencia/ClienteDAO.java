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
    
     //ALTERA UM OBJETO DO TIPO CLIENTE NO BANCO DE DADOS 
    public static void alterar(Cliente cliente) throws SQLException {
        con = Conexao.getConnection();

        String sql = "UPDATE clientes SET nome = ?, senha = ?, "
                + "email = ?, endereco = ?, numero = ?, bairro = ?, cidade = ?,"
                + "estado = ?, pais = ?, telefone = ?, celular = ?, observacoes = ?, cpf = ? " 
                + "WHERE id = ?";

        PreparedStatement pdo = con.prepareStatement(sql);

        pdo.setString(1, cliente.getNome());
        pdo.setString(2, cliente.getSenha());
        pdo.setString(3, cliente.getEmail());
        pdo.setString(4, cliente.getEndereco());
        pdo.setString(5, cliente.getNumero());
        pdo.setString(6, cliente.getBairro());
        pdo.setString(7, cliente.getCidade());
        pdo.setString(8, cliente.getUf());
        pdo.setString(9, cliente.getPais());
        pdo.setString(10, cliente.getTelefone());
        pdo.setString(11, cliente.getCelular());
        pdo.setString(12, cliente.getObservacoes());
        pdo.setString(13, cliente.getCpf());
        pdo.setInt(14, cliente.getId());

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
    
    
    //VERIFICA SE O CLIENTE EXISTE NO BANCO DE DADOS PELO ID
    //CASO EXISTE, RETORNA UM OBJETO CLIENTE
    public static Cliente getIDCliente(Integer id) throws SQLException {
        con = Conexao.getConnection();

        String sql = "SELECT * FROM clientes WHERE id = ?";

        try {
            PreparedStatement pdo = con.prepareStatement(sql);

            pdo.setInt(1, id);
   
            ResultSet lista = pdo.executeQuery();

            if (lista.next()) {
                Cliente cli = new Cliente();
                cli.setId(lista.getInt("id"));
                cli.setNome(lista.getString("nome"));
                cli.setSenha(lista.getString("senha"));
                cli.setStatus(lista.getInt("status"));
                cli.setEmail(lista.getString("email"));
                cli.setEndereco(lista.getString("endereco"));
                cli.setNumero(lista.getString("numero"));
                cli.setBairro(lista.getString("bairro"));
                cli.setCidade(lista.getString("cidade"));
                cli.setUf(lista.getString("estado"));
                cli.setPais(lista.getString("pais"));
                cli.setTelefone(lista.getString("telefone"));
                cli.setCelular(lista.getString("celular"));
                cli.setObservacoes(lista.getString("observacoes"));
                cli.setCpf(lista.getString("cpf"));               
                
                return cli;
            }

            lista.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;

    }      

}
