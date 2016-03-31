package program;

import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SQLdao {

    private String user = "root";
    private String pass = "password";

    //"server=SD-00\\MSSQLSERVER1;"
    //+ "Database=JavaPizzaStore";

    //private final String dbURL = "jdbc:mysql://localhost:3306/production";       //String url = "jdbc:odbc:Driver={SQL Server}

    private final String dbURL = "jdbc:mysql://192.168.103.114:3306/production?autoReconnect=true&useSSL=false";       //String url = "jdbc:odbc:Driver={SQL Server};"

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
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, user, pass);
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

    public ResultSet logIn(String user, char[] pass) {
        try {
            pst = conn.prepareStatement("SELECT * FROM production.customers WHERE USERNAME LIKE '" + user
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
            pst = conn.prepareStatement("SELECT * INVENTORY WHERE prodName LIKE " + "'" + query + "%'", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return rst;
    }
}
