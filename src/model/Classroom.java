package model;

public class Classroom {
	private String name;
	private int ageGroup;
	private int teacherCount;
	private int enrollmentCount;
	
	public Classroom() {
		// does nothing
	}
	
	public Classroom(String n, int a, int t, int e) {
		setName(n);
		setAgeGroup(a);
		setTeacherCount(t);
		setEnrollmentCount(e);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(int ageGroup) {
		this.ageGroup = ageGroup;
	}

	public int getTeacherCount() {
		return teacherCount;
	}

	public void setTeacherCount(int teacherCount) {
		this.teacherCount = teacherCount;
	}

	public int getEnrollmentCount() {
		return enrollmentCount;
	}

	public void setEnrollmentCount(int enrollmentCount) {
		this.enrollmentCount = enrollmentCount;
	}
	
}
