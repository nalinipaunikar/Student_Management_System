import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateStudent {
    public void updatestudent(){
        Student s1 = new Student();
        System.out.println("Enter the details of Student:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id for student:");
        s1.setId(sc.nextInt());
        System.out.println("Enter the name for student:");
        s1.setName(sc.next());
        System.out.println("Enter the address for student:");
        s1.setAddress(sc.next());
        System.out.println("Enter the email for student:");
        s1.setEmail(sc.next());
        System.out.println("Enter the branch for student:");
        s1.setBranch(sc.next());
        System.out.println("Enter the year for student:");
        s1.setYear(sc.next());
        System.out.println("Enter the collegename for student:");
        s1.setCollegename(sc.next());
        try {
            String url = "jdbc:mysql://localhost:3306/student_management_system";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            st.executeUpdate("update student SET name  = '"+s1.getName()
                                                               +"',address = '"+s1.getAddress()
                                                               +"',email = '"+s1.getEmail()
                                                               +"',branch = '"+s1.getBranch()
                                                               +"',year = '"+s1.getYear()
                                                               +"',collegename = '"+s1.getCollegename()
                                                               +"' where id = '"+s1.getId()+"'");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
