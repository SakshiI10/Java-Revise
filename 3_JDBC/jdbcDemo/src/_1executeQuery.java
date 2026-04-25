import java.sql.*;

// To run this file:
// 1. cd "D:\My codes\Java\3_JDBC\jdbcDemo\src"
// 2. javac -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _1executeQuery.java
// 3. java -cp ".;..\lib\mysql-connector-j-9.7.0.jar" _1executeQuery

public class _1executeQuery {
    // 1. Database configuration
    private static final String url="jdbc:mysql://127.0.0.1:3306/college";  // By right clicking and selecting Copy JDBC connection to clipboard
    private static final String userName="root";                            // By right clicking and selecting Edit connection
    private static final String password="root123";

    public static void main(String[] args) {
        try {
            // 2. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Create connection
            // (Removed duplicate variable declarations, using class-level variables instead)
            Connection conn=DriverManager.getConnection(url, userName, password);

            // 4. Create statement
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM STUDENT");

            // 5. Execute query
            ResultSet res=ps.executeQuery();
            System.out.println("ID"+" "+"NAME");

            while(res.next()){
                int srno=res.getInt(1);
                String name = res.getString("NAME"); 
                System.out.println(srno+" "+ name);
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


