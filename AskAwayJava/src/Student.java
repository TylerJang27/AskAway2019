import java.util.ArrayList;

public class Student extends User {

	//constructor for a Student
	public Student(ArrayList<Question> myStrikeList, String myUserID, String myEmail, String myName, String myPassHash) {
		this.strikeList = myStrikeList;
		this.userID = myUserID;
		this.email = myEmail;
		this.name = myName;
		this.passHash = myPassHash;
		this.instructor = false;
	}

	//default constructor for a Student
	public Student() {
		this(new ArrayList<Question>(), "0", "example@example.com", "example", "");
	}

	//returns this Student, such that it can be integrated into the database
	public Student createNew() {
		return this;
	}

	//returns a Question object to be asked, such that it can be integrated into the database
	public Post askQuestion(String text) {
		return (new Question(text, userID));
		//TODO: FIX QUESTION CONSTRUCTOR
	}

	//returns a Comment object to be asked, such that it can be integrated into the database
	public Post askComment(String text) {
		return (new Comment(text, userID));
		//TODO: FIX QUESTION CONSTRUCTOR
	}

	//adds a new Strike and returns the number of strikes
	public int newStrike(Question strikeQuestion) {
		strikeList.add(strikeQuestion);
		return getNumStrikes();
	}

}

