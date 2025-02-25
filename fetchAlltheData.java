//1.
import java.sql.*;


public class DemaJDBC {
    public static void main(String[] args) throws Exception {
        /*
            steps:
            1. import package
            2. load and register
            3. create connection
            4. create statement
            5. execute statement
            6. process the results
            7.close
        */

        //3.1(part of step 3)
        String url = "jdbc:postgresql://localhost:5432/Demo";   //javaWillConnectingWithJDBC:JDBCwillConnectWithDBMS://ipAddress:PortNumber/DBName
        String uname = "postgres";
        String pass = "0000";
        String sql = "select * from student";



        //2.(optional)
        Class.forName("org.postgresql.Driver");

        //3.
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        //4.
        Statement st = con.createStatement();

        //5.
        ResultSet rs = st.executeQuery(sql);
//        rs.next();
//
//        //6.
//        String name = rs.getString("sname");   //-->gives bool val: why-->BTS if you have next row then it return true ow false
//        System.out.println("Name of the student is " + name);

        while(rs.next()){
            System.out.print(rs.getInt(1) + " - ");
            System.out.print(rs.getString(2) + " - ");
            System.out.println(rs.getInt(3));

        }

        //7.
        con.close();

        System.out.println("Connection Closed");


    }
}
