package com.example.helloworld;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
//        if the Array is full resize it
        if (items.length == count) {
//            Create a new Array (twice the size)
            int[] newItems = new int[count * 2];

//            Copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
//            Set items to the new Array
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++ )
            System.out.println(items[i]);
    }
}
