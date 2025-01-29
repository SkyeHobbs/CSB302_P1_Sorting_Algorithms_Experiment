package sortingalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private ArrayList<Integer> array1;
    private ArrayList<String> array2;

    @BeforeEach
    void setUp() {
        array1 = new ArrayList<>(Arrays.asList(64, 34, 25, 12, 22, 11, 90));
        array2 = new ArrayList<>(Arrays.asList("pear", "apple", "orange", "banana"));

    }

    @Test
    void testBubbleSort() {

        ArrayList<Integer> expected1 = new ArrayList<>(Arrays.asList(11, 12, 22, 25, 34, 64, 90));
        ArrayList<String> expected2 = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "pear"));

        BubbleSort.bubbleSort(array1);
        BubbleSort.bubbleSort(array2);

        assertEquals(expected1, array1);
        assertEquals(expected2, array2);
    }
}
