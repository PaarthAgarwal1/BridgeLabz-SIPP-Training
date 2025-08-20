package StudentRecordsManagement;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private char grade;

	public Student(int rollno, String name, int age ,char grade) {
		this.rollno= rollno;
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setGrade(char grade) {
		this.grade=grade;
	}
	
	public void display() {
	      System.out.println("Roll No: " + rollno + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
	      
	}
}
