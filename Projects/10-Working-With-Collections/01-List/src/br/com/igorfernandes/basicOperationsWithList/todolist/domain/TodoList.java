package br.com.igorfernandes.basicOperationsWithList.todolist.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * A class with A list of To-Dos and some operations with them
 * @author Igor
 */
public class TodoList {
    private List<ToDo> toDos;

    public TodoList() {
        this.toDos = new ArrayList<>();
    }

    public TodoList(List<ToDo> toDos) {
        this.toDos = toDos;
    }

    // Not asked but I did to practice
    public Optional<ToDo> getTodo(String description) {
        return toDos.stream().filter(toDo -> toDo.getDescription().equals(description)).findFirst();
    }

    public void addTodo(String description) {
        toDos.add(new ToDo(description));
    }

    public boolean removeTodo(String description) {
        var toDosToRemove = toDos.stream()
                .filter(ToDo -> ToDo.getDescription().equals(description))
                .collect(Collectors.toList());
        if (toDosToRemove.isEmpty())
            return false;

        toDos.removeAll(toDosToRemove);
        return true;
    }

    public int getTodoCount() {
        return toDos.size();
    }

    public List<String> getAllTodosDescriptions() {
        return toDos.stream().map(toDo -> toDo.getDescription()).collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TodoList todoList)) return false;
        return Objects.equals(toDos, todoList.toDos);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(toDos);
    }

    @Override
    public String toString() {
        return "br.com.igorfernandes.basicOperationsWithList.todolist.domain.TodoList{" +
                "toDos=" + toDos +
                '}';
    }
}

