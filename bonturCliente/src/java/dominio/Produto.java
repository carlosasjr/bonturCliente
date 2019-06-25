/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.text.NumberFormat;
import javax.swing.JTextField;

/**
 *
 * @author Carlos-TP
 */
public class Produto {
    private int id;
    private String descricao;
    private String preco;
    private int pontos;
    private String detalhes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() { 
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
    
    
    
}
