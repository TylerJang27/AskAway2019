import java.util.ArrayList;

public class User {

    protected ArrayList<Question> strikeList;
    protected String userID;
    protected String email;
    protected String name;
    protected String passHash;
    protected boolean instructor;

    //String sha256hex = DigestUtils.sha256Hex(originalString);

    //accessor for the number of strikes a user has accumulated
    public int getNumStrikes() {
        return strikeList.size(); //TODO: check to make sure the Questions were actually struck here?
    }

    //accessor for the user's ID
    public String getUserID() {
        return userID;
    }

    //accessor for the user's email
    public String email() {
        return email;
    }

    //accessor for the user's name
    public String name() {
        return name;
    }

    //tests whether the entered pass is equal to the pass hash
    public boolean validPass(String enteredPass) {
        return passHash.equals(enteredPass);
    }

    //accessor for the user's instructor status
    public boolean getInstructor() {
        return instructor;
    }
}

