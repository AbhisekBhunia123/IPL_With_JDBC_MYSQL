package prac.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    private static final String url = "jdbc:mysql://localhost:3306/iplInfo";
    private static final String user = "root";
    private static final String password = "root";

    public static Connection makeConnection() throws Exception{
        Connection con=null;
        con = DriverManager.getConnection(url,user,password);
        return con;
    }
}
