package day1;

import java.sql.*;

public class LoopingResultSet {
    public static void main(String[] args) throws SQLException {
        // REPLACE THIS IP ADDRESS WITH YOUR OWN THAT WORKING IN SQL DEVELOPER
        String connectionStr = "jdbc:oracle:thin:@3.92.227.102:1521:XE";
        String username = "hr";
        String password = "hr";

        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS");

        while (rs.next()){
            System.out.println("region ID "+ rs.getString("region_ID"));
            System.out.println("region Name "+ rs.getString("region_name"));
        }
        System.out.println("====================================");
         rs = stmnt.executeQuery("SELECT * FROM COUNTRIES");
        //rs.next();
       // System.out.println(rs.getString(1));
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+
                            rs.getString(2)+" "+
                            rs.getString(3)
                    );
        }






    }
}
