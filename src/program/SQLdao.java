package program;

import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SQLdao {

    private String dbUser = "root";
    private String dbPass = "password";
    private final String dbURL = "jdbc:mysql://192.168.103.114:3306/production?autoReconnect=true&useSSL=false";
    
    String[] LogIn;
    
    private String query;
    private PreparedStatement pst;
    private ResultSet rst;
    private Connection conn;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getUser() {
        return dbUser;
    }

    public void setUser(String user) {
        this.dbUser = user;
    }

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
        } catch (SQLException c) {
            c.printStackTrace();
            //JOptionPane.showMessageDialog(null, this, "Could not connect to database.", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(SQLdao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            pst.close();
            conn.close();
            rst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, this, "Error disconnecting from database.", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String[] logIn(String user, char[] pass) {
        try {
            pst = conn.prepareStatement("SELECT * FROM production.customers WHERE USERNAME LIKE '" + user
                    + "' AND PASSWORD LIKE '" + Arrays.toString(pass) + "'", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = pst.executeQuery();
            while(rst.next()){
                LogIn[0] = rst.getString("Username");
                LogIn[1] = rst.getString("Password");
            }
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return LogIn;
    }

    public ResultSet displayAllProducts() {
        try {
            pst = conn.prepareStatement("SELECT * FROM production.inventory", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return rst;
    }

    public ResultSet search() {
        try {
            pst = conn.prepareStatement("SELECT * FROM production.inventory WHERE prodName LIKE " + "'" + query + "%'", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return rst;
    }
}
