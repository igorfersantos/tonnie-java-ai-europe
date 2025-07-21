package br.com.igorfernandes.basicOperationsWithList.todolist;

import br.com.igorfernandes.basicOperationsWithList.todolist.domain.TodoList;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        // Add
        todoList.addTodo("Make the day rain!");
        todoList.addTodo("Make the day rain!");
        todoList.addTodo("Wash the kitchen");
        todoList.addTodo("Make bed");
        System.out.println("=====Add=====");
        System.out.println(todoList);
        System.out.println();
        System.out.println();
        // Remove
        System.out.println("=====Remove=====");
        // Note: I know I could've just printed the variable and done a direct remove
        // but I wanted to practice the making of a get function
        String TodoToRemoveDescription = "Make the day rain!";
        var todo = todoList.getTodo(TodoToRemoveDescription);
        if (todo.isPresent()) {
            System.out.printf("Todo(s) \"%s\" removed: %s\n", todo.get().getDescription(), todoList.removeTodo(
                    "Make the day rain!"));
            System.out.println(todoList);
        }
        System.out.println();
        // Get total number of ToDos
        System.out.println("====ToDo-Count=====");
        System.out.println(todoList.getTodoCount());
        System.out.println();
        // Get descriptions
        System.out.println("=====ToDo-Descriptions=====");
        System.out.println(todoList.getAllTodosDescriptions());
    }
}