package com.javacourse;

public class DLL {

    private Node head;
    private int size;

    public DLL(){
        this.size = 0;
    }

    class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        node.prev = null;
        size++;
    }


    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            node.prev = null;
        }
        Node last = head;
        while(last!=null){
            if(last.next==null){
                break;
            }
            last = last.next;
        }

        last.next = node;
        node.prev= last;
        node.next = null;
    }

    public void insert(int val, int index){
        if(head==null){
            insertFirst(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next,temp);
        temp.next = node;
        node.next.prev = node;
        size++;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

//        System.out.println("Print in reverse");
//        while(last!=null){
//            System.out.print(last.val + "->");
//            last = last.prev;
//        }
//        System.out.println("START");
    }
}
