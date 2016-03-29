package program;

import java.sql.*;
import javax.swing.JOptionPane;

public class SQLdao {

    private String user = "user";
    private String pass = "pass";
    private String dbURL = "jdbc:derby:C:\\Users\\dsd04\\MyDB";
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
    
        public ResultSet logIn(String user, String pass) {
        try {
            pst = conn.prepareStatement("SELECT * FROM USERS WHERE USERNAME LIKE " + "'" + user + "'", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return rst;
    }

    public ResultSet search() {
        try {
            pst = conn.prepareStatement("SELECT * FROM TESTSCHEMA.Companies WHERE companyName LIKE " + "'" + query + "%'", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return rst;
    }
}
