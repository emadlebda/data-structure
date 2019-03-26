package ArrayList;

import java.util.Arrays;

public class GenericArrayList<E> {

    private static final int DEFAULT_CAPACITY = 1;
    private int size = 0;
    private Object elements[];

    public GenericArrayList() {
        elements = new Object[DEFAULT_CAPACITY];

        int[] x = new int[5];
    }

    public static void main(String[] args) {
        GenericArrayList c = new GenericArrayList();
        c.add('b');
        c.add('c');
        c.add('d');

        System.out.println(c.get(2));
        System.out.println(c.getSize());

        c.remove(1);
        System.out.println(c.get(1));
        System.out.println(c.getSize());
    }

    public void add(E object) {
        if (size == 0) {
            elements[0] = object;
            size = 1;
        } else {
            size = size + 1;
            elements = Arrays.copyOf(elements, size);
            elements[size - 1] = object; // in the last index of the new(copied) array.
        }
    }

    public E get(int index) {
        return (E) elements[index]; // there is a casting process from "any type" to object.
    }

    public void remove(int index) {// remove by index.
        int j = index + 1;// j = the next position of the position (entered index).
        for (int i = index; j < elements.length; i++) {
            elements[i] = elements[j];// the element in position j, move it to the position i.
            j = j + 1;// Then shift rest of the elements like the prev step.
        }
        size = size - 1;// decrease the size bu one;
        elements = Arrays.copyOf(elements, size);// the copy the array but with a new size.
    }

    public int getSize() {
        return size;
    }
}
