import com.sun.tools.javac.Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseAccess {
    //JDBC driver name and URl
    static final String Driver = "com.mysql.cj.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/dbbooks";
    static final String USER = "root";
    static final String password ="WKagoiyoWK12@";

    public static void main(String[] args){
        //loading JDBC Driver...
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //JDBC loading ..
            Class.forName(Driver);
            //establish connection to DB...
            connection = DriverManager.getConnection(DATABASE_URL,USER,password);
            //creating statement for querying Database...
            statement = connection.createStatement();
            //Query Database...
            resultSet = statement.executeQuery("SELECT* FROM tblbooks");

            //process Query results...
            int i = 0;
            while (resultSet.next()){
                String Author = (String) resultSet.getObject(2);
                String Title = (String) resultSet.getObject(3);
                System.out.printf("%s: %s\n",Author,Title);

            }
            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
    }


}
