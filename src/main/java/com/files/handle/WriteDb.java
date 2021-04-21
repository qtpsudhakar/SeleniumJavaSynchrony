package com.files.handle;

import java.sql.*;

public class WriteDb {
    public static void main(String[] args) {

        //db : server url, port,dbname, user,pwd
        String dbPath="jdbc:mysql://localhost:3307/company";
        String uname="root";
        String pwd="admin";

        try {
            Connection connection = DriverManager.getConnection(dbPath,uname,pwd);
            Statement statement = connection.createStatement();

            statement.execute("INSERT INTO emp (id, name, age, sal) VALUES (3, 'selenium', 25,122211);");

            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
