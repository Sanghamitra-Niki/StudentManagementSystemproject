/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;

/**
 *
 * @author namit
 */
public class Forgotsevice {
 public static Connection cn = null;
 public static Statement st = null;
 public static boolean ForgotPassword(String Name , String Password){
     try{
         cn = connection.ConnectionDb.getConnection();
         st = cn.createStatement();
         st.execute("Update  student set Password = '"+Password+"' where Name = '"+Name+"'");
         return true;
     }catch(SQLException se){
         se.printStackTrace();
     }
     return false;
 }
}
