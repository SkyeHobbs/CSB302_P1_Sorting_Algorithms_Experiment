package sortingalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionSortTest {

  @Test
  public void testSelectionSort_withIntegerArray() {
    Integer[] array = {5, 3, 8, 4, 2};
    Integer[] sortedArray = {2, 3, 4, 5, 8};
    assertArrayEquals(sortedArray, SelectionSort.selectionSort(array));
  }

  @Test
  public void testSelectionSort_withStringArray() {
    String[] array = {"banana", "apple", "cherry", "date"};
    String[] sortedArray = {"apple", "banana", "cherry", "date"};
    assertArrayEquals(sortedArray, SelectionSort.selectionSort(array));
  }

  @Test
  public void testSelectionSort_withEmptyArray() {
    Integer[] array = {};
    Integer[] sortedArray = {};
    assertArrayEquals(sortedArray, SelectionSort.selectionSort(array));
  }

  @Test
  public void testSelectionSort_withSingleElementArray() {
    Integer[] array = {1};
    Integer[] sortedArray = {1};
    assertArrayEquals(sortedArray, SelectionSort.selectionSort(array));
  }

  @Test
  public void testSelectionSort_withAlreadySortedArray() {
    Integer[] array = {1, 2, 3, 4, 5};
    Integer[] sortedArray = {1, 2, 3, 4, 5};
    assertArrayEquals(sortedArray, SelectionSort.selectionSort(array));
  }
}