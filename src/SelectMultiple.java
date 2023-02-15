import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectMultiple {
   void selectMultiple(List<Integer> ids){
       Student sc = new Student();
       try {
           String url = "jdbc:mysql://localhost:3306/student_management_system";
           String user = "root";
           String pass = "";
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection(url, user, pass);
           Statement st = con.createStatement();
           for(int i = 0 ; i<ids.size();i++){
               ResultSet rs = st.executeQuery("Select * from student where id = ('"+ids.get(i)+"')");
               while (rs.next()){
                   sc.setId(rs.getInt(1));
                   sc.setName(rs.getString(2));
                   sc.setAddress(rs.getString(3));
                   sc.setEmail(rs.getString(4));
                   sc.setBranch(rs.getString(5));
                   sc.setYear(rs.getString(6));
                   sc.setCollegename(rs.getString(7));
                   System.out.println("\n\n");
                   System.out.println("Id:" + sc.getId() + "\n" +
                           "Name:" + sc.getName() + "\n" +
                           "Address:" + sc.getAddress() + "\n" +
                           "Email:" + sc.getEmail() + "\n" +
                           "Branch:" + sc.getBranch() + "\n" +
                           "Year:" + sc.getYear() + "\n" +
                           "CollegeName:" + sc.getCollegename());
               }
           }

       }catch (Exception e){
           System.out.println(e);
       }
   }
}
