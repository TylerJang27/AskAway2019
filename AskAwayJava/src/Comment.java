public class Comment extends Post {
    private boolean instructor;
    private String parentID;

    public Comment(String tex, String authorID, Post parent) {
        super(tex, authorID);
        parentID = parent.getPostID();
        instructor = false;
    }

    public Comment(String tex, User author, Post parent) {
        this(tex, author.getUserID(), parent);
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
