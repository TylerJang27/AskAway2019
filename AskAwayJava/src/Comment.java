public class Comment extends Post {
    private boolean instructor;
    private String parentID;

    public Comment(String tex, String authorID, Post parent, String posID) {
        super(tex, authorID, posID);
        parentID = parent.getPostID();
        instructor = false;
    }

    public Comment(String tex, User author, Post parent, String posID) {
        this(tex, author.getUserID(), parent, posID);
        if (author instanceof Instructor) {
            isRecent = true;
            upvotes = Integer.MAX_VALUE;
            instructor = true;
        }
    }

    @Override
    public boolean getRecency() {
        return true;
    }

    public boolean isInstructor() {
        return instructor;
    }
}
