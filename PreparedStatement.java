import java.sql.*;

public class PreparedStatementDemo{

    public static void main(String[]args)  throws SQLException{

            String url = "jdbc:postgresql://localhost:5432/demo";
            String user = "postgres";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);

            int sid = 101;
            String sname = "Max";
            int marks = 47;
            String query = "insert into student values (?, ?, ?)";

            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, sid);
            st.setString(2, sname);
            st.setInt(3, marks);

            st.execute();

            con.close();
    }
}

/*
PreparedStatement is used when we have dynamic data.
We can just put '?' in the query and set the values later.
 */
