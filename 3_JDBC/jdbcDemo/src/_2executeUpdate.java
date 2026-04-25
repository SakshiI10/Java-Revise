// 1. Import required package
import java.sql.*;

// To run this file:
// 1. cd "D:\My codes\Java\3_JDBC\jdbcDemo\src"
// 2. javac -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _2executeUpdate.java
// 3. java -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _2executeUpdate

public class _2executeUpdate {
    public static void main(String[] args) {
        try {
            // 2. Load driver from Project structure->+->Java->select the connector stored in D drive
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Creating connection
            String url="jdbc:mysql://127.0.0.1:3306/college";
            String userName="root";
            String password="root123";
            Connection conn=DriverManager.getConnection(url, userName, password);

            // 4. Create statement
            Statement stmt=conn.createStatement();

            // 5. Execute query
            // String query="INSERT INTO STUDENT VALUES(2, 'RK')";
            // String query="DELETE FROM STUDENT WHERE ID=1";
            String query="UPDATE STUDENT SET ID=2, NAME='RADHAKRUSHNA' WHERE ID=2";
            stmt.executeUpdate(query);

            // 6. Close connection
            conn.close();
            System.out.println("Data inserted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}