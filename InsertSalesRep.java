package org.example;

import java.sql.SQLException;
import java.sql.*;
public class InsertSalesRep {
    public static void main(String[] args) throws SQLException {
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/cgi","root","root");
        PreparedStatement pstat=connection.prepareStatement("insert into Sales_Rep values(?,?,?,?)");
        pstat.setInt(1,1009);
        pstat.setString(2,"Suresh");
        pstat.setString(3,"Hyderabad");
        pstat.setDouble(4,0.5);
        pstat.executeUpdate();


    }
}
