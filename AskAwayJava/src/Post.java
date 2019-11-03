import java.util.ArrayList;
import java.util.Date;

public class Post implements Comparable<Post> {
    private String text;
    private Date timestamp;
    protected int upvotes;
    private boolean isFlagged;
    private boolean isStrike;
    private String askerID;
    private String postID;
    private int recencyThresh; //time until no longer considered recent, in milliseconds
    protected boolean isRecent;
    private String flaggedBy;
    private String struckBy;
    private ArrayList<String> voters;

    public Post(String tex, String askID, String posID) {
        text = tex;
        askerID = askID;
        postID = posID;
        isFlagged = false;
        isStrike = false;
        timestamp = new Date();
        recencyThresh = 300 * 1000;
    }

    public Post() {
        text = "default post text";
        isFlagged = false;
        isStrike = false;
        postID = "a default ID";
        timestamp = new Date();
        recencyThresh = 300 * 1000;
    }

    @Override
    public int compareTo(Post other) {
        getRecency();
        if (this.isRecent && !other.isRecent) {
            return 1;
        }
        if (!this.isRecent && other.isRecent) {
            return -1;
        }
        return (int) (-this.timestamp.getTime() + other.timestamp.getTime()); //FIXME maybe switch sign?
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public boolean getRecency() {
        Date now = new Date();
        if (now.getTime() - timestamp.getTime() < recencyThresh) {
            isRecent = true;
        } else {
            isRecent = false;
        }
        return isRecent;
    }

    public String getAskerID() {
        return askerID;
    }

    public String getPostID() {
        return postID;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getText() {
        return text;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int upvote(User user) {
        if (voters.contains(user.getUserID())) {
            return upvotes;
        } else {
            voters.add(user.getUserID());
            if (upvotes == Integer.MAX_VALUE) {
                return upvotes;
            }
            return ++upvotes;
        }
    }

    public Post flag(User user) {
        //need confirmation for flagging? Also unflagging?
        if (isFlagged) {
            return this;
        }
        isFlagged = true;
        flaggedBy = user.getUserID();
        return this;
    }

    public Post strike(User user) {
        if (user instanceof Instructor) {
            return this;
        }
        isStrike = true;
        struckBy = user.getUserID();
        return this;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Post)) {
            return false;
        }
        Post ob = (Post) o;
        if (!this.timestamp.equals((ob).timestamp)) return false;
        if (!this.text.equals(ob.text)) return false;
        if (!this.postID.equals(ob.postID)) return false;
        return this.askerID==ob.askerID;
    }
}
