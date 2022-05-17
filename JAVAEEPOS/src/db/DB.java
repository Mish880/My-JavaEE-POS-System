package db;

import java.sql.Connection;
import java.sql.SQLException;

public class DB {
       static private  DB instance;
       private Connection connection;

       private DB() throws  ClassNotFoundException, SQLException{
            Class.forName("com.mysql.cj.jdbc.Driver");
       }

}
