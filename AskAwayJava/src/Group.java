
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;

public class Group {

	private HashSet<String> students;
	private String groupID;
	private String studentJoinCode;
	private String instructorJoinCode;
	private HashSet<String> instructors;
	private Survey survey;
	private Date timeStart;
	private Date timeEnd;
	private ArrayList<Question> questions;
	private ArrayList<Question> recentQuestions;
	private ArrayList<Question> nonrecentQuestions;

	//constructor for a Group
	public Group(HashSet<String> myStudents, String myGroupID, String myStudentJoinCode, String myInstructorJoinCode, HashSet<String> myInstructors, Survey mySurvey, HashSet<Question> theQuestions) {
		this.students = myStudents;
		this.groupID = myGroupID;
		this.studentJoinCode = myStudentJoinCode;
		this.instructorJoinCode = myInstructorJoinCode;
		this.instructors = myInstructors;
		this.survey = mySurvey;
		this.timeStart = newDate();
		Date timeCopy = this.timeStart.copy();
		this.timeEnd = newDate(this.timeStart.getTime()+3600000);
		//TODO: Determine if this should be by Question s or String s
		for (Question s: theQuestions) {
			boolean recent = s.getRecency();
			if (recent) {
				recentQuestions.add(s);
			} else {
				nonrecentQuestions.add(s);
			}
			questions.add(s);
		}
	}

	//default constructor for a Group
	public Group(String myGroupID, String myStudentJoinCode, String myInstructorJoinCode, HashSet<String> myInstructors) {
		this(new HashSet<String>(), myGroupID, myStudentJoinCode, myInstructorJoinCode, myInstructors, new Survey(), new HashSet<Question> theQuestions);
	}

	//default constructor for a Group
	public Group() {
		this(new HashSet<String>(), "0", "0", "0", new HashSet<String>, new Survey(), new HashSet<Question> theQuestions);
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
