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
    private ArrayList<String> Description = new ArrayList();
    private ArrayList<String> SearchResults = new ArrayList();

    private PreparedStatement pst;
    private ResultSet rst;
    private Connection conn;

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
        } catch (SQLException c) {
            JOptionPane.showMessageDialog(null, this, "Could not connect to database.", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(SQLdao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[] logIn(String user, char[] pass) throws SQLException {
        pst = conn.prepareStatement("SELECT Username, Password FROM production.customers WHERE USERNAME LIKE '" + user
                + "' AND PASSWORD LIKE '" + new String(pass) + "'");
        rst = pst.executeQuery();
        while (rst.next()) {
            LogIn[0] = rst.getString("Username");
            LogIn[1] = rst.getString("Password");
        }
        return LogIn;
    }

    public ArrayList getInventory() {
        try {
            pst = conn.prepareStatement("SELECT ProdID, ProdName, Category, InStock, Price FROM production.inventory");
            rst = pst.executeQuery();
            while (rst.next()) {
                Inventory.add(rst.getString("ProdID"));
                Inventory.add(rst.getString("ProdName"));
                Inventory.add(rst.getString("Category"));
                Inventory.add(rst.getString("InStock"));
                Inventory.add(rst.getString("Price"));
            }
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return Inventory;
    }

    public ArrayList getDescription(String ProdID) {
        try {
            Description.clear();
            pst = conn.prepareStatement("SELECT Description FROM production.inventory WHERE prod_ID LIKE '" + ProdID + "'");
            rst = pst.executeQuery();
            while (rst.next()) {
                Description.add(rst.getString("Description"));
            }
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
        return Description;
    }

    public void Checkout(int ProdID, int quantity) {
        try {
            pst = conn.prepareStatement("UPDATE inventory SET InStock = InStock - '" + quantity + "' WHERE Prod_ID = '" + ProdID + "'");
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AddInventory(int ProdID, int quantity) {
        try {
            pst = conn.prepareStatement("UPDATE inventory SET InStock = InStock + '" + quantity + "' WHERE Prod_ID = '" + ProdID + "'");
            rst = pst.executeQuery();
        } catch (SQLException d) {
            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
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

//We using mainscreen table search for this?
//    public ArrayList search(String query) {
//        try {
//            pst = conn.prepareStatement("SELECT * FROM production.inventory WHERE prodName LIKE " + "'" + query + "%'");
//            rst = pst.executeQuery();
//            while (rst.next()) {
//                SearchResults.add(rst.getString("Description"));
//            }
//        } catch (SQLException d) {
//            JOptionPane.showMessageDialog(null, this, "Error preparing or executing statement.", JOptionPane.ERROR_MESSAGE);
//        }
//        return SearchResults;
//    }
}
