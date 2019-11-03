public class Question extends Post {
    private boolean isResolved;
    private String resolvedBy;

    public Question(String tex, String askID) {
        super(tex, askID);
        isResolved = false;
    }

    public Post resolve(User user) {
        if (isResolved) {
            return this;
        }
        isResolved = true;
        resolvedBy = user.getUserID();
        return this;
    }
}
