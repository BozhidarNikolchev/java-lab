package com.company;

import loggers.ConsoleLogger;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate tomorrow = LocalDate.now().plusDays(1);

        BoardItem task = new Task("Write unit tests", "Pesho", tomorrow);
        BoardItem issue = new Issue("Review tests", "Someone must review Pesho's tests.", tomorrow);

        System.out.println(task.viewInfo());
        System.out.println(issue.viewInfo());

//        LocalDate tomorrow = LocalDate.now().plusDays(1);
//        BoardItem task = new Task("Write unit tests", "Pesho", tomorrow);
//
//        System.out.println(task.viewInfo());


//        LocalDate tomorrow = LocalDate.now().plusDays(1);
//        Issue issue = new Issue("App flow tests?", "We need to test the App!", tomorrow);
//        Task task = new Task("Test the application flow", "Pesho", tomorrow);
//
//        Board board = new Board();
//
//        board.addItem(issue);
//        board.addItem(task);
//        System.out.println(board.totalItems()); // 2

//        LocalDate tomorrow = LocalDate.now().plusDays(1);
//        Task task = new Task("Write unit tests", "Pesho", tomorrow);
//        Issue issue = new Issue("Review tests", "Someone must review Pesho's tests.", tomorrow);
//
//        Board board = new Board();
//
//        board.addItem(task);
//        board.addItem(issue);
//
//        ConsoleLogger logger = new ConsoleLogger();
//        board.displayHistory(logger);
    }

}
