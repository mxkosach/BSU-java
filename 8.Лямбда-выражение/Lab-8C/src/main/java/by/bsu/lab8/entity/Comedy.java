package by.bsu.lab8.entity;

import java.sql.Time;

public class Comedy extends DomesticFilm{
    private int id;
    private String name;
    private int time;
    private String actors;
    private String note;

    public Comedy() {
    }
    @Override
    public void see() {
        System.out.println(toString() + "Я смотрю комедию.");
    }

    public Comedy(int id, String name, int time, String actors, String note) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.actors = actors;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Comedy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", actors='" + actors + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}