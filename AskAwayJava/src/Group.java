
import java.util.ArrayList;
import java.util.HashSet;

public class Group {

	private HashSet<String> students;
	private String groupID;
	private String studentJoinCode;
	private String instructorJoinCode;
	private HashSet<String> instructors;
	private Survey survey;

	//constructor for a Group
	public Group(HashSet<String> myStudents, String myGroupID, String myStudentJoinCode, String myInstructorJoinCode, HashSet<String> myInstructors, Survey mySurvey) {
		this.students = myStudents;
		this.groupID = myGroupID;
		this.studentJoinCode = myStudentJoinCode;
		this.instructorJoinCode = myInstructorJoinCode;
		this.instructors = myInstructors;
		this.survey = mySurvey;
	}

	//default constructor for a Group
	public Group(String myGroupID, String myStudentJoinCode, String myInstructorJoinCode, HashSet<String> myInstructors) {
		this(new HashSet<String>(), myGroupID, myStudentJoinCode, myInstructorJoinCode, myInstructors, new Survey());
	}

	//default constructor for a Group
	public Group() {
		this(new HashSet<String>(), "0", "0", "0", new HashSet<String>, new Survey());
	}

	//adds a new student to the Group
	public addStudent(String studentID) {
		this.students.add(studentID);
	}

	//adds a new instructor to the Group
	public addInstructor(String instructorID) {
		this.instructors.add(instructorID);
	}

}
