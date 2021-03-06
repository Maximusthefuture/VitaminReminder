package com.example.maximus.vitaminreminder.data.source.local;

import com.example.maximus.vitaminreminder.data.Task;

import java.util.List;

public interface IDatabaseHandler {

    void addTask(Task task);

    List<Task> getAllTasks();

    Task getTaskById(String taskId);

    void deleteTaskById(String taskId);

    void deleteTasks();

    int deleteCompletedTasks();

    void updateTask(Task task);

    void updateCompleted(String taskId, boolean completed);



}
