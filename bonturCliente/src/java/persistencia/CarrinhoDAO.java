/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mysql.jdbc.Connection;
import dominio.Carrinho;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class CarrinhoDAO {

    private static Connection con;

    //VERIFICA SE EXISTE UM CARRINHO PARA O CLIENTE
    //SE EXISTIR, DEVOLVE UM OBJETO CARRINHO
    public static Carrinho existeCarrinho(int idCliente) {       
        con = Conexao.getConnection();
         
        String sql = "SELECT * FROM carrinho WHERE clienteid = ? AND status = 1";

        try {
            PreparedStatement pdo = con.prepareStatement(sql);

            pdo.setInt(1, idCliente);

            ResultSet lista = pdo.executeQuery();

            if (lista.next()) {

                Carrinho carrinho = new Carrinho();
                carrinho.setId(lista.getInt("id"));
                carrinho.setClienteId(lista.getInt("clienteid"));
                //carrinho.setFormaPagamento(lista.getString("formapagamento"));
                //carrinho.setObservacoes(lista.getString("observacoes"));
                carrinho.setStatus(lista.getString("status"));
                //carrinho.setTotalPontos(lista.getInt("totalpontos"));
                // carrinho.setValorLiquido(lista.getDouble("valorliquido"));

                return carrinho;
            }

            lista.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    //INSERE UM NOVO CARRINHO
    public static int criarCarrinho(Carrinho carrinho) throws SQLException {
        con = Conexao.getConnection();

        String sql = "INSERT INTO carrinho (clienteid) VALUES (?)";

        PreparedStatement pdo = con.prepareStatement(sql);

        pdo.setInt(1, carrinho.getClienteId());

        pdo.executeUpdate();

        pdo.close();

        return retornaIDCarrinho(carrinho.getClienteId());
    }

    public static int retornaIDCarrinho(int clienteID) throws SQLException {
        String sql = "SELECT max(id) id FROM carrinho WHERE clienteid = ? AND status = 1";

        PreparedStatement pdo = con.prepareStatement(sql);

        pdo.setInt(1, clienteID);

        ResultSet lista = pdo.executeQuery();

        if (lista.next()) {
            return lista.getInt("id");
        }

        lista.close();

        return 0;
    }
    
    public static Carrinho getCarrinhobyID(int idCarrinho) {       
        con = Conexao.getConnection();
         
        String sql = "SELECT * FROM carrinho WHERE id = ?";

        try {
            PreparedStatement pdo = con.prepareStatement(sql);

            pdo.setInt(1, idCarrinho);

            ResultSet lista = pdo.executeQuery();

            if (lista.next()) {

                Carrinho carrinho = new Carrinho();
                carrinho.setId(lista.getInt("id"));
                carrinho.setClienteId(lista.getInt("clienteid"));
                carrinho.setFormaPagamento(lista.getString("formapagamento"));
                carrinho.setObservacoes(lista.getString("observacoes"));
                carrinho.setStatus(lista.getString("status"));
                carrinho.setTotalPontos(lista.getInt("totalpontos"));
                carrinho.setValorLiquido(lista.getDouble("valorliquido"));

                return carrinho;
            }

            lista.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
    

}
