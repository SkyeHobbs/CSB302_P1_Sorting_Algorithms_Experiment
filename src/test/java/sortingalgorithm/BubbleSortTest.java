package sortingalgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static sortingalgorithm.BubbleSort.*;

class BubbleSortTest {

  @Test
  public void testBubbleSort_withIntegerArray() {
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    Integer[] array = {5, 3, 8, 4, 2};
    Integer[] sortedArray = {2, 3, 4, 5, 8};
    assertArrayEquals(sortedArray, bubbleSort.bubbleSort(array));
  }

  @Test
  public void testBubbleSort_withStringArray() {
    BubbleSort<String> bubbleSort = new BubbleSort<>();
    String[] array = {"banana", "apple", "cherry", "date"};
    String[] sortedArray = {"apple", "banana", "cherry", "date"};
    assertArrayEquals(sortedArray, bubbleSort.bubbleSort(array));
  }

  @Test
  public void testBubbleSort_withEmptyArray() {
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    Integer[] array = {};
    Integer[] sortedArray = {};
    assertArrayEquals(sortedArray, bubbleSort.bubbleSort(array));
  }

  @Test
  public void testBubbleSort_withSingleElementArray() {
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    Integer[] array = {1};
    Integer[] sortedArray = {1};
    assertArrayEquals(sortedArray, bubbleSort.bubbleSort(array));
  }

  @Test
  public void testBubbleSort_withAlreadySortedArray() {
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    Integer[] array = {1, 2, 3, 4, 5};
    Integer[] sortedArray = {1, 2, 3, 4, 5};
    assertArrayEquals(sortedArray, bubbleSort.bubbleSort(array));
  }
}

