package uy.edu.um.prog2.adt.Entities;

public class HashTag {
    public HashTag(long id, String text) {
        this.id = id;
        this.text = text;
    }

    private long id;
    private String text;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
