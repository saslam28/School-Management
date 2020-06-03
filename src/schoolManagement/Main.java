package schoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	   
		Teacher lizzy = new Teacher( 1,  "Lizzy",  500);
		Teacher jake = new Teacher(2, "Jake", 1000);
		Teacher aslam = new Teacher(3, "Aslam", 1200);
		
		List<Teacher> teacherList = new ArrayList<>();
		
		teacherList.add(lizzy);
		teacherList.add(jake);
		teacherList.add(aslam);
		
		
		Student suleman = new Student(1, "Suleman", 7);
		Student john = new Student(2, "John", 9);
		Student mark = new Student(3, "Mark", 11);
		
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(suleman);
		studentList.add(john);
		studentList.add(mark);
		
		
		School burnage = new School(teacherList, studentList);
		
		
		
		suleman.payFees(5000);
		john.payFees(2000);
		System.out.println("Burnage has earned £" + burnage.getTotalMoneyEarned());
		
		System.out.println("-----Making School pay Salary-----");
		lizzy.recieveSalary(lizzy.getSalary());
		System.out.println("Burnage has paid a salary to" + " " + lizzy.getName() + " " + "and now has" + " "
				+ burnage.getTotalMoneyEarned());
		
}

}
