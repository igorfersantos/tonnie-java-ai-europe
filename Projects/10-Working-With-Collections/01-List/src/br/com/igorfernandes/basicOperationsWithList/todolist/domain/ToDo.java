package br.com.igorfernandes.basicOperationsWithList.todolist.domain;

import java.util.Objects;

public class ToDo {
    private String description;

    public ToDo() {
    }

    public ToDo(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ToDo toDo)) return false;
        return Objects.equals(description, toDo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(description);
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "description='" + description + '\'' +
                '}';
    }
}
