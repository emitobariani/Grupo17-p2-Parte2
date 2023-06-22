package uy.edu.um.prog2.adt.Entities;

import java.time.LocalDate;
import java.util.Objects;

public class HashTag {
    public HashTag(long id, String text, LocalDate date) {
        this.id = id;
        this.text = text;
        this.date = date;
    }

    private long id;
    private String text;

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

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

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof HashTag)) {
            return false;
        }
        HashTag h = (HashTag) o;
        return Objects.equals(text, h.text);
    }
}

