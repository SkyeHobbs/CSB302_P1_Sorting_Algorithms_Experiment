package sortingalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class SelectionSortTest {

  @Test
  public void testSelectionSort_withIntegerArray() {
    SelectionSort<Integer> selectionSort = new SelectionSort<>();
    Integer[] array = {5, 3, 8, 4, 2};
    Integer[] sortedArray = {2, 3, 4, 5, 8};
    assertArrayEquals(sortedArray, selectionSort.selectionSort(array));
  }

  @Test
  public void testSelectionSort_withStringArray() {
    SelectionSort<String> selectionSort = new SelectionSort<>();
    String[] array = {"banana", "apple", "cherry", "date"};
    String[] sortedArray = {"apple", "banana", "cherry", "date"};
    assertArrayEquals(sortedArray, selectionSort.selectionSort(array));
  }

  @Test
  public void testSelectionSort_withEmptyArray() {
    SelectionSort<Integer> selectionSort = new SelectionSort<>();
    Integer[] array = {};
    Integer[] sortedArray = {};
    assertArrayEquals(sortedArray, selectionSort.selectionSort(array));
  }

  @Test
  public void testSelectionSort_withSingleElementArray() {
    SelectionSort<Integer> selectionSort = new SelectionSort<>();
    Integer[] array = {1};
    Integer[] sortedArray = {1};
    assertArrayEquals(sortedArray, selectionSort.selectionSort(array));
  }

  @Test
  public void testSelectionSort_withAlreadySortedArray() {
    SelectionSort<Integer> selectionSort = new SelectionSort<>();
    Integer[] array = {1, 2, 3, 4, 5};
    Integer[] sortedArray = {1, 2, 3, 4, 5};
    assertArrayEquals(sortedArray, selectionSort.selectionSort(array));
  }
}