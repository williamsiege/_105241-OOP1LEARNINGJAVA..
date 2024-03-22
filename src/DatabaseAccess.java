import com.sun.tools.javac.Main;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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

        // Create a JFrame
        JFrame frame = new JFrame("MySQL Data Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a DefaultTableModel with column names
        DefaultTableModel model = new DefaultTableModel();

        // Create a JTable with the DefaultTableModel
        JTable table = new JTable(model);

        // Create a JScrollPane and add the JTable to it
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the JScrollPane to the JFrame
        frame.add(scrollPane);

        // Set the size of the JFrame and make it visible
        frame.setSize(600, 400);
        frame.setVisible(true);

        try {
            //JDBC loading ..
            Class.forName(Driver);
            //establish connection to DB...
            connection = DriverManager.getConnection(DATABASE_URL,USER,password);
            //creating statement for querying Database...
            statement = connection.createStatement();
            //Query Database...
            String Query = "SELECT * FROM tblbooks";
            resultSet = statement.executeQuery(Query);

            //process Query results...
            while (resultSet.next()){
                String ISBN = (String) resultSet.getObject(1);
                String Author = (String) resultSet.getObject(2);
                String Title = (String) resultSet.getObject(3);
                String Edition =(String) resultSet.getObject(4);
                System.out.printf("%s: %s: %s: %s\n",ISBN,Author,Title,Edition);


            }
            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }

        try {
            // Create a JdbcRowSet and Connection...
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl(DATABASE_URL);
            rowSet.setUsername(USER);
            rowSet.setPassword(password);
            rowSet.setCommand("SELECT * FROM tblbooks");
            rowSet.execute();

            // Insert a new record
            rowSet.moveToInsertRow();
            rowSet.updateString("ISBN", "10879");
            rowSet.updateString("Author", "Catherine Brooke");
            rowSet.updateString("Title", "New Hope");
            rowSet.updateString("Edition","8th edition");

            rowSet.insertRow();
            rowSet.moveToCurrentRow(); // Move back to the current row
            // Continue updating other columns as needed


            // Modify an existing record
            while (rowSet.next()) {
                if (rowSet.getString("ISBN").equals("14654")) {
                    rowSet.updateString("ISBN", "17769");
                    // Continue updating other columns as needed
                    rowSet.updateRow();
                }
            }

            // Retrieve and display data from all rows and columns
            rowSet.beforeFirst();
            while (rowSet.next()) {
                String column1Value = rowSet.getString("ISBN");
                String column2Value = rowSet.getString("Author");
                String column3Value = rowSet.getString("Title");
                String column4Value = rowSet.getString("Edition");
                // Retrieve values of other columns as needed
                System.out.printf("%s: %s: %s: %s\n",column1Value,column2Value,column3Value,column4Value);
            }

            // Close the CachedRowSet
            rowSet.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }

        // Testing Something ....
        // Retrieve data from the database and populate the DefaultTableModel
        try {
            //JDBC loading ..
            Class.forName(Driver);
            //establish connection to DB...
            connection = DriverManager.getConnection(DATABASE_URL,USER,password);
            //creating statement for querying Database...
            statement = connection.createStatement();
            //Query Database...
            String Query = "SELECT * FROM tblbooks";
            resultSet = statement.executeQuery(Query);

            // Get metadata about the ResultSet (column names)
            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = resultSet.getMetaData().getColumnName(i);
                model.addColumn(columnName);
            }

            // Populate the DefaultTableModel with data from the ResultSet
            while (resultSet.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getObject(i);
                }
                model.addRow(rowData);
            }
        }catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }

    }



}
