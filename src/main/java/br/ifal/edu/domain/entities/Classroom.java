package br.ifal.edu.domain.entities;

public class Classroom {
    private int id;
    private String title;
    private String content;

    public Classroom( String title, String content) {
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
