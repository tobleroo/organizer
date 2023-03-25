package com.tjdev.organizer.model;

public class Task {

    private String activity;
    private Boolean done = false;

    public Task(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "activity='" + activity + '\'' +
                ", done=" + done +
                '}';
    }
}
