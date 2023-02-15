import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class DeleteMultiple {
    void deletemultiple(String id){
        Boolean result = false;
        try{
            String url ="jdbc:mysql://localhost:3306/student_management_system";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            int count = st.executeUpdate("delete from student where id in ("+id+")");
            if(count!=0){
                result = true;
                System.out.println(result);
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }


}
