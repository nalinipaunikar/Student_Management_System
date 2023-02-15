import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Student_Management_System {
    public static void main(String[] args) {

        int i = 9;
        while (i < 10) {

            InsertStudent insertstudent = new InsertStudent();
            SelectStudent selectstudent = new SelectStudent();
            UpdateStudent updatestudent = new UpdateStudent();
            DeleteStudent deleteStudent = new DeleteStudent();
            InsertMultiple insertmultiple = new InsertMultiple();
            SelectMultiple selectMultiple = new SelectMultiple();
            UpdateMultiple updateMultiple = new UpdateMultiple();
            DeleteMultiple deleteMultiple = new DeleteMultiple();
            SelectAll selectAll = new SelectAll();
            DeleteAll deleteAll = new DeleteAll();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the command:");
            String sa = sc.nextLine();

            if (sa.equals("insert")) {
                System.out.println("INSERT");
                insertstudent.insertStudent();
            }

            if (sa.equals("select")) {
                System.out.println("SELECT");
                selectstudent.SelectStudent(sc.nextInt());
            }

            if (sa.equals("update")) {
                System.out.println("UPDATE");
                updatestudent.updatestudent();
            }

            if (sa.equals("delete")) {
                System.out.println("DELETE");
                deleteStudent.deleteStudent(sc.nextInt());
            }

            if (sa.equals("insert multiple")) {
                System.out.println("INSERT MULTIPLE");
                System.out.println("Enter the number of students:");
                int id = sc.nextInt();
                insertmultiple.insertMultiple(id);
            }

            if (sa.equals("select multiple")) {
                System.out.println("SELECT MULTIPLE");
                List<Integer> ids = new ArrayList<>();
                System.out.println("Enter the total total no. of students:");
                int a = sc.nextInt();
                for (int j = 0; j < a; j++) {
                    System.out.println("Enter the id of student:" + (j + 1));
                    ids.add(sc.nextInt());
                }
                selectMultiple.selectMultiple(ids);
            }

            if (sa.equals("update multiple")) {
                System.out.println("UPDATE MULTIPLE");
                System.out.println("Enter the no. of students:");
                int s = sc.nextInt();
                List<Integer> idList = updateMultiple.UpdateMul(s);
                selectMultiple.selectMultiple(idList);
            }

            if (sa.equals("delete multiple")) {
                System.out.println("DELETE MULTIPLE");
                System.out.println("Enter the ids of student:");
                deleteMultiple.deletemultiple(sc.next());
            }

            if (sa.equals("select all")) {
                System.out.println("SELECT ALL");
                selectAll.selectAll();
            }

            if (sa.equals("delete all")) {
                System.out.println("DELETE ALL");
                deleteAll.deleteAll();
            }
            if (sa.equals("stop")){
                break;
            }
        }
    }
    }