package org.example;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class Main extends JFrame {
    private JTable table;
    private JScrollPane scrollPane;

    public Main() {
        String url = "jdbc:mysql://localhost:3306/sales_database";
        String username = "root";
        String password = "Mysql123#";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");

            // Create a JTable to display the result set
            table = new JTable(buildTableModel(resultSet));
            scrollPane = new JScrollPane(table);

            // Set up JFrame
            setTitle("Customer Table");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600, 400);
            setLocationRelativeTo(null);
            setLayout(new BorderLayout());

            // Add JTable to JFrame
            add(scrollPane, BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Helper method to convert ResultSet to TableModel
    public static DefaultTableModel buildTableModel(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();

        // Get column names
        int columnCount = metaData.getColumnCount();
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
        }

        // Get data
        Object[][] data = new Object[0][];
        int rowCount = 0;
        while (resultSet.next()) {
            rowCount++;
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                rowData[i - 1] = resultSet.getObject(i);
            }
            data = appendRow(data, rowData);
        }

        return new DefaultTableModel(data, columnNames);
    }

    // Helper method to append a row to a 2D array
    public static Object[][] appendRow(Object[][] array, Object[] newRow) {
        Object[][] newArray = new Object[array.length + 1][];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = newRow;
        return newArray;
    }
}
