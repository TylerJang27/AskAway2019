import Post.java
import Question.java;
import Comment.java;
import Group.java;
import java.util.ArrayList;

public class Instructor extends User {

	//constructor for an Instructor
	public Instructor(String myUserID, String myEmail, String myName, String myPassHash) {
		this.strikeList = new ArrayList<>();
		this.userID = myUserID;
		this.email = myEmail;
		this.name = myName;
		this.passHash = myPassHash;
		this.instructor = true;
	}

	//default constructor for an Instructor
	public Instructor() {
		this("0", "example@example.com", "example", "");
	}

	//returns this Instructor, such that it can be integrated into the database
	public Instructor createNew() {
		return this;
	}

	//returns a Comment object to be asked, such that it can be integrated into the database
	public Post askComment(String text) {
		return (new Comment(text, userID));
		//TODO: FIX QUESTION CONSTRUCTOR
	}

}

