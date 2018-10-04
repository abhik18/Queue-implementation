package com.company;

import java.util.Scanner;

public class Main {

    final static String MENU = "\nSelect an option\n\n1. Enqueue (Push)\n2. Dequeue (Pop)\n3. Peek at front\n4. Peek at back\n" +
            "5. Display Queue\n6. Delete Queue\n7. Exit";

    public static void main(String[] args) {
        // write your code here
        Queue queue = new Queue();
        Scanner in = new Scanner(System.in);

        int choice = 0, data;

        System.out.println("Welcome to the queue tool!");
        while (choice != 7) {
            System.out.println(MENU);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("What data do you want to push to the queue: ");
                    data = in.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.displayFront();
                    break;
                case 4:
                    queue.displayBack();
                    break;
                case 5:
                    queue.displayQueue();
                    break;
                case 6:
                    queue.deleteQueue();
                    break;
                case 7:
                    System.out.println("Thanks for using the queue tool!");
                    break;
            }
        }
    }
}
