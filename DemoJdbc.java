import java.sql.*;  //step1

public class DemoJdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        7 steps:
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
         */


        Class.forName("org.postgresql.Driver"); //step2(optional)

        //step3
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "";
        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("connection established");

        //step4
        Statement st = con.createStatement();

        //step5
//      String query = "select sname from student where sid = 1";
//      String query = "select * from student";  //read
//      String query = "insert into student values (6, 'Priyanshu', 91)";  //insert
//      String query = "update student set sname = 'Max' where sid = 6";  //update
        String query = "delete from student where sname = 'Max'"; //delete
        //step6
        /*
        -------------This is to read
//        ResultSet rs = st.executeQuery(query);
//        System.out.println(rs.next());  //this just prints true if we get the data or false otherwise
//        rs.next();  //by default, the pointer is before the first row in result so compulsorily do this to point to first row
//        String name = rs.getString("sname");
//        System.out.println(name);
//        while (rs.next()){
//            System.out.print(rs.getInt(1) + " : ");
//            System.out.print(rs.getString(2) + " " );
//            System.out.println(rs.getInt(3));
//        }
*/
//        -------------This is to insert, update
//        boolean status = st.execute(query); //false means it was a insert, delete or update query. true means it returns a ResultSet(read query)
          st.execute(query); //normally we directly write  this
//        System.out.println(status);


        //step7
        con.close();
        System.out.println("connection closed");
    }
}
