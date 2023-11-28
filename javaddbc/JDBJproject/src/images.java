import java.sql.*;
import java.io.*;
public class images {
    public static void main(String args[]){

        //making the connection with the java to the database with the mysql


       try{

        Class.forName("com.mysql.cj.jdbc.Driver");
        //connection with the database 
        String url = "jdbc:mysql://localhost:3306/chandan";
        String username = "root";
        String password = "C@nt3rbur";

        Connection connec = DriverManager.getConnection(url, username, password);


        //sendin the query

        String q = "insert into images(pic) values(?)";
        PreparedStatement psmt = connec.prepareStatement(q);

        FileInputStream files =  new FileInputStream("src/956103-hacking-text-black-background-minimalism-network.png");

        psmt.setBinaryStream(1,files,files.available() );

        psmt.executeUpdate();

        System.out.println("done...");



       }catch(Exception a){
        System.out.println(a);
       }

    }
}
