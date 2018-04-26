package com.company;

public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(){
        root = null;
    }

    public MyLinkedList(Object firstItem){
        root = new Node(firstItem);
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

//    @Override
//    public boolean addItem(ListItem newItem) {
//        if (this.root == null) {
//            this.root = newItem;
//            return true;
//        }
//
//        ListItem currentItem = this.root;
//        while (currentItem != null){
//
//            int sort = currentItem.compareTo(newItem);
//            ListItem nextItem = currentItem.next();
//            ListItem previousItem = currentItem.previous();
//
//            if (sort > 0){ //the new item is greater than the current item, the new item should be before the current item
//
//                if (previousItem != null) {
//                    newItem.setPrevious(previousItem);
//                    previousItem.setNext(newItem);
//                }
//
//                newItem.setNext(currentItem);
//                currentItem.setPrevious(newItem);
//
//                this.root = newItem;
//                currentItem = null;
//
//            } else if (sort < 0) { //the current item is greater than the new item, the new item should be after the current item
//
//                if (nextItem != null) {
//                    newItem.setNext(nextItem);
//                    nextItem.setPrevious(newItem);
//                }
//                newItem.setPrevious(currentItem);
//                currentItem.setNext(newItem);
//
//                if (newItem.next() != null) {
//                    currentItem = newItem.next();
//                } else {
//                    currentItem = null;
//                }
//
//            } else { //the new item is identical to the current item, it should not be added
//                return false;
//            }
//
//
//        }
//
//        return true;
//    }

    //test

@Override
public boolean addItem(Object newObject) {
    ListItem newItem = new Node(newObject);

    if (this.root == null) {
        this.root = newItem;
        return true;
    }

    ListItem currentItem = this.root;
    while (currentItem != null){

        int sort = currentItem.compareTo(newItem);
        ListItem nextItem = currentItem.next();
        ListItem previousItem = currentItem.previous();

        if (sort > 0){ //the new item should be on the left of the current item

            if (previousItem != null) {
                newItem.setPrevious(previousItem);
                previousItem.setNext(newItem);
            } else {
                this.root = newItem;
            }

            newItem.setNext(currentItem);
            currentItem.setPrevious(newItem);

            currentItem = null;

        } else if (sort < 0) { //the new item should be on the right of the current item, the next item should be checked

            if (nextItem != null) {
                currentItem = nextItem;
            } else {
                newItem.setPrevious(currentItem);
                currentItem.setNext(newItem);
                currentItem = null;
            }

        } else { //the new item is identical to the current item, it should not be added
            return false;
        }


    }

    return true;
}

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {



    }

    public void print(){
        if (root == null) {
            System.out.println("List is empty.");
        } else {
            ListItem currentItem = this.root;

            while (currentItem != null) {
                System.out.println(currentItem.getValue());
                currentItem = currentItem.next();
            }
        }
    }
}
