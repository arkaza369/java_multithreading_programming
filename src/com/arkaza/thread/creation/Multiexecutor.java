package com.arkaza.thread.creation;

import java.util.List;

public class Multiexecutor {
	private List<Runnable> multi_tasks = null;
    public Multiexecutor(List<Runnable> tasks) {
        this.multi_tasks=tasks;
    }
    public void executeAll() {
        for(int i=0;i<multi_tasks.size();i++){
            Thread thread=new Thread(multi_tasks.get(i));
            thread.start();
        }
    }

}
