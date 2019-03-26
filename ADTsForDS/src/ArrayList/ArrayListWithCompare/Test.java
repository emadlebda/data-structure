package ArrayList.ArrayListWithCompare;
import java.util.ArrayList;
import java.util.Collections;
public class Test {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setSize(22);
        box1.setWeight(55.5);

        Box box2 = new Box();
        box2.setSize(20);
        box2.setWeight(55.5);

        BoxComparator boxComparator = new BoxComparator();
        System.out.println(boxComparator.compare(box1, box2));

        ArrayList<Box> list = new ArrayList();
        list.add(box1);
        list.add(box2);

        Collections.sort(list, boxComparator);
    }
}