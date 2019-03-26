package ArrayList.ArrayListWithCompare;

public class Box implements Comparable<Box> {
    private double weight;
    private int size;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Box b) {
        return this.size - b.getSize();
    }
}
