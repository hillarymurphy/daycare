package model;

public class Attendee {
	private String name;
	private int age;
	private String gender;
	private String pottyTrained;
	private String developmentLevel;
	private Classroom currentClass;
		
	public Attendee() {
		//does nothing
	}
	
	public Attendee(String n, int a, String g, String pt, String dl, Classroom cc) {
		setName(n);
		setAge(a);
		setGender(g);
		setPottyTrained(pt);
		setDevelopmentLevel(dl);
		setCurrentClass(cc);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPottyTrained() {
		return pottyTrained;
	}

	public void setPottyTrained(String pottyTrained) {
		this.pottyTrained = pottyTrained;
	}

	public String getDevelopmentLevel() {
		return developmentLevel;
	}

	public void setDevelopmentLevel(String developmentLevel) {
		this.developmentLevel = developmentLevel;
	}

	public Classroom getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(Classroom currentClass) {
		this.currentClass = currentClass;
	}



}
