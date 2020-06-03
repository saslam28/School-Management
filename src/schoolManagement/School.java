package schoolManagement;

import java.util.List;

public class School {
	
	// We can use an array as there will be many teachers and students at the school
	// However the school may have different amount of teachers or students each day
	// Therefore an array list is used
	

	private List<Teacher> teachers ;
	private List<Student> students;
	
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	// new school object is created below
	// teachers - this syntax is a list of teachers in school
	// students - this syntax is list of students in school
	
	public School(List<Teacher> teachers, List<Student> students) {
		
		this.teachers = teachers;
		this.students = students;
		
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
		
		
		
	}
	
	// getTeachers returns a list of teachers in the school
	
	public List<Student> GetStudents() {
		return students;
	}
 	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public List<Teacher> GetTeachers() {
		return teachers;
	}
 	
	// add a teacher to the school
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	// Get method is used to return toal money earned by the school
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	//
	
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	public static void updateTotalMoneySpent( int moneySpent) {
		
		
		totalMoneyEarned -= moneySpent;
	}
	
	
	
	
	
	
	
}
