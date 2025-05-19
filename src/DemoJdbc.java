
import java.sql.*;

public class DemoJdbc {
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
        String sql="select * from student";

        //Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        /*if(rs.next()){
        String Sname= rs.getString("name");
        System.out.println("name of a student is "+ Sname);
        }
        else {
            System.out.println("No student found");
        }
        */

        while(rs.next()){
            System.out.print(rs.getInt(1)+" - "+rs.getString(2)+" - "+rs.getInt(3)) ;
            System.out.println();
        }

        con.close();
        System.out.println("Connection Closed");

    }
}
