import java.sql.*;

public class JavaSQL {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/salesDatabase";
            String uname = "root";
            String pwd = "Mysql123#";
            Connection con = DriverManager.getConnection(url, uname, pwd);
            Statement st = con.createStatement();
            String query = "select * from customers";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getInt("CustomerId"));
            }
            rs.close();
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}