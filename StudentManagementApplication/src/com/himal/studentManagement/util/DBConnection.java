package com.himal.studentManagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Himal Acharya on 2016-09-03.
 */
public class DBConnection {

    private static String url="jdbc:mysql://localhost:3306/studentmanagementdb";
    private static String userName="root";
    private static String password="1234";
    private static String driverName="com.mysql.jdbc.Driver";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driverName);
        Connection con= DriverManager.getConnection(url,userName,password);

        return con;

    }

    public static void closeConnection(Connection con) throws SQLException {
        if(null!=con &&!con.isClosed()){
            con.close();
        }
    }

    public static void closeAll(PreparedStatement ps) throws SQLException {
        if(ps!=null){
            ps.close();
        }
    }

}
