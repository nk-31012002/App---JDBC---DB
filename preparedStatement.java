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

        int sid = 102;
        String sname = "Jasmine";
        int marks = 52;


        String url = "jdbc:postgresql://localhost:5432/Demo";   //javaWillConnectingWithJDBC:JDBCwillConnectWithDBMS://ipAddress:PortNumber/DBName
        String uname = "postgres";
        String pass = "0000";
        String sql = "insert into student values (?,?,?)";


        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st = con.prepareStatement(sql);

        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);


        st.execute();






        con.close();

    }
}
