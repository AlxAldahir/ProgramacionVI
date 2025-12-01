/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancomexicano;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hdz_6
 */
public class Conexion {
    
    public Connection getConnection(){
        Connection con = null;
        String base = "cuenta";
        String url = "jdbc:mysql://localhost:3306/" + base;
        String user = "root";
        String password = "12345";

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }

        return con;
    }
}
