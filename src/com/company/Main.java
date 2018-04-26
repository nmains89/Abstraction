package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyLinkedList myLinkedList = new MyLinkedList(null);
        myLinkedList.addItem("linda");
        myLinkedList.addItem("nick");
        myLinkedList.addItem("ashley");
        myLinkedList.addItem("george");
        myLinkedList.addItem("ben");
        myLinkedList.addItem(2);
        myLinkedList.addItem(1);
        myLinkedList.addItem(3);
        myLinkedList.print();


        System.out.println(myLinkedList.getRoot());
        System.out.println("Done.");

        //test



    }
}
