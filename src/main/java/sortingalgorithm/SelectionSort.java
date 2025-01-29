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
  public static <T extends Comparable<T>> void selectionSort(ArrayList<T> array) {
    for (int i = 0; i < array.size(); i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.size(); j++) {
        if (array.get(j).compareTo(array.get(minIndex)) < 0) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        T temp = array.get(i);
        array.set(i, array.get(minIndex));
        array.set(minIndex, temp);
      }
    }
  }
}
