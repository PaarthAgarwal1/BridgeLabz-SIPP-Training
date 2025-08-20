package StudentRecordsManagement;

public class Main {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Sample operations
        list.AddatEnd(new Student(101, "Alice", 20, 'A'));
        list.AddatBeginning(new Student(102, "Bob", 21, 'B'));
        list.AddatPos(new Student(103, "Charlie", 19, 'C'), 1);

        list.displayAll();

        list.updateGrade(102, 'A');
        list.deleteByRollno(103);

        list.displayAll();

        Student s = list.searchByRollNumber(101);
        if (s != null) s.display();
        else System.out.println("Student not found.");
    }
}

