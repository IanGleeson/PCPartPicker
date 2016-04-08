package program;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SQLdao {

    private final String dbUser = "root";
    private final String dbPass = "password";
    private final String dbURL = "jdbc:mysql://192.168.103.114:3306/production?autoReconnect=true&useSSL=false";

    private String[] LogIn = new String[2];
    private ArrayList<String> Inventory = new ArrayList();
    private ArrayList<String> SearchResults = new ArrayList();

    private PreparedStatement pst;
    private ResultSet rst;
    private Connection conn;
//----------------------------------------------------------------------------------------------------------

    private Connection connect() throws SQLException {
        conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
        return conn;
    }
//----------------------------------------------------------------------------------------------------------

    public String[] logIn(String user, char[] pass) throws SQLException {
        connect();
        pst = conn.prepareStatement("SELECT Username, Password FROM production.customers WHERE USERNAME LIKE '" + user
                + "' AND PASSWORD LIKE '" + new String(pass) + "'");
        rst = pst.executeQuery();
        while (rst.next()) {
            LogIn[0] = rst.getString("Username");
            LogIn[1] = rst.getString("Password");
        }
        return LogIn;
    }
//----------------------------------------------------------------------------------------------------------

    public String getDescription(String ProdName) {
        String Description = "";
        try {
            connect();
            pst = conn.prepareStatement("SELECT Description FROM production.inventory WHERE ProdName LIKE '" + ProdName + "'");
            rst = pst.executeQuery();
            while (rst.next()) {
                Description = rst.getString("Description");
            }
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return Description;
    }
//----------------------------------------------------------------------------------------------------------

    public void checkout(String ProdName, int quantity) {
        try {
            connect();
            pst = conn.prepareStatement("UPDATE inventory SET InStock = InStock - '" + quantity + "' WHERE ProdName = '" + ProdName + "'");
            pst.executeUpdate();
        } catch (SQLException d) {
            d.printStackTrace();
        }
    }
//----------------------------------------------------------------------------------------------------------    
    public void addUser(String user, char[] pass, String fullname, String address, String email) {
        try {
            connect();
            String statement = String.format("INSERT INTO customers (Username,Password,FullName,Address,Email) VALUES %s, %s, %s, %s, %s", user, new String(pass), fullname, address, email);
            pst = conn.prepareStatement(statement);
            pst.executeUpdate();
        } catch (SQLException d) {
            d.printStackTrace();
        }
    }
//----------------------------------------------------------------------------------------------------------    
    public void addInventory(String name, String category, String description, int inStock, double price) {
        try {
            connect();
            String statement = String.format("INSERT INTO inventory (ProdName,Category,Description,InStock,Price) VALUES (%s,%s,%s,%d,%f)", name, category, description, inStock, price);
            pst = conn.prepareStatement(statement);
            pst.executeUpdate();
        } catch (SQLException d) {
            d.printStackTrace();
        }
    }
//----------------------------------------------------------------------------------------------------------
    public void plusBalance(double quantity, String User) {
        try {
            connect();
            pst = conn.prepareStatement("UPDATE customers SET Wallet = Wallet + '" + quantity + "' WHERE Username = '" + User + "'");
            pst.executeUpdate();
        } catch (SQLException d) {
            d.printStackTrace();
        }
    }
//----------------------------------------------------------------------------------------------------------
    public void minusBalance(double quantity, String User) {
        try {
            connect();
            pst = conn.prepareStatement("UPDATE customers SET Wallet = Wallet - '" + quantity + "' WHERE Username = '" + User + "'");
            pst.executeUpdate();
        } catch (SQLException d) {
            d.printStackTrace();
        }
    }
//----------------------------------------------------------------------------------------------------------
    public double getBalance(String User) {
        double balance = 0.00;
        try {
            connect();
            pst = conn.prepareStatement("SELECT Wallet FROM production.customers WHERE Username = '" + User + "'");
            rst = pst.executeQuery();
            while (rst.next()) {
                balance = rst.getDouble("Wallet");
            }
        } catch (SQLException d) {
            d.printStackTrace();
        }
        return balance;
    }
//----------------------------------------------------------------------------------------------------------

    public void addToStock(String ProdName, int quantity) {
        try {
            connect();
            pst = conn.prepareStatement("UPDATE inventory SET InStock = InStock + '" + quantity + "' WHERE ProdName = '" + ProdName + "'");
            pst.executeUpdate();
        } catch (SQLException d) {
            d.printStackTrace();
        }
    }
//----------------------------------------------------------------------------------------------------------    
    public void returnItem(String ProdName, int quantity) {
        try {
            connect();
            pst = conn.prepareStatement("INSERT INTO returns VALUES");
            pst.executeUpdate();
        } catch (SQLException d) {
            d.printStackTrace();
        }
    }
//----------------------------------------------------------------------------------------------------------

    public void disconnect() {
        try {
            pst.close();
            conn.close();
            rst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, this, "Error disconnecting from database.", JOptionPane.ERROR_MESSAGE);
        }
    }
//----------------------------------------------------------------------------------------------------------
    public ResultSet displayAllProducts() {

        try {
            connect();
            pst = conn.prepareStatement("SELECT Prod_ID, ProdName, Category, InStock, Price FROM production.inventory");
            rst = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SQLdao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rst;
    }
//----------------------------------------------------------------------------------------------------------
    public ArrayList search(String query) throws SQLException {
        connect();
        pst = conn.prepareStatement("SELECT * FROM production.inventory WHERE prodName LIKE " + "'" + query + "%'");
        rst = pst.executeQuery();
        while (rst.next()) {
            SearchResults.add(rst.getString("Description"));
        }
        return SearchResults;
    }
//----------------------------------------------------------------------------------------------------------

}
