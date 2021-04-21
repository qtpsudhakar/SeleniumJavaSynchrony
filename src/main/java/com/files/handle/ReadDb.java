package com.files.handle;

import java.sql.*;

public class ReadDb {
    public static void main(String[] args) {

        //db : server url, port,dbname, user,pwd
        String dbPath="jdbc:mysql://localhost:3307//dbname";
        String uname="root";
        String pwd="admin";

        try {
            Connection connection = DriverManager.getConnection(dbPath,uname,pwd);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from tbl"); //for reading db

//            statement.execute("write/update query");

            while (rs.next()){
                System.out.println(rs.getString(1));
            }

            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
