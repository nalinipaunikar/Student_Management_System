import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStudent {
    public Boolean deleteStudent(int id){
        Boolean Result = false;
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url ,user ,pass);
            Statement st = con.createStatement();
            int StudentResult = st.executeUpdate("delete from student where id = '"+id+"'");
            if (StudentResult>0){
                Result = true;
            }



        }catch (Exception e){
            System.out.println(e);
        }
        return Result;
    }
}
