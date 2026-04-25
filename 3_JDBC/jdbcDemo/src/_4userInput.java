import java.sql.*;
import java.util.Scanner;

// To run this file:
// 1. cd "D:\My codes\Java\3_JDBC\jdbcDemo\src"
// 2. javac -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _4userInput.java
// 3. java -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _4userInput

public class _4userInput {
    // 1. Database configuration
    private static final String url="jdbc:mysql://127.0.0.1:3306/college";  
    private static final String userName="root";                            
    private static final String password="root123";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            // 2. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Create connection 3
            Connection conn=DriverManager.getConnection(url, userName, password);

            // 4. Create statement
            PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENT VALUES (?, ?)");
            //PreparedStatement ps = conn.prepareStatement("DELETE FROM Persons WHERE ID = ?");

            // 5. Execute query
            System.out.println("How many students do you want to add?");
            int n=sc.nextInt();

            for (int i=1; i<=n; i++) {
                System.out.println("Enter the id of "+i+" student");
                int id=sc.nextInt();
                System.out.println("Enter your name of "+i+" student");
                String name=sc.next();
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.executeUpdate();
            }

            // 6. Close connection
            conn.close();
            System.out.println("Data inserted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}