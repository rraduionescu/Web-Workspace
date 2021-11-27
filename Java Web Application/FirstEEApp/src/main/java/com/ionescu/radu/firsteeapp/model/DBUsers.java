package com.ionescu.radu.firsteeapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUsers
{
    public static String getUsers()
    {
        String result = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","admin","1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");
            while(resultSet.next())
            {
                result = resultSet.getInt(1)+"  "+resultSet.getString(2)+"  "+resultSet.getString(3) + " " + resultSet.getString(4);
            }
            connection.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
