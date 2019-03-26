package doubleLinkedList;

public class dLL<E> {
    private int size = 0;
    private Node<E> head;
    private Node<E> tail;

    public void addAtHead(E data) {
        if (size == 0) {
            head = new Node(data);
            tail = head;

        } else {
            Node<E> newNode = new Node<>(data);
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size = size + 1;
    }

    public void addAtTail(E data) {
        if (size == 0) { // if its empty.
            head = new Node(data);
            tail = head;
        } else {
            Node<E> newNode = new Node<>(data);
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size = size + 1;

    }

    public void addAtIndex(int index, E data) {
        if (index == 0) {
            addAtHead(data);
        } else if (index == size - 1) {
            addAtTail(data);
        } else {
            Node previuos = null;
            Node current = null;
            Node ref = head;

            for (int i = 0; i < size; i++) {
                if (i == index - 1) {
                    previuos = ref;
                }
                if (i == index) {
                    current = ref;

                    Node<E> newNode = new Node(data);
                    newNode.previous = previuos;
                }

            }

        }

    }

    public void deleteHead() {
        Node<E> temp = head.next;
        head.next = null;
        temp.previous = null;
        head = temp;
        size = size - 1;

        if (size == 1) {
            tail = head;
        }
    }

    public void deleteTail() {

        Node<E> temp = tail.previous;
        tail.previous = null;
        temp.next = null;
        tail = temp;

        size = size - 1;

        if (size == 1) {
            head = tail;
        }
    }

    public void deleteByIndex(int index, E data) {
        if (index == 0) {
            deleteHead();
        } else if (index == size - 1) {
            deleteTail();
        } else {
            Node previuos = null;
            Node next = null;
            Node current;
            Node ref = head;

            for (int i = 0; i < size; i++) {
                if (i == index) {
                    ref.next = next;
                    ref.previous = previuos;
                    next = previuos.previous.previous;
                    previuos = ref.next.next;
                }
                ref = ref.next; // to move the reference of the moved node in for loop.


            }

        }
        size = size - 1;
    }
}
