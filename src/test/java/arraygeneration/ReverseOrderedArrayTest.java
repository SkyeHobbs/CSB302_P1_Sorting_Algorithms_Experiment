package arraygeneration;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOrderedArrayTest {
    @Test
    void testReverseOrderedArray() {
        ReverseOrderedArray reverseOrderedArray = new ReverseOrderedArray();
        int[] testArray = reverseOrderedArray.generateArray(100);
        assertEquals(100, testArray.length);

        int[] sortedArray = Arrays.copyOf(testArray, testArray.length);
        Arrays.sort(sortedArray);
        int[] reverseArray = new int[sortedArray.length];
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArray[i] = sortedArray[sortedArray.length - 1 - i];
        }
        assertArrayEquals(reverseArray, testArray);
    }

    @Test
    void testReverseOrderedArrayZeroLength() {
        ReverseOrderedArray reverseOrderedArray = new ReverseOrderedArray();
        int[] array = reverseOrderedArray.generateArray(0);
        assertEquals(0, array.length);
    }
}