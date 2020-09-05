package model;

public class ClassroomLogic {

	
	public int eligibleCapacity(Classroom classroom) {
		int capacity = 0;
		// ratio is 16 kids to one adult for school agers
		if (classroom.getAgeGroup() > 5) {
			capacity = classroom.getTeacherCount() * 16;
		}
		// ratio is 10 kids to one adult for 4-5 year olds
		else if (classroom.getAgeGroup() > 3) {
			capacity = classroom.getTeacherCount() * 10;
		}
		// ratio is 8 kids to one adult for 3 year olds
		else if (classroom.getAgeGroup() > 2) {
			capacity = classroom.getTeacherCount() * 8;
		}
		// ratio is 6 kids to one adult for 2 year olds
		else if (classroom.getAgeGroup() > 1) {
			capacity = classroom.getTeacherCount() * 6;
		}
		// ration is 4 kids to one adult for infant - 1 year olds
		else {
			capacity = classroom.getTeacherCount() * 4;
		}
		return capacity;
	}
	
	public boolean openingEligible(Classroom classroom, int tot) {
		// if total kids allowed is higher than the number of kids enrolled - eligible for opening
		if (tot > classroom.getEnrollmentCount()) {
			return true;
		}
		else {
			return false;
		}
	}
}
