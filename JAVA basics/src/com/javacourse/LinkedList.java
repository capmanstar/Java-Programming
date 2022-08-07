package com.javacourse;

public class LinkedList {

    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(7);

//        list.insertLastWithoutTail(10);

//        list.insert(10,3);
//
//        list.display();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        System.out.println(list.deleteIndex(3));
//        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertFirst(7);

//        list.display();
//
//        list.insertLast(10);
//
//        list.display();

//        list.insert(8,2);
//
//        list.display();


        CLL list = new CLL();

        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        list.display();
        list.delete(5);
        list.display();

    }
}
