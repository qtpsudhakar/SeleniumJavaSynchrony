package com.files.handle;

import java.sql.*;

public class ReadDb {
    public static void main(String[] args) {

        //db : server url, port,dbname, user,pwd
        String dbPath="jdbc:mysql://localhost:3307/company";
        String uname="root";
        String pwd="admin";

        try {
            Connection connection = DriverManager.getConnection(dbPath,uname,pwd);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from emp"); //for reading db

//            statement.execute("write/update query");
            ResultSetMetaData rsm = rs.getMetaData();

            int cc = rsm.getColumnCount();
            while (rs.next()){

                for (int c=1;c<=cc;c++)
                    System.out.println(rs.getString(c));
            }

            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
