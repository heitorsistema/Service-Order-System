/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.os.dal;

import java.sql.*;

/**
 *
 * @author winhe
 */
public class ModuloConexao {

    /**
     * Método responsável pela conexão com o banco
     *
     * @return conexao
     */
    public static Connection conector() {
        Connection conexao = null;
        // a linha abaixo "chama" o drive
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbos?characterEncoding=utf-8";
        String user = "root";
        String password = "123456";
        // Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            // a linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }
    }
}
