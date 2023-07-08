/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author namit
 */
import java.sql.*;
public class SignupService {
  public static Connection cn = null;
public static Statement st = null;
public static boolean insertUser(String Name,String Email,String Phnno,String Address,String Password){
    try{
        cn = connection.ConnectionDb.getConnection();
        st= cn.createStatement();
        st.executeUpdate("insert into student values('"+Name+"','"+Email+"','"+Phnno+"','"+Address+"','"+Password+"')");
        return true;
        }catch(SQLException se){
            se.printStackTrace();
        }
    return false;
    }
}
