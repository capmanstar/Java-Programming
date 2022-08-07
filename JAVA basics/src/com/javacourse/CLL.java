package com.javacourse;

public class CLL {

    private Node head;
    private Node tail;

    public CLL(){
        this.head = null;
        this.tail = tail;
    }


    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
            tail = node;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }


    public void delete(int val){
        Node node = head;
        if(node==null){
            return;
        }

        if(node.val==val){
            head = head.next;
            tail.next = head;
        }

        do {
            Node n = node.next;

            if(n.val==val){
                node.next = n.next;
                break;
            }

            node = node.next;
        }while(node!=null);

    }


    public void display(){
        Node temp = head;
        if(head!=null){
            do {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }while(temp!=head);
        }
        System.out.println("HEAD");

    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }
    }
}
