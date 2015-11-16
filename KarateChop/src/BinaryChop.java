import java.util.ArrayList;
import java.util.List;

public class BinaryChop {
    protected List<Integer> items;
    private int iterationCount;

    public BinaryChop() {
        iterationCount = 0;
        items = new ArrayList<Integer>();
    }

    public List<Integer> getItems() {
        return items;
    }

    public void addValue(int value) {
        items.add(value);
    }

    public int findPositionByValue(int value) {
        if (items.get(0) == value) {
            iterationCount++;
            return 0;
        }

        int middle = (items.size() - 1) / 2;

        if (items.get(middle) == value) {
            iterationCount++;
            return middle;
        }

        return -1;
    }

    public int getIterationCount() {
        return iterationCount;
    }
}
