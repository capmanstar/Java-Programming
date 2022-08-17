package Generics;

// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

import java.util.Arrays;

public class CustomGenArrayList<T> {

    public Object[] data;
    private static final int DEFAULT_SIZE = 10;
    public int size=0;

    public CustomGenArrayList(){
        data = new Object[DEFAULT_SIZE];
    }


    private void insert(T num){
        if(isFull()){
            resize();
        }

        data[size++] = num;

    }

    private T get(int index){
        return (T)(data[index]);
    }

    private T remove(){
        T removed = (T)(data[size--]);
        return removed;
    }

    private void resize() {
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
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
        CustomGenArrayList<String> list = new CustomGenArrayList<>();
        list.insert("darshan");
        list.insert("om");
        list.insert("Prajakta");
        list.insert("Nilesh");

        System.out.println(list);
    }

}
