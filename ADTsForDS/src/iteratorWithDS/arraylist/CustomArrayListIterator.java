package iteratorWithDS.arraylist;

import iteratorWithDS.iterator.Iterator;

public class CustomArrayListIterator<E> implements Iterator {
    private CustomArrayList<E> customArrayList;
    private int movingIndex;

    /**
     *
     * @param customArrayList to tell the iterator which Arraylist he should work for.
     */
    public CustomArrayListIterator(CustomArrayList<E> customArrayList) {
        this.customArrayList = customArrayList;
    }

    /**
     * Tests whether the iterator can stand in the index before the first index in ArrayList
     *
     * @return true if he can stand, false otherwise.
     */
    @Override
    public boolean fromFirst() {
        if (customArrayList.size() > 0) {
            movingIndex = 0;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Tests whether the iterator can stand in the index after the last index in ArrayList
     *
     * @return true if he can stand, false otherwise.
     */
    @Override
    public boolean fromLast() {
        if (customArrayList.size() > 0) {
            movingIndex = customArrayList.size() - 1;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Tests whether the ArrayList has a next object from a specific index.
     *
     * @return true if there are further objects, false otherwise.
     */
    @Override
    public boolean hasNext() {
        if (movingIndex <= customArrayList.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Tests whether the ArrayList has a previous object from a specific index.
     *
     * @return true if there are previous objects, false otherwise.
     */
    @Override
    public boolean hasPrevious() {
        if (movingIndex >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the next object in the ArrayList.
     *
     * @return next object.
     */
    @Override
    public E next() {
        E element = customArrayList.get(movingIndex);
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
        E element = customArrayList.get(movingIndex);
        movingIndex = movingIndex - 1;
        return element;
    }
}