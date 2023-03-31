package com.tjdev.organizer.todoBis.models;

public class Task {

    private String activityName, description;
    private int timesCompleted, timeToPerform;

    public Task(String activityName) {
        this.activityName = activityName;
        this.description = "No description";
        this.timeToPerform = 0;
        this.timesCompleted = 0;
    }

    public Task(String activityName, String description){
        this.activityName = activityName;
        this.description = description;
        this.timesCompleted = 0;
        this.timeToPerform = 0;
    }

    public Task(String activityName, String description, int timeToPerform){
        this.activityName = activityName;
        this.description = description;
        this.timeToPerform = timeToPerform;
        this.timesCompleted = 0;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimesCompleted() {
        return timesCompleted;
    }

    public void setTimesCompleted(int timesCompleted) {
        this.timesCompleted = timesCompleted;
    }

    public int getTimeToPerform() {
        return timeToPerform;
    }

    public void setTimeToPerform(int timeToPerform) {
        this.timeToPerform = timeToPerform;
    }

    public void addTimesCompletedByOne(){
        this.timesCompleted++;
    }

    @Override
    public String toString() {
        return "Task{" +
                "activityName='" + activityName + '\'' +
                ", description='" + description + '\'' +
                ", timesCompleted=" + timesCompleted +
                ", timeToPerform=" + timeToPerform +
                '}';
    }
}
