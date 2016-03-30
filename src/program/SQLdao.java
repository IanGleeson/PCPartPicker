package program;

import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class SQLdao {

    private String user = "username";
    private String pass = "password";
    private final String dbURL = "jdbc:derby:\\localhost:1527\\PCPartPicker";       //String url = "jdbc:odbc:Driver={SQL Server};"
                                                                                    //"server=SD-00\\MSSQLSERVER1;"
                                                                                    //+ "Database=JavaPizzaStore";
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
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void connect() {
        try {
            conn = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException c) {
            JOptionPane.showMessageDialog(null, this, "Could not connect to database.", JOptionPane.ERROR_MESSAGE);
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

    public ResultSet logIn(String user, char[] pass) {
        try {
            pst = conn.prepareStatement("SELECT * FROM USERNAME.USERS WHERE USERNAME LIKE '" + user
                    + "' AND PASSWORD LIKE '" + Arrays.toString(pass) + "'", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return rst;
    }
    
        public ResultSet displayAllProducts() {
        try {
            pst = conn.prepareStatement("SELECT * INVENTORY", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return rst;
    }

    public ResultSet search() {
        try {
            pst = conn.prepareStatement("SELECT * INVENTORY WHERE productname LIKE " + "'" + query + "%'", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return rst;
    }
}