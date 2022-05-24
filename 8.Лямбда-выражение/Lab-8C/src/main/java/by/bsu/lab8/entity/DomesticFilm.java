package by.bsu.lab8.entity;

public class DomesticFilm implements Film{
    private int id;
    private String filmGenre;
    private String description;

    public DomesticFilm() {
    }

    public DomesticFilm(int id, String filmGenre, String description) {
        this.id = id;
        this.filmGenre = filmGenre;
        this.description = description;
    }
    @Override
    public void see() {
        System.out.println(toString() + "Я смотрю домашний фильм.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DomesticFilm{" +
                "id=" + id +
                ", filmGenre='" + filmGenre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}