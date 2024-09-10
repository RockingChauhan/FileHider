package DB;

import com.mysql.cj.x.protobuf.MysqlxExpect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class MyConnection {
    public static Connection connection = null;
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fileHider?useSSL=false", "root", "13579@.com");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("connection Established");
         return connection;
    }

    public static void closeConnection() {
        if (connection != null){
            try{
                 connection.close();
            } catch (SQLException ex){
               ex.printStackTrace();
            }
        }
    }

}
