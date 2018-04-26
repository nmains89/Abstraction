package com.company;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(Object item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);





}
