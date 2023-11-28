package newdataconnection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.sql.*;
import java.util.Scanner;

public class s {
    public static void main(String args[]) {

        try {

            // inserting the data with java

            // making the connection at first

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/chandan";

            String username = "root";
            String password = "C@nt3rbur";

            Connection connec = DriverManager.getConnection(url, username, password);

            // inserting the data into the tablw with java

            String name = "insert into sharmaid(tName,Tcity)";

            PreparedStatement psmt = connec.prepareStatement(name);

            // taking the input from the use

            BufferedReader newrReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter your name :");
            String names = newrReader.readLine();

            System.out.println("enter your place name");
            String city = newrReader.readLine();

            // creating the querry

            psmt.setString(1, names);
            psmt.setString(2, city);

            psmt.executeUpdate();

            System.out.println("data inserted");

            // closing the conection

            connec.close();

        } catch (Exception n) {
            System.out.println(n);
        }

        // let the reading the file of inserdata

        try {

            FileReader newReader = new FileReader("src/insertingdatapreparesst.java");
            Scanner newscanner = new Scanner(newReader);

            if (newscanner.hasNextLine()) {
                String data = newscanner.nextLine();
                System.out.println(data);
            } else {
                System.out.println("failed to read file");
            }


            newscanner.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
