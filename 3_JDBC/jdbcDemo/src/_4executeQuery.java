// 1. Import required package
import java.sql.*;

// To run this file:
// 1. cd "D:\My codes\Java\3_JDBC\jdbcDemo\src"
// 2. javac -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _4executeQuery.java
// 3. java -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _4executeQuery

public class _4executeQuery {
    // 1. Database configuration
    private static final String url="jdbc:mysql://127.0.0.1:3306/college";  
    private static final String userName="root";                            
    private static final String password="root123";

    public static void main(String[] args) {
        try {
            // 2. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Create connection
            Connection conn=DriverManager.getConnection(url, userName, password);

            // 4. Create Prepare Statement
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM STUDENT");

            // 5. Result set for storing Table and displaying it.
            ResultSet res=ps.executeQuery();
            System.out.println("ID"+" "+"NAME");
            // Using loop to store all records in ResultSet
            while(res.next()){
                int id=res.getInt(1);
                String name = res.getString("NAME"); 
                System.out.println(id+" "+ name);
            }

            // 6. Close connection
            res.close();   
            ps.close();    
            conn.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}


