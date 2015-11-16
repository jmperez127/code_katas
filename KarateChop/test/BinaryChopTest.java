import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class BinaryChopTest {
    BinaryChop binaryChop;
    @Before
    public void setUp(){
        binaryChop = new BinaryChop();
    }

    @Test
    public void shouldHaveASortedArrayListOfIntValuesToSearch() {
        assertEquals(binaryChop.getItems(), new ArrayList<Integer>());
    }

    @Test
    public void shouldGetFirstItemOnTheFirstTry() {
        binaryChop.addValue(5);
        binaryChop.addValue(15);
        assertEquals(binaryChop.findPositionByValue(5), 0);
        assertEquals(binaryChop.getIterationCount(), 1);
    }

    @Test
    public void shouldGetMiddleItemOnTheFirstTry() {
        binaryChop.addValue(5);
        binaryChop.addValue(15);
        binaryChop.addValue(54);
        binaryChop.addValue(52);
        binaryChop.addValue(12);
        binaryChop.addValue(30);
        binaryChop.addValue(43);
        assertEquals(binaryChop.findPositionByValue(52), 3);
        assertEquals(binaryChop.getIterationCount(), 1);
    }

//    @Test
//    public void shouldSearchForSpecifiedValue() {
//        binaryChop.addValue(5);
//        binaryChop.addValue(15);
//        binaryChop.addValue(54);
//        binaryChop.addValue(52);
//        binaryChop.addValue(12);
//        binaryChop.addValue(30);
//        binaryChop.addValue(43);
//        assertEquals(binaryChop.findPositionByValue(15), 1);
//    }


}
