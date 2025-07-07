package AcessModifiers;

public class StudentMain {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.rollNumber = 101;
        pg.name = "Rahul";
        pg.setCGPA(8.6);

        pg.showDetails();
        System.out.println("CGPA: " + pg.getCGPA());
    }
}
