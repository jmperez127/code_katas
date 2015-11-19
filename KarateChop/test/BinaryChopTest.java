import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryChopTest {

    BinaryChop binaryChop;

    @Before
    public void setUp() {
        binaryChop = new BinaryChop();
    }

    @Test
    public void returnMinusOneIfValueIsNotFoundInArray() {
        assertEquals(binaryChop.iterativeChop(50, new int[]{1, 2, 3, 30}), -1, -1);
    }

    @Test
    public void returnMinusOneWhenValueIsNotInArray() {
        assertEquals(-1, binaryChop.iterativeChop(3, new int[]{30}), -1);
        assertEquals(-1, binaryChop.iterativeChop(3, new int[]{1}), -1);
    }

    @Test
    public void returnZeroWhenValueIsFoundOnTheFirstArrayElement() {
        assertEquals(0, binaryChop.iterativeChop(1, new int[]{1}), 0);
        assertEquals(0, binaryChop.iterativeChop(1, new int[]{1, 3, 5}), 0);


    }

    @Test
    public void returnMidValuePositionWhenFound() {
        assertEquals(1, binaryChop.iterativeChop(3, new int[]{1, 3, 5}), 1);
    }

    @Test
    public void returnLastElementIfMatchesTheValue() {
        assertEquals(2, binaryChop.iterativeChop(5, new int[]{1, 3, 5}), 2);
        assertEquals(-1, binaryChop.iterativeChop(0, new int[]{1, 3, 5}), -1);
    }

    @Test
    public void itAppliesDevideAndConquerToFindResult() {
        int[] largeArray = new int[]{1, 3, 5, 7, 8, 10, 12, 15, 20, 25, 31, 42, 45, 46, 52};
        assertEquals(12, binaryChop.iterativeChop(45, largeArray));
        assertEquals(5, binaryChop.iterativeChop(10, largeArray));
        assertEquals(-1, binaryChop.iterativeChop(100, largeArray));
    }

    @Test
    public void returnMinusOneIfItemIsNotFoundInArray() {
        assertEquals(-1, binaryChop.iterativeChop(6, new int[]{1, 3, 5, 7}));
    }

    @Test
    public void finalTests() {
        assertEquals(0, binaryChop.iterativeChop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1, binaryChop.iterativeChop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2, binaryChop.iterativeChop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3, binaryChop.iterativeChop(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, binaryChop.iterativeChop(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, binaryChop.iterativeChop(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, binaryChop.iterativeChop(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, binaryChop.iterativeChop(8, new int[]{1, 3, 5, 7}));
    }

}
