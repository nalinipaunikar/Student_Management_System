import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStudent {
    public void SelectStudent(int id) {
        try {
            Student sd = new Student();
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where id = '" + id + "'");
            while (rs.next()) {
                sd.setId(rs.getInt(1));
                sd.setName(rs.getString(2));
                sd.setAddress(rs.getString(3));
                sd.setEmail(rs.getString(4));
                sd.setBranch(rs.getString(5));
                sd.setYear(rs.getString(6));
                sd.setCollegename(rs.getString(7));

            }
            System.out.println("Id:" + sd.getId() + "/n" +
                            "name:" + sd.getName() + "/n"+
                    "address:" + sd.getAddress() + "/n" +
                            "email:" + sd.getEmail() + "/n" +
                            "branch:" + sd.getBranch() + "/n" +
                            "year:" +sd.getYear()+"/n"+
                             "collegename:" +sd.getCollegename()+"/n");
        }catch (Exception e) {
            System.out.println(e);
        }
        }
    }
