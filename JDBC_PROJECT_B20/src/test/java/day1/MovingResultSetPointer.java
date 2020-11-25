package day1;

import java.sql.*;

public class MovingResultSetPointer {
    public static void main(String[] args) throws SQLException {
        // REPLACE THIS IP ADDRESS WITH YOUR OWN THAT WORKING IN SQL DEVELOPER
        // we want to create a statement object that generate
        // ResultSet that can move forward and backward anytime
        String connectionStr = "jdbc:oracle:thin:@3.92.227.102:1521:XE";
        String username = "hr";
        String password = "hr";

        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS");

        while (rs.next()){
            System.out.println("region Name "+ rs.getString("region_name"));
        }
        System.out.println("=======================================");
/*
        rs.previous(); move up row
        System.out.println("region Name "+ rs.getString("region_name"));
        rs.previous();
        System.out.println("region Name "+ rs.getString("region_name"));
 */
        while (rs.previous()){
            System.out.println(" back ward region Name "+ rs.getString("region_name"));
        }
        /**
         * Other ResultSet methods for moving your pointer to specific locations
         */
        rs.beforeFirst(); // before first location
        rs.first() ;  // first row
        System.out.println("First Row " + rs.getString(2) ) ;
        rs.last() ; // last row
        System.out.println("Last Row " + rs.getString(2) ) ;
        rs.afterLast(); // after last location
        rs.absolute(3) ; // move to specific row
        System.out.println("Third Row " + rs.getString(2) ) ;

        // how to find out which row the pointer is at right now
        rs.last();
        System.out.println("NOW WE HAVE MOVED TO LAST ROW ");
        int currentRowNum = rs.getRow() ;
        System.out.println("Row Count  = " + currentRowNum);
        rs.close();
        stmnt.close();
        conn.close();

    }
}
