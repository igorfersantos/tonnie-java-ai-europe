package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> completedContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void advanceContentTrackProgress() {
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if (content.isEmpty()) {
            System.out.println("You're not subscribed to at least one content");
            return;
        }
        this.completedContents.add(content.get());
        this.subscribedContents.remove(content.get());
    }

    public double calculateTotalExperience() {
        return this.completedContents
                .stream()
                .mapToDouble(completedContents -> completedContents.calculateExperience())
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContents, dev.subscribedContents) &&
                Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, completedContents);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", subscribedContents=" + subscribedContents +
                ", completedContents=" + completedContents +
                '}';
    }
}
