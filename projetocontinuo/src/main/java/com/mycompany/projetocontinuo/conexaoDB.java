/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetocontinuo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rosan
 */
public class conexaoDB {
    public static Connection con = null;
 
       public static void Conectar() {
       System.out.println("Conectando ao banco...");
       try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/projetocontinuo","root","");
            System.out.println("Conectado.");
       } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
       } catch(SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Erro ao Conectar" + e,"ERRO",JOptionPane.INFORMATION_MESSAGE);
        throw new RuntimeException(e);
    }
    
   }
}
