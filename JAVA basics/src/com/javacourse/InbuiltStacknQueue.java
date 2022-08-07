package com.javacourse;

import java.util.*;
import java.util.LinkedList;

public class InbuiltStacknQueue {

    static public void main(String[] args){

//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//        stack.push(7);

//        System.out.println(stack.peek());
//        System.out.println(stack.empty());
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        System.out.println(stack.empty()); //checks whether stack is empty is not


//        Queue<Integer> qu = new LinkedList<>();  //Queue is an interface hence we use LL to implement the queue
//
//        qu.add(1);
//        qu.add(4);
//        qu.add(46);
//        qu.add(78);
//        qu.add(100);
//
//        System.out.println(qu.remove());
//        System.out.println(qu.remove());
//        System.out.println(qu.remove());
//        System.out.println(qu.remove());
//        System.out.println(qu.remove());
//
//        System.out.println(qu.isEmpty());


        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(12);
        dq.addFirst(13);
        dq.addLast(19);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());





    }
}
