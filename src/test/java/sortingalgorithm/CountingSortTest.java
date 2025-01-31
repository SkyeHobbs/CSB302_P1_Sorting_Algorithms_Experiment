package sortingalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    void countingSortNull() {
        CountingSort countingSort = new CountingSort();
        Integer[] testArray = null;
        assertNull(countingSort.countingSort(testArray));
    }

    @Test
    void countingSortEmptyArray() {
        CountingSort countingSort = new CountingSort();
        Integer[] testArray = new Integer[]{};
        testArray = countingSort.countingSort(testArray);
        assertEquals(0, testArray.length);
    }

    @Test
    void countingSortTest() {
        CountingSort countingSort = new CountingSort();
        Integer[] testArray = new Integer[]{0, 1, 3, 2, 19, 109, 23, 4};
        Integer[] sortedArray = new Integer[]{0, 1, 2, 3, 4, 19, 23, 109};
        testArray = countingSort.countingSort(testArray);
        assertArrayEquals(sortedArray, testArray);
    }

    @Test
    void countingSortDuplicatesTest() {
        CountingSort countingSort = new CountingSort();
        Integer[] testArray = new Integer[]{0, 1, 15, 3, 15, 2, 15, 19, 109, 23, 4};
        Integer[] sortedArray = new Integer[]{0, 1, 2, 3, 4, 15, 15, 15, 19, 23, 109};
        testArray = countingSort.countingSort(testArray);
        assertArrayEquals(sortedArray, testArray);
    }

    @Test
    void countingSortNegativeTest() {
        CountingSort countingSort = new CountingSort();
        Integer[] testArray = new Integer[]{0, -1, 1, 3, 2, 19, 109, 23, 4};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> countingSort.countingSort(testArray));
    }
}