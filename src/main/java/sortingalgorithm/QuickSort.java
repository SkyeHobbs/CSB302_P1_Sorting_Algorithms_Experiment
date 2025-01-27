package sortingalgorithm;

import java.util.Random;

/**
 * QuickSort class implementing different pivot selection strategies.
 *
 * @param <T> The type of elements to be sorted, extending Comparable.
 */
public class QuickSort<T extends Comparable<T>> {
  public T[] quickSortFirstPivot(T[] array) {
    quickSort(array, 0, array.length - 1, PivotType.FIRST);
    return array;
  }

  /**
   * Sorts the array using QuickSort with a random element as the pivot.
   *
   * @param array The array to be sorted.
   * @return The sorted array.
   */
  public T[] quickSortRandomPivot(T[] array) {
    quickSort(array, 0, array.length - 1, PivotType.RANDOM);
    return array;
  }

  /**
   * Sorts the array using QuickSort with the median of three elements as the pivot.
   *
   * @param array The array to be sorted.
   * @return The sorted array.
   */
  public T[] quickSortMedianOfThree(T[] array) {
    quickSort(array, 0, array.length - 1, PivotType.MEDIAN_OF_THREE);
    return array;
  }

  /**
   * The main QuickSort logic that works with the specified pivot type.
   */
  private void quickSort(T[] array, int low, int high, PivotType pivotType) {
    if (low < high) {
      int pivotIndex = partition(array, low, high, pivotType);
      quickSort(array, low, pivotIndex - 1, pivotType);
      quickSort(array, pivotIndex + 1, high, pivotType);
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
    switch (pivotType) {
      case FIRST:
        return low;
      case RANDOM:
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
      case MEDIAN_OF_THREE:
        int mid = low + (high - low) / 2;
        return medianOfThree(array, low, mid, high);
      default:
        throw new IllegalArgumentException("Invalid Pivot Type");
    }
  }

  /**
   * Finds the median of three elements (low, mid, high).
   */
  private int medianOfThree(T[] array, int low, int mid, int high) {
    T a = array[low];
    T b = array[mid];
    T c = array[high];

    if ((a.compareTo(b) <= 0 && b.compareTo(c) <= 0) || (c.compareTo(b) <= 0 && b.compareTo(a) <= 0)) {
      return mid;
    } else if ((b.compareTo(a) <= 0 && a.compareTo(c) <= 0) || (c.compareTo(a) <= 0 && a.compareTo(b) <= 0)) {
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
