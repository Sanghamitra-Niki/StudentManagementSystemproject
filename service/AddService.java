 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author namit
 */
public class AddService {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean Addstudent( String id,String name,String college,String passoutyear,String branch,String course){
        try{
          cn = connection.ConnectionDb.getConnection();
          st = cn.createStatement();
          st.executeUpdate("insert into addstud values('"+id+"','"+name+"','"+college+"','"+passoutyear+"','"+branch+"','"+course+"')");
          return true;
        }catch(SQLException se){
            se.printStackTrace();
        }
        return false;
    }
}
