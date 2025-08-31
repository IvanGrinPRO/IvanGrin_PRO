package org.example;

import DBConnector.DBConnection;
import DTO.TasksDTO;

import java.sql.Date;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TasksDTO tasksDTO = new TasksDTO();
        int opcion = 0;

        System.out.println("HELLO IN TASK MANAGER \n");
        do{


            System.out.println("Make a choice");
            System.out.println("1.Add new task");
            System.out.println("2.View all tasks");
            System.out.println("3.View all uncompleted tasks ");
            System.out.println("4.Make task completed");
            System.out.println("5.Delete the task");
            System.out.println("6.Exit");

            opcion = scanner.nextInt();

            switch (opcion){

                case 1:
                    scanner.nextLine();
                    System.out.println("Give a title for task");
                    String title = scanner.nextLine();

                    System.out.println("Description: ");
                    String desc = scanner.nextLine();

                    System.out.println("Time to complete the task ");
                    System.out.println("Day: ");
                    int day = scanner.nextInt();
                    System.out.println("Month: ");
                    int month = scanner.nextInt();

                    System.out.println("Year: ");
                    int year = scanner.nextInt();

                    String date = (year + "-" + month + "-" + day);
                    tasksDTO.makeTask(title,desc, date);

                    break;

                case 2:
                    System.out.println("Here is your tasks!");
                    tasksDTO.showingDates();
                    break;

                case 3:
                    System.out.println("Here is uncompleted tasks!");
                    tasksDTO.showingUncompletedTasks();
                    break;

                case 4:
                    System.out.println("Give id for compleating task");
                    int id = scanner.nextInt();
                    tasksDTO.verfComp(id);
                    break;

                case 5:
                    System.out.println("Give a id for delete the task");
                    int id1 = scanner.nextInt();
                    tasksDTO.deleteTask(id1);
                    break;
            }

        }while(opcion != 6);
        System.out.println("Bye Bye!");
        DBConnection.closeConnection();
    }

}