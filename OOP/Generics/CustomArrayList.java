package Generics;

import java.util.Arrays;

public class CustomArrayList {

    public int[] data;
    private final int DEFAULT_SIZE = 10;
    public int size;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }


    public void insert(int num){
        if(isFull()){
            resize();
        }

        data[size++] = num;

    }

    private int get(int num){
        for (int i = 0; i < data.length; i++) {
            if(data[i]==num){
                return i;
            }
        }
        return -1;
    }

    private int remove(){
        int removed = data[size--];
        return removed;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.insert(12);
        list.insert(5);
        list.insert(9);
        list.insert(33);
        list.insert(23);

        System.out.println(list);

    }


}
