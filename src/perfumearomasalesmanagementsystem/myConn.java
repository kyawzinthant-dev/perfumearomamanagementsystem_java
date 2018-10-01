/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfumearomasalesmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class myConn {
    public static Connection getConnection(){
    
        Connection conn = null;
    
    try{
     String url = "jdbc:mysql://localhost:3306/aromadb",
             user = "root",
             password = "";
             
             conn = DriverManager.getConnection(url,user,password);
             if(conn!=null){
                 System.out.println("Connected!");
             }
     
     
 }
    catch(SQLException ex){
      System.out.println("Error!");
            ex.printStackTrace();
 }
     return conn;
    }
   
}
