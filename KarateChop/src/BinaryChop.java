public class BinaryChop {
// in the first pass it determines whether the required value is in the top or the bottom
// half of the list of values. In the second pass in considers only this half, again dividing it
// in to two. It stops when it finds the value it is looking for, or when it runs out of array to search.
// Binary searches are a favorite of CS lecturers.

    public int chop(int value, int[] array) {
        int bottomIndex = 0;
        int topIndex = (array.length - 1);
        int midIndex = topIndex / 2;



        if(value > array[topIndex])
            return -1;

        if(value < array[bottomIndex])
            return -1;

        if(array.length == 1)
            return 0;


        while (bottomIndex < topIndex) {

            if (value == array[bottomIndex])
                return bottomIndex;

            if (value == array[topIndex])
                return topIndex;

            if (value == array[midIndex])
                return midIndex;


            if (value < array[midIndex]) {
                bottomIndex++;
                topIndex = midIndex;
                midIndex = ((topIndex / 2)+ bottomIndex);
            } else if(value > array[midIndex]) {
                bottomIndex = midIndex;
                midIndex = ((topIndex - bottomIndex)/ 2) + midIndex;
            }
            else
                return midIndex;
        }


        return -1;
    }
}
