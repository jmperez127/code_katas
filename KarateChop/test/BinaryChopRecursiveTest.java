import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryChopRecursiveTest {

    BinaryChop binaryChop;

    @Before
    public void setUp() {
        binaryChop = new BinaryChop();
    }

    @Test
    public void returnMinusOneIfValueIsNotFoundInArray() {
        assertEquals(binaryChop.recursiveChop(50, new int[]{1, 2, 3, 30}), -1, -1);
    }

    @Test
    public void returnMinusOneWhenValueIsNotInArray() {
        assertEquals(-1, binaryChop.recursiveChop(3, new int[]{30}), -1);
        assertEquals(-1, binaryChop.recursiveChop(3, new int[]{1}), -1);
    }

    @Test
    public void returnZeroWhenValueIsFoundOnTheFirstArrayElement() {
        assertEquals(0, binaryChop.recursiveChop(1, new int[]{1}), 0);
        assertEquals(0, binaryChop.recursiveChop(1, new int[]{1, 3, 5}), 0);
    }

    @Test
    public void returnMidValuePositionWhenFound() {
        assertEquals(1, binaryChop.recursiveChop(3, new int[]{1, 3, 5}), 1);
    }

    @Test
    public void returnLastElementIfMatchesTheValue() {
        assertEquals(2, binaryChop.recursiveChop(5, new int[]{1, 3, 5}), 2);
        assertEquals(-1, binaryChop.recursiveChop(0, new int[]{1, 3, 5}), -1);
    }

    @Test
    public void itAppliesDevideAndConquerToFindResult() {
        int[] largeArray = new int[]{1, 3, 5, 7, 8, 10, 12, 15, 20, 25, 31, 42, 45, 46, 52};
        assertEquals(12, binaryChop.recursiveChop(45, largeArray));
        assertEquals(5, binaryChop.recursiveChop(10, largeArray));
        assertEquals(-1, binaryChop.recursiveChop(100, largeArray));
    }

    @Test
    public void returnMinusOneIfItemIsNotFoundInArray() {
        assertEquals(-1, binaryChop.recursiveChop(6, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void finalTests() {
        assertEquals(0, binaryChop.recursiveChop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1, binaryChop.recursiveChop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2, binaryChop.recursiveChop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3, binaryChop.recursiveChop(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, binaryChop.recursiveChop(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, binaryChop.recursiveChop(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, binaryChop.recursiveChop(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, binaryChop.recursiveChop(8, new int[]{1, 3, 5, 7}));
    }

}
