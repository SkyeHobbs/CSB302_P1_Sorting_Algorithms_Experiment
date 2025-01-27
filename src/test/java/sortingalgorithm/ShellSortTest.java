package sortingalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void shellSortNull() {
        ShellSort<Integer> shellSort = new ShellSort<>();
        Integer[] testArray = null;
        assertNull(shellSort.shellSort(testArray));
    }

    @Test
    void shellSortEmptyArray() {
        ShellSort<Integer> shellSort = new ShellSort<>();
        Integer[] testArray = new Integer[]{};
        testArray = shellSort.shellSort(testArray);
        assertEquals(0, testArray.length);
    }

    @Test
    void shellSortIntegerTest() {
        ShellSort<Integer> shellSort = new ShellSort<>();
        Integer[] testArray = new Integer[] {1, 100, 5, 2, -3, 10, 9, -231, 16};
        Integer[] sortedArray = new Integer[] {-231, -3, 1, 2, 5, 9, 10, 16, 100};
        testArray = shellSort.shellSort(testArray);
        assertArrayEquals(sortedArray, testArray);
    }

    @Test
    void shellSortStringTest() {
        ShellSort<String> shellSort = new ShellSort<>();
        String[] testArray = new String[] {"Bravo", "Tango", "Alpha", "Delta", "Charlie"};
        String[] sortedArray = new String[] {"Alpha", "Bravo", "Charlie", "Delta", "Tango"};
        testArray = shellSort.shellSort(testArray);
        assertArrayEquals(sortedArray, testArray);
    }
}