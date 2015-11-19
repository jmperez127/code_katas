// More info here http://codekata.com/kata/kata02-karate-chop/

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
}
