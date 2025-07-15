package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content{
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public double calculateExperience() {
        return STARTING_EXPERIENCE + 20d;
    }
}
