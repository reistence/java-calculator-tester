package org.lessons;

import java.util.Arrays;

public class StringList {

    private String[] elements;
    private int size;


    public StringList(){
        elements = new String[0];
        size = 0;
    }

    public void add(String s){
        if (size == elements.length){
            String[] newEl = new String[elements.length + 1];
            System.arraycopy(elements, 0, newEl, 0, size);
            elements = newEl;
        }
        elements[size] = s;
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        elements = new String[0];
        size = 0;
    }

    public void remove(int i){
        if (i <0 || i >= size) throw new IndexOutOfBoundsException();
        String[] newArray = new String[size - 1];
        int index =0;
        for (int j = 0; j < size; j++) {
            if(j != i){
                newArray[index] = elements[j];
                index++;
            }
        }
        elements = newArray;
        size--;
    }

    public String get(int i){
        if (i <0 || i >= size) throw new IndexOutOfBoundsException();
        return elements[i];
    }


    @Override
    public String toString() {
        return "StringList" + "\n" +
                "elements:" + Arrays.toString(elements) + " | " +  "size:" + size;
    }
}
