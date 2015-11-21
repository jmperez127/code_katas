// More info and complete requirements here http://codekata.com/kata/kata02-karate-chop/

public class BinaryChop {
    public int iterativeChop(int value, int[] array) {
        int bottomIndex = 0;
        int topIndex = (array.length - 1);

        while (bottomIndex <= topIndex) {
            int midIndex = (bottomIndex + topIndex) / 2;
            if (value > array[midIndex])
                bottomIndex = midIndex + 1;
            else if (value < array[midIndex])
                topIndex = midIndex - 1;
            else
                return midIndex;
        }
        return -1;
    }

    public int recursiveChop(int value, int[] array) {
        int bottomIndex = 0;
        int topIndex = (array.length - 1);
        return doRecursiveChop(value, array, topIndex, bottomIndex);
    }

    private int doRecursiveChop(int value, int[] array, int topIndex, int bottomIndex) {
        int midIndex = (bottomIndex + topIndex) / 2;

        if (bottomIndex > topIndex)
            return -1;
        if (value > array[midIndex])
            return doRecursiveChop(value, array, topIndex, midIndex + 1);
        if (value < array[midIndex])
            return doRecursiveChop(value, array, midIndex - 1, bottomIndex);

        return midIndex;
    }
}
