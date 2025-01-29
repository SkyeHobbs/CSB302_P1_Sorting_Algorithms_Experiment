package sortingalgorithm;

import java.util.ArrayList;

/**
 * A utility class that provides a generic method to perform selection sort on an {@link ArrayList}.
 */
public class SelectionSort {

  /** and test
   * Sorts the specified {@link ArrayList} using the selection sort algorithm. The elements in the
   * list must implement the {@link Comparable} interface.
   *
   * @param <T>   the type of elements in the list, which must implement {@link Comparable}
   * @param array the {@link ArrayList} to be sorted
   * @throws NullPointerException if the specified list is null or contains null elements
   */
  public static <T extends Comparable<T>> T[] selectionSort(T[] array) {
    for (int i = 0; i < array.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j].compareTo(array[minIndex]) < 0) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        T temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }
    }
    return array;
  }
}
