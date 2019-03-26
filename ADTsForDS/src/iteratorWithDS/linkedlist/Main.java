package iteratorWithDS.linkedlist;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<String> ll = new CustomLinkedList();
        CustomLinkedListIterator<String> llI = new CustomLinkedListIterator(ll);

        System.out.println(llI.fromFirst());
        System.out.println("Means that the linkedList is empty, and the iterator can't stand on the index " +
                "before the first index in linkedList (0) .");
        System.out.println();

        ll.addAtHead("Element1");
        System.out.println(llI.fromFirst());
        System.out.println("Means that the iterator successfully standed on the index before the " +
                "first index in linkedList, and it iterates on the first element of data.");
        System.out.println();

        ll.addAtTail("Element2");
        ll.addAtTail("Element3");
        ll.addAtTail("Element4");
        ll.addAtTail("Element5");

        if (llI.fromFirst()) {
            while (llI.hasNext()) {
                System.out.println(llI.next());
            }
        }

        System.out.println("The iterator successfully worked based on from first iterations");
        System.out.println();

        if (llI.fromLast()) {
            while (llI.hasPrevious()) {
                System.out.println(llI.previous());
            }
        }
        System.out.println("The iterator successfully worked based on from Last iterations and back on");
        System.out.println();
    }
}
