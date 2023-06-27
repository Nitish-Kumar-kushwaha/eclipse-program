package com.dsPack;

public class Queue {
    private int front = -1;
    private int rear = -1;
    private int size;
    private int arr[];

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (rear == -1 && front == -1)
            return true;
        else
            return false;
    }

    public int size() {
        if (front == -1 && rear == -1) {
            return 0;
        }
        return rear;
    }

    public void queue(int x) {
        if (front == -1 && rear == -1) {
            front++;
            rear++;
        }
        // if (front == 0 && rear == 0) {
        // front++;
        // rear++;
        // }
        arr[rear] = x;
        rear++;
    }

    public int deQueue() {
        if (rear == 0) {
            front--;
            rear--;
        }
        int temp = arr[rear];

        return temp;
    }

    public int frontElement() {
        if (front == -1) {
            System.out.println("queue under-flow");
            System.exit(0);
        }
        return arr[front];
    }

    public int rearElement() {
        if (rear == -1) {
            System.out.println("queue is under-flow");
            System.exit(0);
        }

        return arr[rear-1];
    }

    public void show() {
        if (front == -1 && rear == -1) {
            System.out.println("queue is under-flow");
            System.exit(0);
        }
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
