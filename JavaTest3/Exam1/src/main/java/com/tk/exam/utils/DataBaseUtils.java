package com.tk.exam.utils;

import org.springframework.context.annotation.PropertySource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
//@PropertySource(value="classpath:db.properties")
//public class DataBaseUtils {
//    //jdbc:mysql://39.108.59.99:3306/
//    static String url;
//    @Value("${mysql.name}")
//    static String name;
//    @Value("${mysql.password}")
//    static String password;
//    @Value("${jdbc.driver}")
//     String driver;

public class DataBaseUtils {
    static String url;
    static String name;
    static String password;
    static String driver;
    static {
        InputStream in = DataBaseUtils.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        name=properties.getProperty("jdbc.username");
        password=properties.getProperty("jdbc.password");
        driver=properties.getProperty("jdbc.driver");
        url=properties.getProperty("jdbc.url");

    }
    public static Connection getConnection() throws IOException {
        Connection connection=null;
        try {
            Class.forName(driver);
             connection = DriverManager.getConnection(url,name,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  connection;

    }

    public static void main(String[] args) throws IOException {
        System.out.println(DataBaseUtils.getConnection());
    }
}
