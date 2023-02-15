import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SelectAll {
    void selectAll(){
        Student s1 = new Student();
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url ,user ,pass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            while (rs.next()){
                s1.setId(rs.getInt(1));
                s1.setName(rs.getString(2));
                s1.setAddress(rs.getString(3));
                s1.setEmail(rs.getString(4));
                s1.setBranch(rs.getString(5));
                s1.setYear(rs.getString(6));
                s1.setCollegename(rs.getString(7));
                System.out.println("Id:"+s1.getId()+"\n"+
                        "Name:"+s1.getName()+"\n"+
                        "Address:"+s1.getAddress()+"\n"+
                        "Email:"+s1.getEmail()+"\n"+
                        "Branch:"+s1.getBranch()+"\n"+
                        "Year:"+s1.getYear()+"\n"+
                        "Collegename:"+s1.getCollegename());

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
