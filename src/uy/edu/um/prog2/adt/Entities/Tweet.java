package uy.edu.um.prog2.adt.Entities;

import uy.edu.um.prog2.adt.TADs.HashMap.HashMap;
import uy.edu.um.prog2.adt.TADs.ListaEnlazada.Lista;

public class Tweet {
    public Tweet(long id, String content, String source, boolean isRetweet) {
        this.id = id;
        this.content = content;
        this.source = source;
        this.isRetweet = isRetweet;
    }

    private long id;
    private String content;
    private String source;
    private boolean isRetweet;
    private HashMap<String ,HashTag> HashHashTag;

    public HashMap<String, HashTag> getHashHashTag() {
        return HashHashTag;
    }

    public void setHashHashTag(HashMap<String, HashTag> hashHashTag) {
        HashHashTag = hashHashTag;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isRetweet() {
        return isRetweet;
    }

    public void setRetweet(boolean retweet) {
        isRetweet = retweet;
    }
}