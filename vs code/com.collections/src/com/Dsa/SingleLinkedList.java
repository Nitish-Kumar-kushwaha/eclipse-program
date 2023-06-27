package com.Dsa;

public class SingleLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    private Node head, tail;

    public void AddNewNode(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            tail = new_node;
        }
        new_node.next = head;
        head = new_node;
    }

    public void afterInsert(int data) {
        Node node = new Node(data);
         
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public void showNode() {
        Node node = head;
        if (node == null) {
            System.out.println("list is empty");
        }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public void deleteNode() {
        if (head == null) {
            System.out.println("list is empty");
        }
        head = head.next;
    }

}
