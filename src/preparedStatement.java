import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedStatement {
    public static void main(String[] args) throws SQLException {

        int sid = 102;
        String sname = "Z";
        int marks = 48;

        String url = "jdbc:postgresql://localhost:5434/demo";
        String uname = "postgres";
        String pass = "Nisarga@913707";
        String sql = "insert into student values (?, ?, ?)";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Established");

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

        st.execute(); // ✅ fixed line

        con.close();
        System.out.println("Connection Closed");
    }
}
