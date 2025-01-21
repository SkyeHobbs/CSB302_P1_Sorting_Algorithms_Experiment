package sortingalgorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

  @Test
  void mergeSortNull() {
    MergeSort<Integer> mergeSort = new MergeSort<>();
    Integer[] testArray = null;
    assertNull(mergeSort.mergeSort(testArray));
  }

  @Test
  void mergeSortEmptyArray() {
    MergeSort<Integer> mergeSort = new MergeSort<>();
    Integer[] testArray = new Integer[]{};
    testArray = mergeSort.mergeSort(testArray);
    assertEquals(0, testArray.length);
  }

  @Test
  void mergeSortIntegers() {
    MergeSort<Integer> mergeSort = new MergeSort<>();
    Integer[] testArray = new Integer[] {0, 5, 3, 9, -50, 20, 14};
    Integer[] expectedArray = new Integer[] {-50, 0, 3, 5, 9, 14, 20};
    assertFalse(Arrays.equals(expectedArray, testArray));
    testArray = mergeSort.mergeSort(testArray);
    assertArrayEquals(expectedArray, testArray);
  }
  @Test
  void mergeSortStrings() {
    MergeSort<String> mergeSort = new MergeSort<>();
    String[] testArray = new String[] {"Bravo", "Golf", "Alpha", "Foxtrot", "Echo"};
    String[] expectedArray = new String[] {"Alpha", "Bravo", "Echo", "Foxtrot", "Golf"};
    assertFalse(Arrays.equals(expectedArray, testArray));
    testArray = mergeSort.mergeSort(testArray);
    assertArrayEquals(expectedArray, testArray);
  }

  @Test
  void mergeSortDoubles() {
    MergeSort<Double> mergeSort = new MergeSort<>();
    Double[] testArray = new Double[] {2.3, 1.50, 0.00, 13.0, 2000.0, -10.0, -100.0};
    Double[] expectedArray = new Double[] {-100.0, -10.0, 0.00, 1.50, 2.3, 13.0, 2000.0};
    assertFalse(Arrays.equals(expectedArray, testArray));
    testArray = mergeSort.mergeSort(testArray);
    assertArrayEquals(expectedArray, testArray);
  }
}