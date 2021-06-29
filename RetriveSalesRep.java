package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class RetriveSalesRep {
    public static void main(String[] args) throws SQLException {
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/cgi","root","root");
        Statement stat= connection.createStatement();
        ResultSet rs= stat.executeQuery("select * from Sales_Rep");
        while(rs.next())
        {
            int Rep_ID=rs.getInt("Rep_ID");
            String name=rs.getString("name");
            String city=rs.getString("city");
            double commision=rs.getDouble("Commision");
            System.out.println("REP ID : "+Rep_ID+" NAME : "+name+" CITY : "+city+"COMMISION : "+commision);


        }


    }
}
