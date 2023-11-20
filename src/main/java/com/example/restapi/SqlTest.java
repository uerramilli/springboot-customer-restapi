package com.example.restapi;

import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class SqlTest {

    public static void main(String [] args) throws Exception {
        // Class.forName( "com.mysql.jdbc.Driver" ); // do this in init
        // // edit the jdbc url 
        //Connection conn = DriverManager.getConnection( 
            //"jdbc:mysql://localhost:3306/?user=root&password=SfccTest123#");
        
        final String DB_URL = "jdbc:mysql://localhost:3306/db_example";


        final String username = "root";
        final String password = "SfccTest123#"; 

       Connection conn = DriverManager.getConnection(DB_URL,username,password);
        // Statement st = conn.createStatement();
        // ResultSet rs = st.executeQuery( "select * from table" );

        System.out.println("Connected?");
    }
}