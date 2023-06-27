package com.dsPack;

import java.util.Arrays;

public class Stack {
    private int arr[];
    private int top = -1;
    private int size;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int x) {
        if (size() >= size) {
            System.out.println("stack over flow");
            System.exit(0);
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        if (size()== 0) {
            System.err.println("stack underflow");
            System.exit(0);
        }

        int temp = arr[top];
        top--;
        return temp;

    }

    public int peek() {
        if (size() == 0) {
            System.err.println("stack underflow");
            System.exit(0);
        }
        return arr[top];
    }

    public boolean isFull() {
        if (top == size)
            return true;
        else
            return false;
    }

    public boolean isEmpty() {
        if (this.isFull())
            return true;
        else
            return false;
    }

    public int size() {
        return top + 1;
    }

    public void show() {
        if (size() == 0) {
            System.err.println("stack underflow");
            System.exit(0);
        }
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(+arr[i] + " , ");
        }
        System.out.print("]");
    }

}
