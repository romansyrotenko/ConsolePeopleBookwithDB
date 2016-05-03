import org.apache.commons.dbutils.DbUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

    public static Connection getConnection()  {

        Properties properties = new Properties();
        File file = new File("/home/sroman/Projects/ConsolePeopleBookwithDB/src/main/resources/config.properties");
        try {
            properties.load(new FileReader(file));
        } catch (IOException e) {
            System.out.println("Sorry, can't find property file");
            throw new RuntimeException("Problem with property file" + e);
        }
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");

        DbUtils.loadDriver(driver);

        try {
            return DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            System.out.println("Sorry, can't connect to DataBase" + url);
            throw new RuntimeException("Problem to set DataBase connection" + e);
        }
    }

}
