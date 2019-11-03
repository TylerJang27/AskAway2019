public class Comment extends Post {
    private boolean instructor;
    private String parentID;
    private int upvotes; //FIXME see constructor
    private boolean isRecent; //FIXME see constructor

    public Comment(String tex, User author, Post parent) {
        super(tex, author);
        parentID = parent.getID();
        if (author instanceof Instructor)
        {
            upvotes = Integer.MAX_VALUE; //FIXME uncertain if I need to make a new instance variable/how that works
            isRecent = true; //FIXME same issue
        }
    }

    @Override
    public boolean getRecency() {
        return true;
    }
}
