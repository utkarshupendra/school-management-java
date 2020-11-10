import db.PostgresManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLJDBC {
    public static void main(String args[]) {
        Connection c = null;
        try {
            c = PostgresManager.getConnection();
            //c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","utkarsh","12345");
            Statement statement = c.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from weather"); //3

            while (resultSet.next()) {
                System.out.println("WeatherID: "+resultSet.getLong("weatherID"));
                System.out.println("City: "+resultSet.getString("city_nm"));
                System.out.println("Date: "+resultSet.getDate("date"));
                System.out.println("==========================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}