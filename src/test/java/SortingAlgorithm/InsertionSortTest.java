package SortingAlgorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

  @Test
  void insertionSort() {
    InsertionSort<Integer> insertionSort = new InsertionSort<>();

    Integer[] array1 = null;
    Integer[] result = insertionSort.insertionSort(array1);

    assertNull(result);

    Integer[] array2 = {1, 2, 3, 4, 5};
    result = insertionSort.insertionSort(array2);

    assertEquals(1, result[0]);
    assertEquals(2, result[1]);
    assertEquals(3, result[2]);
    assertEquals(4, result[3]);
    assertEquals(5, result[4]);

    Integer[] array3 = {5, 4, 3, 2, 1};
    result = insertionSort.insertionSort(array3);

    assertEquals(1, result[0]);
    assertEquals(2, result[1]);
    assertEquals(3, result[2]);
    assertEquals(4, result[3]);
    assertEquals(5, result[4]);

    Integer[] array4 = {4, 5, 1, 2, 3};
    result = insertionSort.insertionSort(array4);

    assertEquals(1, result[0]);
    assertEquals(2, result[1]);
    assertEquals(3, result[2]);
    assertEquals(4, result[3]);
    assertEquals(5, result[4]);
  }
}
