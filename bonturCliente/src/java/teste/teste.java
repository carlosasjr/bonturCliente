/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dominio.Cliente;
import java.sql.SQLException;
import persistencia.ClienteDAO;

/**
 *
 * @author Carlos-TP
 */
public class teste {

    public static void main(String[] args) throws SQLException {
        Cliente cli = new Cliente();
        cli.setNome("Carlos");
        cli.setEmail("carlos@teste.com.br");
        cli.setSenha("123");
        cli.setIp("192.0.0.1");

        if (!ClienteDAO.usuarioExiste(cli)) {
            ClienteDAO.inserir(cli);
        }
    }
}
