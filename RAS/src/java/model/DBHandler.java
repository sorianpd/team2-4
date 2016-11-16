package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * An abstract parent class for database handlers. This class
 * loads the database driver class.
 *
 * @author R.Grove
 * @version 2014-10-25
 */
public class DBHandler {
    /** Database access credentials */
    protected String driverName = "com.mysql.jdbc.Driver";
    protected String url = "jdbc:mysql://grove.cs.jmu.edu:3306/team24_db";
    protected String userId = "team24"; 
    protected String password = "bakery24";
    /** Database connection */
    private Connection con;
    /** SQL Statement */
    protected Statement stmt;
    /** Connection open status */
    protected boolean isOpen = false;

    /**
     * Open the DB connection
     *
     * @throws SQLException if the DB connection cannot be established
     */
    public void open() throws SQLException {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            return;
        }
        con = DriverManager.getConnection(url, userId, password);
        stmt = con.createStatement();
        isOpen = true;
    }

    /**
     * Close the DB connection.
     *
     * @throws SQLException if the DB connection close fails
     */
    public void close() throws SQLException {
        stmt.close();
        con.close();
        isOpen = false;
    }
    
    /**
     * Execute a command and return a result count.
     *
     * @param command An SQL command to be executed.
     * @return The count of rows affected by the command
     * @throws SQLException if there is a database error during command
     * execution
     */
    public int doCommand(String command) throws SQLException {
        if (!isOpen) {
            open();
        }
        int resultCount = stmt.executeUpdate(command);
        return resultCount;
    }
    
    /**
     * Execute a query and return a ResultSet.
     *
     * @param query The SQL query to be executed
     * @return A ResultSet of the query results
     * @throws SQLException if the database query action fails
     */
    public ResultSet doQuery(String query) throws SQLException {
        if (!isOpen) {
            open();
        }
        if (stmt == null) System.out.println ("ITS NULL");
        System.out.println(query);
        
        ResultSet rs = stmt.executeQuery(query);
        return rs;
    }
}