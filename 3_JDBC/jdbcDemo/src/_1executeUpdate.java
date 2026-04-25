// 1. Import required package
import java.sql.*;

// To run this file:
// 1. cd "D:\My codes\Java\3_JDBC\jdbcDemo\src"
// 2. javac -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _1executeUpdate.java
// 3. java -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _1executeUpdate

public class _1executeUpdate {
    // 1. Database configuration
    private static final String url="jdbc:mysql://127.0.0.1:3306/college";  // By right clicking and selecting Copy JDBC connection to clipboard
    private static final String userName="root";                            // By right clicking and selecting Edit connection
    private static final String password="root123";
    public static void main(String[] args) {
        try {
            // 2. Load driver from Project structure->+->Java->select the connector stored in D drive
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Creating connection
            Connection conn=DriverManager.getConnection(url, userName, password);

            // 4. Create statement OBJECT 
            Statement stmt=conn.createStatement();

            // 5. Execute query
            // String query="INSERT INTO STUDENT VALUES(2, 'RK')";
            // String query="DELETE FROM STUDENT WHERE ID=1";
            String query="UPDATE STUDENT SET ID=2, NAME='RADHAKRUSHNA' WHERE ID=2";
            stmt.executeUpdate(query);

            // 6. Close connection
            conn.close();
            stmt.close();
            System.out.println("Data inserted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}