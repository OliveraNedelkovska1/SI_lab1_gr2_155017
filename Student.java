import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;

	// TODO constructor
	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		super();
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}
	// TODO seters & getters
	
	public String getIndex() {
		return index;
	}


	public void setIndex(String index) {
		this.index = index;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public List<Integer> getGrades() {
		return grades;
	}


	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}
	
	public double getAverage() {
		double sum =0;
		for(Integer grade : grades) {
			sum += grade;
		}
		return sum/grades.size();
	}

	public int ECTSCredits() {
		return grades.size()*6;
	}
}
