package com.company;
public class Main{
    public static void main(String[] args) {
        Tree obj = new Tree();
        obj.Insert(7);
        obj.Insert(4);
        obj.Insert(9);
        obj.Insert(1);
        obj.Insert(6);
        obj.Insert(8);
        obj.Insert(10);
        obj.TraverseInOrderAsc();
    }
}
