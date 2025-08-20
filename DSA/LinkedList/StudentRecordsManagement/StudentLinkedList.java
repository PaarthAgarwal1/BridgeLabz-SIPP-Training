package StudentRecordsManagement;

public class StudentLinkedList {
private Node head;

// Add at beginning

public void AddatBeginning(Student student ) {
	Node newNode= new Node(student);
	newNode.next=head;
	head=newNode;
}

// Add at end
public void AddatEnd(Student student) {
	Node newNode= new Node(student);
	if(head==null) {
		head=newNode;
		return ;
	}
	Node curr=head;
	while(curr.next!=null) {
		curr=curr.next;
		curr.next=newNode;
	}
	}
	
// Add at pos

	public void AddatPos(Student student, int pos) {
		if (pos == 0) {
            AddatBeginning(student);
            return;
        }
        Node newNode = new Node(student);
        Node current = head;
        for (int i=0;i<pos-1 && current!=null; i++) {
            current = current.next;

        if (current == null) {
            System.out.println("Null");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    }
	
	// Delete by rollno
        public void deleteByRollno(int rollNumber) {
            if (head == null) return;

            if (head.data.getRollno() == rollNumber) {
                head = head.next;
                System.out.println("Student with roll " + rollNumber + " deleted.");
                return;
            }

            Node current = head;
            while (current.next != null && current.next.data.getRollno() != rollNumber)
                current = current.next;

            if (current.next == null) {
                System.out.println("Student not found.");
                return;
            }

            current.next = current.next.next;
            System.out.println("Student with roll " + rollNumber + " deleted.");
        }
        
        // Search by Roll Number
        public Student searchByRollNumber(int rollNumber) {
            Node current = head;
            while (current != null) {
                if (current.data.getRollno() == rollNumber)
                    return current.data;
                current = current.next;
            }
            return null;
        }

        // Display all students
        public void displayAll() {
            if (head == null) {
                System.out.println("No student records.");
                return;
            }
            Node current = head;
            while (current != null) {
                current.data.display();
                current = current.next;
            }
        }

        // Update grade by Roll Number
        public void updateGrade(int rollNumber, char newGrade) {
            Student student = searchByRollNumber(rollNumber);
            if (student != null) {
                student.setGrade(newGrade);
                System.out.println("Grade updated.");
            } else {
                System.out.println("Student not found.");
            }
        }
    }