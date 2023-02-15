

public class InsertMultiple {
   void insertMultiple(int id){
       InsertStudent insertresult = new InsertStudent();
       for (int i=0; i<id; i++){
           System.out.println("For student no.: +(i+1)");
           insertresult.insertStudent();
       }
   }

}
