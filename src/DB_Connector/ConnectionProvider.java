/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
package DB_Connector;
import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon(){
    try{
            String url = "jdbc:mysql://localhost:3306/s_reg";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url,username,password);
            
            return con;
            
            /*
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2) +"\t"+ rs.getString(3) + "\t"+ rs.getString(4)+"\t"+rs.getString(5));
            }
            con.close();
            */
        }
        catch(Exception e){
            return null;
        }
    
    }    
    
    public static void main(String[] args){
        
    }
}
