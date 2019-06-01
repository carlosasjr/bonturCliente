/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.mysql.jdbc.Connection;
import dominio.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Carlos-TP
 */
public class CategoriaDAO {
    
    private static Connection con;
    
    //LISTA TODAS AS CATEGORIAS DO BANCO DE DADOS
    public static ArrayList<Categoria> listarCategorias(){
        con = Conexao.getConnection();

        ArrayList<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT * FROM categorias ORDER BY descricao";

        try (PreparedStatement pdo = con.prepareStatement(sql)) {
            ResultSet lista = pdo.executeQuery();

            while (lista.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(lista.getInt("id"));
                categoria.setDescricao(lista.getString("descricao"));

                categorias.add(categoria);
            }

            lista.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return categorias;
        
    }
    
}
