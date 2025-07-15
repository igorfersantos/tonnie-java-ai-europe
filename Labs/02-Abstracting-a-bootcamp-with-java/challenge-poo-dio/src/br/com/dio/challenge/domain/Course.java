package br.com.dio.challenge.domain;

public class Course extends Content{
    private int workload;


    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }

    @Override
    public double calculateExperience() {
        return STARTING_EXPERIENCE * workload;
    }
}
