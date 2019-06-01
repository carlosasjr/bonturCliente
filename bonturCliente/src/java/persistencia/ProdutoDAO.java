/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import dominio.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Carlos-TP
 */
public class ProdutoDAO {
    
       private static Connection con;
    
       public static ArrayList<Produto> listarProdutos(int idCategoria){
        con = Conexao.getConnection();

        ArrayList<Produto> produtos = new ArrayList<>();

        String sql = "SELECT * FROM produtos WHERE id_categoria = ? ORDER BY descricao";

        try (PreparedStatement pdo = con.prepareStatement(sql)) {
            
            pdo.setInt(1, idCategoria);
            
            ResultSet lista = pdo.executeQuery();

            while (lista.next()) {
                Produto produto = new Produto();
                produto.setId(lista.getInt("id"));
                produto.setDescricao(lista.getString("descricao"));
                produto.setPreco(lista.getString("preco"));
                produto.setDetalhes(lista.getString("detalhes"));
                produto.setPontos(lista.getInt("pontos"));

                produtos.add(produto);
            }

            lista.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return produtos;
        
    }
    
}
