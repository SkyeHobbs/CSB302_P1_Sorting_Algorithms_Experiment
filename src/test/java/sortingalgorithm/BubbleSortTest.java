package sortingalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

  @Test
  public void testBubbleSort_withIntegerArray() {
    Integer[] array = {5, 3, 8, 4, 2};
    Integer[] sortedArray = {2, 3, 4, 5, 8};
    assertArrayEquals(sortedArray, BubbleSort.bubbleSort(array));
  }

  @Test
  public void testBubbleSort_withStringArray() {
    String[] array = {"banana", "apple", "cherry", "date"};
    String[] sortedArray = {"apple", "banana", "cherry", "date"};
    assertArrayEquals(sortedArray, BubbleSort.bubbleSort(array));
  }

  @Test
  public void testBubbleSort_withEmptyArray() {
    Integer[] array = {};
    Integer[] sortedArray = {};
    assertArrayEquals(sortedArray, BubbleSort.bubbleSort(array));
  }

  @Test
  public void testBubbleSort_withSingleElementArray() {
    Integer[] array = {1};
    Integer[] sortedArray = {1};
    assertArrayEquals(sortedArray, BubbleSort.bubbleSort(array));
  }

  @Test
  public void testBubbleSort_withAlreadySortedArray() {
    Integer[] array = {1, 2, 3, 4, 5};
    Integer[] sortedArray = {1, 2, 3, 4, 5};
    assertArrayEquals(sortedArray, BubbleSort.bubbleSort(array));
  }
}

