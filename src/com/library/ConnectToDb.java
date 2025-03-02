/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.library;
import java.sql.Connection;

import java.sql.DriverManager;
/**
 *
 * @author wasim
 */
public class ConnectToDb 
{
    static Connection con;
    static Connection connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/loginPage";
            String user="root";
            String pass="12345";
            con=DriverManager.getConnection(url,user,pass);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
            
}
