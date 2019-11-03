import java.util.ArrayList;
import java.util.Date;

public class Post implements Comparable<Post> {
    private String text;
    private Date timestamp;
    private int upvotes;
    private boolean isFlagged;
    private boolean isStrike;
    private String askerID;
    private String postID;
    private int recencyThresh; //time until no longer considered recent, in milliseconds
    private boolean isRecent;
    private String flaggedBy;
    private String struckBy;
    private ArrayList<String> voters;

    public Post(String tex, User asker) {
        text = tex;
        askerID = asker.getUserID();
        isFlagged = false;
        isStrike = false;
        timestamp = new Date();
        recencyThresh = 300 * 1000;
    }

    @Override
    public int compareTo(Post other) {
        getRecency();
        if (this.isRecent && !other.isRecent){
            return 1;
        }
        if (!this.isRecent && other.isRecent){
            return -1;
        }
        return (int)(-this.timestamp.getTime()+other.timestamp.getTime()); //FIXME maybe switch sign?
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public boolean getRecency()
    {
        Date now = new Date();
        if (now.getTime()-timestamp.getTime()<recencyThresh)
        {
            isRecent = true;
        }
        else {
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
            if (upvotes==Integer.MAX_VALUE)
            {
                return upvotes;
            }
            return ++upvotes;
        }
    }

    public Post flag(User user) {
        //need confirmation for flagging? Also unflagging?
        if (isFlagged){
            return this;
        }
        isFlagged = true;
        flaggedBy = user.getUserID();
        return this;
    }

    public Post strike(User user) {
        if (user instanceof Instructor)
        {
            return this;
        }
        isStrike = true;
        struckBy = user.getUserID();
        return this;
    }
}
