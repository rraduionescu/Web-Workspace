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
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:7392/brands_test","root","qweasdzxc");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            while(resultSet.next())
            {
                result = resultSet.getInt(1)+"  "+resultSet.getString(2)+"  "+resultSet.getString(3) + " " + resultSet.getString(4);
            }
            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(result);
        return result;
    }
}
