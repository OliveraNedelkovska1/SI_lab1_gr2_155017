package lab;

import java.util.List;

public class Faculty {
	List<Student> students;
	String facultyName;
	
	public Faculty(List<Student> students, String facultyName) {
		super();
		this.students = students;
		this.facultyName = facultyName;
	}
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void removeStudent(Student s) {
		students.remove(s);
	}
	
	public double getAverageAllStudents() {
		double sum = 0;
		for(Student s : students) {
			sum += s.getAverage();
		}
		return sum/students.size();
	}
}
