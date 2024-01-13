/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connect.ConnectToDatabase;
import java.sql.Connection;
 
/**
 *
 * @author Christian
 */
public class Connect {
    
    public Connection getConnection()throws Exception{
        ConnectToDatabase conn = new ConnectToDatabase("postgres","", "dentiste");
        return conn.getConnectionPostgres();
    }
}
