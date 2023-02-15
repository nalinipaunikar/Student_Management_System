import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {
    public void insertStudent(){
        Student sd = new Student();
        System.out.println("Enter the details of Student:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id for student:");
        sd.setId(sc.nextInt());
        System.out.println("Enter the name for student:");
        sd.setName(sc.next());
        System.out.println("Enter the address for student:");
        sd.setAddress(sc.next());
        System.out.println("Enter the email for student:");
        sd.setEmail(sc.next());
        System.out.println("Enter the branch for student:");
        sd.setBranch(sc.next());
        System.out.println("Enter the year for student:");
        sd.setYear(sc.next());
        System.out.println("Enter the collegename for student:");
        sd.setCollegename(sc.next());
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            st.executeUpdate("insert into student values('"+sd.getId()
                                                               +"','"+sd.getName()
                                                               +"','"+sd.getAddress()
                                                               +"','"+sd.getEmail()
                                                               +"','"+sd.getBranch()
                                                               +"','"+sd.getYear()
                                                               +"','"+sd.getCollegename()+"')");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
