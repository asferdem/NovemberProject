package day4;

import utility.*;
import java.sql.*;

public class SpartanDBPractice {

    public static void main(String[] args) {


        String connectionStr =  ConfigurationReader.getProperty("spartan.database.url");
        String username =       ConfigurationReader.getProperty("spartan.database.username");
        String password =       ConfigurationReader.getProperty("spartan.database.password");
        // call your create connection method with 3 params
        // provide same connection string as HR
        // provide username and password as SP SP
        DB_Utility.createConnection(connectionStr , username,password);

        // run query SELECT * FROM SPARTANS
        DB_Utility.runQuery("SELECT * FROM SPARTANS");
        // call few methods from DB_Utility
        // print out row number
        System.out.println("DB_Utility.getRowCount() = " + DB_Utility.getRowCount());
        // GET ALL THE COLUMN NAMES AND PRINT
        System.out.println("DB_Utility.getColumnNames() = \n\t" + DB_Utility.getColumnNames());


        DB_Utility.destroy();
    }
}
