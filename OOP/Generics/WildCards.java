package Generics;

import java.util.Arrays;
import java.util.List;

//wild cards means restricting the data type to be given.
//here the number is the data type which includes int, float.

public class WildCards<T extends Number> {

    public Object[] data;
    private static final int DEFAULT_SIZE = 10;
    public int size=0;

    public WildCards(){
        data = new Object[DEFAULT_SIZE];
    }


    //if all int, float to be included.
//    public void wildCards(List<? extends Number>){
//
//    }


    //if only number type to be included.
//    public void wildCards(List<Number>){
//
//    }


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
}
