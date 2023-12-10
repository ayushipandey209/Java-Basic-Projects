package com.mycompany.projects1;

import java.util.ArrayList;
import java.util.Scanner;

class Task 
{
   private String description;
   private boolean isCompleted;
   
   public Task(String description)
   {
       this.description=description;
       this.isCompleted = false;
       
   }
   
   public String getDescription()
   {
       return description;
   }
   
   public boolean isCompleted()
   {
       return isCompleted;
   }
   
   public void completeTask()
   {
       isCompleted = true;
       
   }

    @Override
    public String toString() {
        return "Task{" + "description=" + description + '}';
    }
   
   
}

class ToDoList 
{
    private ArrayList<Task> tasks;
    
    public ToDoList()
    {
        this.tasks = new ArrayList<>();
        
    }
    
    public void addTask(String description)
    {
        tasks.add(new Task(description));
        
    }
    
    public void displayTasks()
    {
        if(tasks.isEmpty())
        {
            System.out.println("No tasks in to-do list");
            
        }
        else
        {
            System.out.println("To - do list");
            for(int i = 0;i<tasks.size(); i++)
            {
                System.out.println((i + 1) + ". " + tasks.get(i));
                
            }
        }
    }
    
    public void markTaskCompleted(int index)
    {
        if (index >=0 && index < tasks.size())
        {
            tasks.get(index).completeTask();
            System.out.println("Task marked as completed : "+ tasks.get(index).getDescription());
            tasks.remove(index);
        }
        else
        {
            System.out.println("Invalid task index.");
        }
    }
}

public class TodoListApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ToDoList tdl = new ToDoList();

        while (true) {
            System.out.println(" 1. Add Task");
            System.out.println(" 2. Display Task");
            System.out.println(" 3. Mark Task As Completed");
            System.out.println(" 4. Exit");

            int ch = sc.nextInt();
            sc.nextLine(); //consumes new line

            switch (ch) {
                case 1:
                    System.out.println("Enter task Description");
                    String description = sc.nextLine();
                    tdl.addTask(description);
                    System.out.println("Task Added: " + description);
                    break;

                case 2:
                    tdl.displayTasks();
                    break;

                case 3:
                    tdl.displayTasks();
                    System.out.println("Enter index of the task to mark as completed");
                    int index = sc.nextInt();
                    tdl.markTaskCompleted(index - 1);
                    break;

                case 4:
                    System.out.println("Exiting the to-do list app . GoodBye!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");

            }

        }

    }

}
