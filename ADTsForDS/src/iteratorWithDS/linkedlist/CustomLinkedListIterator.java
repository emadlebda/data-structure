package iteratorWithDS.linkedlist;

import iteratorWithDS.iterator.Iterator;

public class CustomLinkedListIterator<E> implements Iterator {
    private CustomLinkedList<E> x;
    private int movingIndex;

    /**
     * @param x to tell the iterator which linkedList he should work for.
     */
    public CustomLinkedListIterator(CustomLinkedList<E> x) {
        this.x = x;
    }

    /**
     * Tests whether the iterator can stand in the index before the first index in linkedList
     *
     * @return true if he can stand, false otherwise.
     */
    @Override
    public boolean fromFirst() {
        if (x.getSize() > 0) {
            movingIndex = 0;
            return true;
        } else
            return false;
    }

    /**
     * Tests whether the iterator can stand in the index after the last index in linkedList
     *
     * @return true if he can stand, false otherwise.
     */
    @Override
    public boolean fromLast() {
        if (x.getSize() > 0) {
            movingIndex = x.getSize() - 1;
            return true;
        } else
            return false;
    }

    /**
     * Tests whether the linkedList has a next object from a specific index.
     *
     * @return true if there are further objects, false otherwise.
     */
    @Override
    public boolean hasNext() {
        if (movingIndex <= x.getSize() - 1)
            return true;
        else
            return false;
    }

    /**
     * Tests whether the linkedList has a previous object from a specific index.
     *
     * @return true if there are previous objects, false otherwise.
     */
    @Override
    public boolean hasPrevious() {
        if (movingIndex >= 0)
            return true;
        else
            return false;
    }

    /**
     * Returns the next object in the linkedList.
     *
     * @return next object.
     */
    @Override
    public E next() {

        E element = x.get(movingIndex);
        movingIndex = movingIndex + 1;
        return element;
    }

    /**
     * Returns the previous object in the ArrayList.
     *
     * @return previous object.
     */
    @Override
    public E previous() {
        E element = x.get(movingIndex);
        movingIndex = movingIndex - 1;
        return element;
    }
}
