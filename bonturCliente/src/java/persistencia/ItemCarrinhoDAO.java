/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mysql.jdbc.Connection;
import dominio.ItemCarrinho;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ItemCarrinhoDAO {

    private static Connection con;

    public static void adicionarItem(ItemCarrinho item) throws SQLException {
        con = Conexao.getConnection();

        String sql = "INSERT INTO carrinho_item (idcarrinho, idproduto, quantidade, pontos, preco, totalitem ) "
                + " VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement pdo = con.prepareStatement(sql);

        pdo.setInt(1, item.getCarrinho().getId());
        pdo.setInt(2, item.getProduto().getId());
        pdo.setInt(3, item.getQuantidade());
        pdo.setInt(4, item.getProduto().getPontos());
        pdo.setDouble(5, Double.parseDouble(item.getProduto().getPreco()));
        pdo.setDouble(6, Double.parseDouble(item.getProduto().getPreco()) * item.getQuantidade());

        pdo.executeUpdate();

        pdo.close();
    }

    public static int countItem(int idCarrinho) throws SQLException {
        con = Conexao.getConnection();

        String sql = "SELECT count(id) count FROM carrinho_item WHERE idcarrinho = ? ";

        PreparedStatement pdo = con.prepareStatement(sql);
        pdo.setInt(1, idCarrinho);

        ResultSet lista = pdo.executeQuery();

        if (lista.next()) {
            return lista.getInt("count");
        }

        lista.close();

        return 0;
    }

    //RETORNA A LISTA COM OS ITENS DO CARRINHO
    public static ArrayList<ItemCarrinho> itemsCarrinhoByCliente(int clienteID) {
        con = Conexao.getConnection();

        ArrayList<ItemCarrinho> items = new ArrayList<>();

        String sql = "SELECT * FROM carrinho_item  "
                + " LEFT JOIN carrinho ON (carrinho.id = carrinho_item.idcarrinho)"
                + " WHERE carrinho.clienteid = ? "
                + " ORDER BY carrinho_item.id";

        try (PreparedStatement pdo = con.prepareStatement(sql)) {

            pdo.setInt(1, clienteID);
            ResultSet lista = pdo.executeQuery();

            while (lista.next()) {
                ItemCarrinho item = new ItemCarrinho();
                item.setId(lista.getInt("id"));
                item.setCarrinho(CarrinhoDAO.getCarrinhobyID(lista.getInt("idcarrinho")));
                item.setProduto(ProdutoDAO.getIDProduto(lista.getInt("idproduto")));
                item.setQuantidade(lista.getInt("quantidade"));
                item.setPontos(lista.getInt("pontos"));
                item.setPreco(lista.getDouble("preco"));
                item.setTotalitem(lista.getDouble("totalitem"));

                items.add(item);
            }

            lista.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return items;

    }
    
    //EXCLUI ITEM DO CARRINHO
    public static void excluirItem(int idItemCarrinho) throws SQLException {
        con = Conexao.getConnection();

        String sql = "DELETE FROM carrinho_item WHERE id = ? ";

        PreparedStatement pdo = con.prepareStatement(sql);
        
        pdo.setInt(1, idItemCarrinho);

        pdo.executeUpdate();

        pdo.close();
    }   
    
    
    //TOTALIZA CARRINHO
    public static double totalizarCarrinho(int idCarrinho) throws SQLException {
        con = Conexao.getConnection();

        String sql = "SELECT SUM(totalitem) total FROM carrinho_item WHERE idcarrinho = ? ";

        PreparedStatement pdo = con.prepareStatement(sql);
        pdo.setInt(1, idCarrinho);

        ResultSet lista = pdo.executeQuery();

        if (lista.next()) {
            return lista.getDouble("total");
        }

        lista.close();

        return 0;
    }  
    
    
    //ALTERA QUANTIDADE DO ITEM DO CARRINHO
    public static void alterarQuantidade(int idItemCarrinho, int qtd) throws SQLException {
        con = Conexao.getConnection();

        String sql = "UPDATE carrinho_item SET quantidade = ?, totalitem = (preco * ?) WHERE id = ? ";

        PreparedStatement pdo = con.prepareStatement(sql);
        pdo.setInt(1, qtd);
        pdo.setInt(2, qtd);
        pdo.setInt(3, idItemCarrinho);

        pdo.executeUpdate();
        
        pdo.close();
    }        

}
