

import java.sql.*;

public class CRUDOperation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the result
        close
         */
        String url="jdbc:postgresql://localhost:5434/demo";
        String uname="postgres";
        String pass="Nisarga@913707";
        String sql="delete from student where sid=5";

        //Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        st.execute(sql);


        con.close();
        System.out.println("Connection Closed");

    }
}
