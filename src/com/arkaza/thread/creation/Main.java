package com.arkaza.thread.creation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
        List<Runnable>multi_tasks_list=new ArrayList<>();
            Runnable task_1 = new Task("Task1");
            Runnable task_2 = new Task("Task2");
            Runnable task_3 = new Task("Task3");
            Runnable task_4 = new Task("Task4");
            Runnable task_5 = new Task("Task5");
            multi_tasks_list.add(task_1);
            multi_tasks_list.add(task_2);
            multi_tasks_list.add(task_3);
            multi_tasks_list.add(task_4);
            multi_tasks_list.add(task_5);
            Multiexecutor multi_executor = new Multiexecutor(multi_tasks_list);
            multi_executor.executeAll();
    }

	
}
