package setsearch.domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class TaskList {
    private Set<Task> taskSet;

    public TaskList() {
        taskSet = new HashSet<>();
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "taskSet=" + taskSet +
                '}';
    }

    public void addTask(final String description) {
        taskSet.add(new Task(description, false));
    }

    public void removeTask(final String description) {
        taskSet.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
    }

    public void showTasks() {
        System.out.println(taskSet);
    }

    public int countTasks() {
        return taskSet.size();
    }

    public Set<Task> getDoneTasks() {
        return taskSet.stream().filter(Task::isDone).collect(Collectors.toSet());
    }

    public Set<Task> getUnfinishedTasks() {
        return taskSet.stream().filter(task -> !task.isDone()).collect(Collectors.toSet());
    }

    public void markTaskDone(String description) {
        for (Task task : taskSet) {
            if (!task.getDescription().equalsIgnoreCase(description))
                    continue;

            if (!task.isDone())
                task.setDone(true);
        }
    }

    public void markTaskUnfinished(String description) {
        for (Task task : taskSet) {
            if (!task.getDescription().equalsIgnoreCase(description))
                continue;

            if (task.isDone())
                task.setDone(false);
        }
    }

    public void clearTaskList() {
        taskSet = new HashSet<>();
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        taskList.showTasks();

        taskList.addTask("Task 1");
        taskList.addTask("Task 1");
        taskList.addTask("Task 2");
        taskList.addTask("Task 3");
        taskList.addTask("Task 3");
        taskList.addTask("Task 4");
        printInfo(taskList);

        taskList.removeTask("Task 2");
        printInfo(taskList);

        taskList.markTaskDone("Task 3");
        taskList.markTaskDone("Task 1");
        System.out.printf("Tasks done: %s\n", taskList.getDoneTasks());
        System.out.println("Marking Task 1 and Task 4 as unfinished...");
        taskList.markTaskUnfinished("Task 1");
        System.out.printf("Tasks unfinished: %s\n", taskList.getUnfinishedTasks());
        System.out.println();

        System.out.println("Clearing all tasks");
        taskList.clearTaskList();
        printInfo(taskList);
    }

    private static void printInfo(TaskList taskList) {
        System.out.printf("Tasks: %s\n", taskList.countTasks());
        taskList.showTasks();
        System.out.println();
    }
}
