// Q3. What are PreparedStatement?
// A PreparedStatement is a pre-compiled SQL statement. 
// It is a subinterface of Statement. Prepared Statement objects have some useful additional features than Statement Objects.
// Instead of hard coding queries PreparedStatement object provides a feature to execute a parameterized query (SQL query is passed as a parameter).


import java.sql.*;

// To run this file:
// 1. cd "D:\My codes\Java\3_JDBC\jdbcDemo\src"
// 2. javac -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _2preparedStatement.java
// 3. java -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _2preparedStatement

public class _2preparedStatement {
    // 1. Database configuration
    private static final String url="jdbc:mysql://127.0.0.1:3306/college";  
    private static final String userName="root";                            
    private static final String password="root123";

    public static void main(String[] args) {
        try {
            // 2. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. create connection 3
            Connection conn=DriverManager.getConnection(url, userName, password);

            // 4. Create statement
            PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENT VALUES (?, ?)");
            // PreparedStatement ps = conn.prepareStatement("DELETE FROM STUDENT WHERE ID = ? AND NAME = ?");

            // 5. Execute query
            ps.setInt(1, 3);
            ps.setString(2, "SRK");
            ps.executeUpdate();

            // 6. Close connection
            conn.close();
            ps.close();
            System.out.println("Data inserted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}