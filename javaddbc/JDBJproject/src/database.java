import java.sql.*;

public class database {

    public static void main(String args[]){
        try{

            //loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating the connections
            String url = "jdbc:mysql://localhost:3306/chandan";
            String username = "root";
            String password = "C@nt3rbur";
            Connection connec = DriverManager.getConnection(url,username,password);

            if(connec.isClosed()){
                System.out.println("connection is still closes");
            }else{
                System.out.println("connection created sucess..");
            }

        }catch(Exception a){
           System.out.println("connection failed check your url username password and driver");
        }
    }
}