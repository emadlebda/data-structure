package iteratorWithDS.doublelinkedlist;

public class Main {
    public static void main(String[] args) {
        CustomDoubleLinkedList<String> dll = new CustomDoubleLinkedList();
        CustomDoubleLinkedListIterator<String> dllI = new CustomDoubleLinkedListIterator(dll);

        System.out.println(dllI.fromFirst());
        System.out.println("Means that the linkedList is empty, and the iterator can't stand on the index " +
                "before the first index in linkedList (0) .");
        System.out.println();


        dll.addAtHead("Element1");
        System.out.println(dllI.fromFirst());
        System.out.println("Means that the iterator successfully standed on the index before the " +
                "first index in linkedList, and it iterates on the first element of data.");
        System.out.println();


        dll.addAtTail("Element2");
        dll.addAtTail("Element3");
        dll.addAtTail("Element4");
        dll.addAtTail("Element5");

        if (dllI.fromFirst()) {
            while (dllI.hasNext())
                System.out.println(dllI.next());

        }
        System.out.println("The iterator successfully worked based on from first iterations");
        System.out.println();

        if (dllI.fromLast()) {
            while (dllI.hasPrevious())
                System.out.println(dllI.previous());
        }
        System.out.println("The iterator successfully worked based on from Last iterations and back on");
        System.out.println();
    }
}
