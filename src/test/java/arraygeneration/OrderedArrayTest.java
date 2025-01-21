package arraygeneration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OrderedArrayTest {

    @Test
    void testOrderedArray() {
        OrderedArray orderedArray = new OrderedArray();
        int[] testArray = orderedArray.generateArray(100);
        assertEquals(100, testArray.length);

        int[] sortedArray = Arrays.copyOf(testArray, testArray.length);
        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray, testArray);
    }

    @Test
    void testOrderedArrayZeroLength() {
        OrderedArray orderedArray = new OrderedArray();
        int[] array = orderedArray.generateArray(0);
        assertEquals(0, array.length);
    }
}