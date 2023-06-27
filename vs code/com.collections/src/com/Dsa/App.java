package com.Dsa;

public class App {
    public static void main(String[] args) {
        SingleLinkedList sl1 = new SingleLinkedList();

        sl1.AddNewNode(10);
        sl1.AddNewNode(29);
        sl1.afterInsert(100);
        sl1.afterInsert(200);
        sl1.showNode();
        sl1.deleteNode();
        sl1.showNode();
        sl1.deleteNode();
        sl1.showNode();
    }
}
