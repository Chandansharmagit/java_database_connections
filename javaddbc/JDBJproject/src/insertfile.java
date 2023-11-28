
// import java.sql.Connection;
import java.sql.*;
// import java.sql.DriverManager;

public class insertfile {
    public static void main(String args[]) {
        try {
            // loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating the connections
            String url = "jdbc:mysql://localhost:3306/chandan";
            String username = "root";
            String password = "C@nt3rbur";
            Connection connec = DriverManager.getConnection(url, username, password);



            //creating the query

            String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(400))";

           Statement stmt =  connec.createStatement();
           stmt.executeUpdate(q);
           System.out.println("tabla has been added in the database");

           connec.close();


        } catch (Exception e) {
            System.out.println("an error ocured");
        }
    }
}
