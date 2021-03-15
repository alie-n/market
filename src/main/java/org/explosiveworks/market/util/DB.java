package org.explosiveworks.market.util;

import java.net.URISyntaxException;
import java.sql.*;

public class DB {

    public static String getValue() throws URISyntaxException, SQLException, ClassNotFoundException {

        String url = System.getenv("DB_URL");
        String driverClassName = "org.postgresql.Driver";

        Class.forName(driverClassName);
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM draft");

        String value = null;
        while(resultSet.next()) {
            value = resultSet.getString("value");
        }

        resultSet.close();
        statement.close();
        connection.close();

        return value;
    }
}
