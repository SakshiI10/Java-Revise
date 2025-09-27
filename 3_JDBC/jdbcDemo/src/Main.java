import javax.naming.Name;
import java.sql.*;

public class Main {
    private static final String url="jdbc:mysql://127.0.0.1:3306/sys";
    private static final String userName="root";
    private static final String password="root123";

    public static void main(String[] args) {
        try {
            // 2. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Create connection 3
            Connection conn=DriverManager.getConnection(url, userName, password);

            // 4. Create statement
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM PERSONS");

            // 5. Execute query
            ResultSet res=ps.executeQuery();
            System.out.println("ID"+" "+"NAME");

            while(res.next()){
                int srno=res.getInt(1);
                String name = res.getString("Name");
                System.out.println(srno+" "+ name);
            }

            // 6. Close connection
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}