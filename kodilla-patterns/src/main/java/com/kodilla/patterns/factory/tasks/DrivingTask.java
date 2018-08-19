package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private String taskName;
    private String where;
    private String using;
    private TaskState taskState;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.taskState = new TaskState(TaskState.State.DISABLED);
    }

    @Override
    public void executeTask() {
        taskState.setState(TaskState.State.ENABLED);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(taskState.getState() == TaskState.State.COMPLETED) {
            return true;
        }
        return false;
    }

    public TaskState getTaskState() {
        return taskState;
    }

    @Override
    public String toString() {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                '}';
    }
}
