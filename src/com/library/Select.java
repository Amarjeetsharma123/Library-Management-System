/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.library;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author wasim
 */
public class Select
{
public static ResultSet getData(String query)
{
   ResultSet rs=null;
try
{
Connection con=ConnectToDb.connect();
PreparedStatement p=con.prepareStatement(query);
rs=p.executeQuery();
}
catch(SQLException e)
{
JOptionPane.showMessageDialog(null, e);
}
return rs;
}
}
