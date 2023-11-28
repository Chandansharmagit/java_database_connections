import java.sql.*;
import java.io.*;

public class insertingdatapreparesst {
    public static void main(String args[]) {

        try {
            // creating the connection with the java

            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating a connections

            String url = "jdbc:mysql://localhost:3306/chandan";
            String username = "root";
            String password = "C@nt3rbur";

            Connection connec = DriverManager.getConnection(url, username, password);



            //creating the query

            String q = "insert into table1(tName,tCity) values (?,?)";

            PreparedStatement psmt = connec.prepareStatement(q);


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter name");
            String name = br.readLine();



            System.out.println("enter the city name ");
            String city = br.readLine();

            //setting the values to the quert

            psmt.setString(1,name);
            psmt.setString(2,city);



            psmt.executeUpdate();


            System.out.println("data inserted");

            connec.close();

        } catch (Exception a) {
            System.out.println("an error occured");
        }

    }
}
