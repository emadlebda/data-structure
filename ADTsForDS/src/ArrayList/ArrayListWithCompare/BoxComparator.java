package ArrayList.ArrayListWithCompare;
import java.util.Comparator;

public class BoxComparator implements Comparator<Box> {

    @Override
    public int compare(Box b1, Box b2) {
        return b1.getSize() - b2.getSize();
    }

}

