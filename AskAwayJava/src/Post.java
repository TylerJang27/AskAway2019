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
        if (this.isRecent)//FIXME ============================
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public boolean getRecency()
    {
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
