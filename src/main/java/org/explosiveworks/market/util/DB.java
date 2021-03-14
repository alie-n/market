package org.explosiveworks.market.util;

import java.net.URISyntaxException;
import java.sql.*;

public class DB {

    public static String getValue() throws URISyntaxException, SQLException, ClassNotFoundException {

        String driverClassName = "org.h2.Driver";
        String url = "jdbc:h2:./market";
        String username ="root";
        String password ="root";

        Class.forName(driverClassName);

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        statement.execute("DROP TABLE IF EXISTS draft;");
        statement.execute("CREATE TABLE draft (id INT, value VARCHAR(20));");
        statement.execute("INSERT INTO draft (id, value) VALUES (1, 'draft value');");

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
