package com.arkaza.thread.creation;

public class Task implements Runnable{
    private String thread_task;
    public Task(String task){
        this.thread_task=task;
    }
    public void run(){
        System.out.println(thread_task);
    }
}
