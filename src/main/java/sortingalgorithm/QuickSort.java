package sortingalgorithm;

import java.util.Random;
import java.util.Stack;

/**
 * QuickSort class implementing different pivot selection strategies.
 *
 * @param <T> The type of elements to be sorted, extending Comparable.
 */
public class QuickSort<T extends Comparable<T>> {
  /**
   * Sorts the array using QuickSort with the first element as the pivot.
   *
   * @param array The array to be sorted.
   * @return The sorted array.
   */
  public T[] quickSortFirstPivot(T[] array) {
    quickSort(array, array.length - 1, PivotType.FIRST);
    return array;
  }

  /**
   * Sorts the array using QuickSort with a random element as the pivot.
   *
   * @param array The array to be sorted.
   * @return The sorted array.
   */
  public T[] quickSortRandomPivot(T[] array) {
    quickSort(array, array.length - 1, PivotType.RANDOM);
    return array;
  }

  /**
   * Sorts the array using QuickSort with the median of three elements as the pivot.
   *
   * @param array The array to be sorted.
   * @return The sorted array.
   */
  public T[] quickSortMedianOfThree(T[] array) {
    quickSort(array, array.length - 1, PivotType.MEDIAN_OF_THREE);
    return array;
  }

  /**
   * The main QuickSort logic that works with the specified pivot type.
   */
  private void quickSort(T[] array, int high, PivotType pivotType) {
    Stack<int[]> stack = new Stack<>();
    stack.push(new int[]{0, high}); // Push the initial range

    while (!stack.isEmpty()) {
      int[] range = stack.pop();
      int start = range[0];
      int end = range[1];

      if (start < end) {
        int pivotIndex = partition(array, start, end, pivotType);

        // Push right sub array first so that left sub array is processed first
        if (pivotIndex + 1 < end) {
          stack.push(new int[]{pivotIndex + 1, end});
        }
        if (start < pivotIndex - 1) {
          stack.push(new int[]{start, pivotIndex - 1});
        }
      }
    }
  }

  /**
   * Partitions the array and selects the pivot based on the strategy.
   */
  private int partition(T[] array, int low, int high, PivotType pivotType) {
    int pivotIndex = selectPivot(array, low, high, pivotType);
    T pivot = array[pivotIndex];
    swap(array, pivotIndex, high); // Move pivot to the end.
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (array[j].compareTo(pivot) <= 0) {
        i++;
        swap(array, i, j);
      }
    }
    swap(array, i + 1, high); // Move pivot to its correct position.
    return i + 1;
  }

  /**
   * Selects the pivot index based on the strategy.
   */
  private int selectPivot(T[] array, int low, int high, PivotType pivotType) {
    return switch (pivotType) {
      case FIRST -> low;
      case RANDOM -> {
        Random random = new Random();
        yield random.nextInt(high - low + 1) + low;
      }
      case MEDIAN_OF_THREE -> {
        int mid = low + (high - low) / 2;
        yield medianOfThree(array, low, mid, high);
      }
    };
  }

  /**
   * Finds the median of three elements (low, mid, high).
   */
  private int medianOfThree(T[] array, int low, int mid, int high) {
    T a = array[low];
    T b = array[mid];
    T c = array[high];

    if ((a.compareTo(b) <= 0 && b.compareTo(c) <= 0)
            || (c.compareTo(b) <= 0 && b.compareTo(a) <= 0)) {
      return mid;
    } else if ((b.compareTo(a) <= 0 && a.compareTo(c) <= 0)
            || (c.compareTo(a) <= 0 && a.compareTo(b) <= 0)) {
      return low;
    } else {
      return high;
    }
  }

  /**
   * Swaps two elements in the array.
   */
  private void swap(T[] array, int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

  /**
   * Enum for pivot selection strategies.
   */
  private enum PivotType {
    FIRST,
    RANDOM,
    MEDIAN_OF_THREE
  }
}
