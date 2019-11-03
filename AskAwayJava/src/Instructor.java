import java.util.ArrayList;
import java.util.HashSet;

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
	public Post askComment(String text, Post parent) {
		return (new Comment(text, this, parent));
	}

	//returns a Group/session object, such that it can be integrated into the database
	public Group createGroup(String groupID) {
		String hashed = "";
		//TODO: FIX HASHING
		//String hashed = DigestUtils.sha256Hex(hashed);
		HashSet<String> theInstructors = new HashSet<String>();
		theInstructors.add(this.getUserID());
		return (new Group(groupID, hashed.substring(0, 3), hashed.substring(hashed.length()-3, hashed.length()), theInstructors));
	}

}

