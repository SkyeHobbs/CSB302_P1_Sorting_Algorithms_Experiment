package sortingalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HeapSortTest {

  @Test
  public void testHeapSortWithIntegers() {
    HeapSort<Integer> heapSort = new HeapSort<>();
    Integer[] array = {4, 10, 3, 5, 1};
    Integer[] expected = {1, 3, 4, 5, 10};

    Integer[] sortedArray = heapSort.heapSort(array);

    assertArrayEquals(expected, sortedArray, "The sorted array should match the expected result " +
      "{1, 3, 4, 5, 10}.");
  }

  @Test
  public void testHeapSortWithStrings() {
    HeapSort<String> heapSort = new HeapSort<>();
    String[] array = {"banana", "apple", "cherry", "date"};
    String[] expected = {"apple", "banana", "cherry", "date"};

    String[] sortedArray = heapSort.heapSort(array);

    assertArrayEquals(expected, sortedArray, "The sorted array should match the expected result {1, 3, 4, 5, 10}.");
  }

  @Test
  public void testHeapSortWithEmptyArray() {
    HeapSort<Integer> heapSort = new HeapSort<>();
    Integer[] array = {};
    Integer[] expected = {};

    Integer[] sortedArray = heapSort.heapSort(array);

    assertArrayEquals(expected, sortedArray, "Sorting an empty array should return an empty array.");
  }
}