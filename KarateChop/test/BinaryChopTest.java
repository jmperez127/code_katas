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
        assertEquals(binaryChop.chop(50, new int[]{1, 2, 3, 30}), -1, -1);
    }

    @Test
    public void returnMinusOneWhenValueIsNotInArray() {
        assertEquals(-1, binaryChop.chop(3, new int[]{30}), -1);
        assertEquals(-1, binaryChop.chop(3, new int[]{1}), -1);
    }

    @Test
    public void returnZeroWhenValueIsFoundOnTheFirstArrayElement() {
        assertEquals(0, binaryChop.chop(1, new int[]{1}), 0);
        assertEquals(0, binaryChop.chop(1, new int[]{1, 3, 5}), 0);


    }

    @Test
    public void returnMidValuePositionWhenFound() {
        assertEquals(1, binaryChop.chop(3, new int[]{1, 3, 5}), 1);


    }

    @Test
    public void returnLastElementIfMatchesTheValue() {
        assertEquals(2, binaryChop.chop(5, new int[]{1, 3, 5}), 2);
        assertEquals(-1, binaryChop.chop(0, new int[]{1, 3, 5}), -1);
    }

    @Test
    public void itAppliesDevideAndConquerToFindResult() {
        int[] largeArray = new int[]{1, 3, 5, 7, 8, 10, 12, 15, 20, 25, 31, 42, 45, 46, 52};
        assertEquals(12, binaryChop.chop(45, largeArray));
        assertEquals(5, binaryChop.chop(10, largeArray));
        assertEquals(-1, binaryChop.chop(100, largeArray));
    }

    @Test
    public void FinalTests() {

        assertEquals(0,  binaryChop.chop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1,  binaryChop.chop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2,  binaryChop.chop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3,  binaryChop.chop(7, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, binaryChop.chop(0, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, binaryChop.chop(2, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, binaryChop.chop(4, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, binaryChop.chop(6, new int[]{1, 3, 5, 7}));
//        assertEquals(-1, binaryChop.chop(8, new int[]{1, 3, 5, 7}));
    }


//        assert_equal(0,  chop(1, [1, 3, 5, 7]))
//        assert_equal(1,  chop(3, [1, 3, 5, 7]))
//        assert_equal(2,  chop(5, [1, 3, 5, 7]))
//        assert_equal(3,  chop(7, [1, 3, 5, 7]))
//        assert_equal(-1, chop(0, [1, 3, 5, 7]))
//        assert_equal(-1, chop(2, [1, 3, 5, 7]))
//        assert_equal(-1, chop(4, [1, 3, 5, 7]))
//        assert_equal(-1, chop(6, [1, 3, 5, 7]))
//        assert_equal(-1, chop(8, [1, 3, 5, 7]))

//        assertEquals(binaryChop.chop(10, list), -1, -1);


}
