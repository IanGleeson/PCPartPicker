/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gints Gavars
 */
public class Methods {
    SQLdao dao = new SQLdao();
    static ArrayList<JComponent> checkoutList = new ArrayList<>();
    String soldItem;
    int soldItemQuantity;
//----------------------------------------------------------------------------------------------------------
   // returns a set of data from the sql Server - this is interpreted into a table model in buildTableModel()
    public ResultSet displayAllProducts(){
            return dao.displayAllProducts();
    }
//----------------------------------------------------------------------------------------------------------
// needs a method to remove these -
//returns checkbox to be added to panel
        String[] ordersString = {"GTX 960", "Radeon 380 r9", "UM212E"};
    static int stringValue;
    static int y = 50;
    static int x = 50;

    public JCheckBox returnCheckBox() {
        if (stringValue == 3) {
            stringValue = 0;
        }
        JCheckBox checkBox = new JCheckBox(ordersString[stringValue]);
        stringValue++;
        checkBox.setSelected(true);
        checkBox.setBounds(x, y, 130, 35);
        y += 50;
        checkoutList.add(checkBox);
        return checkBox;
    }
//----------------------------------------------------------------------------------------------------------
    //returns spinner to be added to panel
    String[] ordersInt = {"1", "3", "2"};
    static int intValue;

    public JSpinner returnSpinner() {

        //setting spinner values---> starting value / min value / max value / increment value
        SpinnerModel sm = new SpinnerNumberModel(1, 1, 99, 1);
        JSpinner spinner = new JSpinner(sm);
        spinner.setEditor(new JSpinner.DefaultEditor(spinner));
        //value = (int)spinner.getValue();
        if (intValue == 3) {
            intValue = 0;
        }
//        for (int i = 0; i < ordersInt.length; i++) {
//            value = Integer.parseInt(ordersInt[i]);
//            if(value == ordersInt.length){
//                value = 0;
//            } 
//        }
        spinner.setValue(Integer.parseInt(ordersInt[intValue]));
        intValue++;
        spinner.setBounds(x + 220, y - 49, 50, 30);
        checkoutList.add(spinner);
        return spinner;
    }  
//----------------------------------------------------------------------------------------------------------
    //sends bought items to be taken out from inventory
    public void checkoutProd(ArrayList<JComponent> checkoutList){
        int count = 0;

        for(JComponent c : checkoutList){
            if(c instanceof JCheckBox){
                
                soldItem = (String)((JCheckBox)c).getText();
            }
            else if(c instanceof JSpinner){
                
                soldItemQuantity = (int)((JSpinner)c).getValue();
            }
            count++;
            if(count == 2){
                System.out.println("sent across " + soldItem + " " +  soldItemQuantity);
                dao.Checkout(soldItem, soldItemQuantity);
                System.out.println("sent across " + soldItem + " " +  soldItemQuantity);
                count = 0;
            }
        }
    }
//----------------------------------------------------------------------------------------------------------
    
    public String search(String strSearch) {
        dao.search(strSearch);
            return strSearch;
    }
//----------------------------------------------------------------------------------------------------------
    //Adds new
    public ArrayList order(ArrayList<String> orderList) {
        orderList.add("Lots of stuff!");
        return orderList;
    }
//----------------------------------------------------------------------------------------------------------    
    //Converts the result set into a suitable type for the JTable

    public DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<>();

        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<>();

        while (rs.next()) {
            Vector<Object> vector = new Vector<>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
//----------------------------------------------------------------------------------------------------------
        return new DefaultTableModel(data, columnNames);

    }

}
