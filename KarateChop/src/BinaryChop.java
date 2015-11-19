public class BinaryChop {
// in the first pass it determines whether the required value is in the top or the bottom
// half of the list of values. In the second pass in considers only this half, again dividing it
// in to two. It stops when it finds the value it is looking for, or when it runs out of array to search.
// Binary searches are a favorite of CS lecturers.

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
