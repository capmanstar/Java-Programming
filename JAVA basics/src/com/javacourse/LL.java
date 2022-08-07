package com.javacourse;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertLastWithoutTail(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.next==null){
                Node node = new Node(val);
                temp.next = node;
                temp = node;
                size++;
            }
            else{
                temp = temp.next;
            }
        }

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        int val = tail.value;
        Node temp = head;
        while(temp!=null){
            if(temp.next==tail){
                break;
            }
            temp = temp.next;
        }

        temp.next = null;
        size--;

        return val;
    }

    public int deleteIndex(int index){

        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index);
        index = prev.next.value;
        prev.next = prev.next.next;


        return index;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            else{
                node = node.next;
            }

            return null;
        }

        return node;
    }

    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }

        size = size+1;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
