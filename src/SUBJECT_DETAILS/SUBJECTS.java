/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SUBJECT_DETAILS;

/**
 *
 * @author Admin
 */
import DB_Connector.ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class SUBJECTS {
   public static void main(String[] args) {
       try{
              Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String sql_command = "select * from subject_names";
            ResultSet rs = st.executeQuery(sql_command);
            String[] subject_names = new String[6];
            int i = 1;
            while(rs.next()){
                subject_names[i - 1] = rs.getString(i);
                i++;
            }
            for(String j : subject_names){
                System.out.println(j);
            }
            
            
       }
       catch(SQLException e){
           System.out.println(e);
       }
           
       }
   }

