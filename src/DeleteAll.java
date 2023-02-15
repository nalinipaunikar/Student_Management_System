import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteAll {
    void deleteAll(){
        Boolean result = false;
        try{
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String user= "root";
            String pass ="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            int count = st.executeUpdate("delete from student");
            if(count != 0){
                result = true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(result);
    }

    }

