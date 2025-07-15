package br.com.dio.challenge.domain;

public abstract class Content {
    protected static final double STARTING_EXPERIENCE = 10d;

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double calculateExperience();
}
