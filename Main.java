import mypackage.student.Student;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student("Faustyna Maciejczuk", 21, 165);

        student1.PrintData();
        student2.PrintData();
    }
}