package com.company;

public class Queue {
    private Node front;
    private Node back;
    private int queueSize;

    public Queue() {
        front = null;
        back = null;
        queueSize = 0;
    }

    public int getSize() {
        return queueSize;
    }
    public void setSize(int size) {
        queueSize = size;
    }

    public void enqueue(int data) {
        if(front == null) {
            front = new Node(data);
            back = front;
        }
        else {
            Node temp = new Node(data);
            back.setNext(temp);
            back = temp;
        }
        queueSize++;
    }

    public void dequeue() {
        if(isEmpty()) {
            return;
        }
        front = front.getNext();
        queueSize--;
    }

    public int getQueueSize() {
        return queueSize;
    }

    public void displayFront() {
        if(isEmpty()) {
            return;
        }
        System.out.println("Front element: " + front.getData());
    }

    public void displayBack() {
        if(isEmpty()) {
            return;
        }
        System.out.println("Back element: " + back.getData());
    }

    public boolean isEmpty() {
        if(front == null || queueSize == 0) {
            System.out.println("The stack is empty!");
            return true;
        }
        return false;
    }

    public void deleteQueue() {
        if(isEmpty()) {
            return;
        }
        front = null;
        setSize(0);
    }

    public void displayQueue() {
        System.out.println();
        if(isEmpty()) {
            return;
        }
        for(Node i = front; i != null; i = i.getNext()) {
            System.out.print(i.getData() + " -> ");
        }
    }
}
