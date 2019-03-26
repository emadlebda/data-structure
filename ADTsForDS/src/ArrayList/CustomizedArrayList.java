package ArrayList;

import CustomLinkedList.Node;

import java.time.DayOfWeek;
import java.util.Arrays;

public class CustomizedArrayList {
    // CustomizedArrayList it is only for integers, that means it is not for any other types, for that
    //we made a generic CustomizedArrayList for any type.


    private static final int DEFAULT_CAPACITY = 1;
    private int size = 0;
    private int elements[];

    public CustomizedArrayList() {
        elements = new int[DEFAULT_CAPACITY];

    }

    public static void main(String[] args) {
        CustomizedArrayList c = new CustomizedArrayList();
        c.add(5);
        c.add(6);
        c.add(7);

        System.out.println(c.get(2));
        System.out.println(c.getSize());

        c.remove(1);
        System.out.println(c.get(1));
        System.out.println(c.getSize());
    }

    public void add(int integer) {
        if (size == 0) { // = an array is empty.
            elements[0] = integer; // put it in first position in the array.
            size = 1; // and the size will increase by 1.
        } else { // the array has an elements in it.
            size = size + 1; // first of all increase the size by one to add the new element.
            elements = Arrays.copyOf(elements, size); // then copy the old array in a new one but with bigger size "by only one".
            elements[size - 1] = integer; // and put the element in the last position in the array.
        }
    }

    public int get(int index) { // getting element by index.
        return elements[index];
    }

    public void remove(int index) { // remove by index.
        int j = index + 1; // j = the next position of the position (entered index).
        for (int i = index; j < elements.length; i++) {
            elements[i] = elements[j]; // the element in position j, move it to the position i.
            j = j + 1; // Then shift rest of the elements like the prevuies step.
        }
        size = size - 1; // decrease the size bu one;
        elements = Arrays.copyOf(elements, size); // the copy the array but with a new size.
    }

    public boolean contains(int integer) { // contains by value.
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == integer) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public int sizeRecursively(Node first) {
        if (first == null)
            return 0;
        else if (first.next == null)
            return 1;
        return 1 + sizeRecursively(first.next);
    }
}
