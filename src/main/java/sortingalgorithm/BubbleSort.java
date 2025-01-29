package sortingalgorithm;

import java.util.ArrayList;

/**
 * A utility class that provides a generic method to perform bubble sort on an {@link ArrayList}.
 */
public class BubbleSort {
  /**
   * Sorts the specified {@link ArrayList} using the bubble sort algorithm. The elements in the list
   * must implement the {@link Comparable} interface.
   *
   * @param <T>   the type of elements in the list, which must implement {@link Comparable}
   * @param array the {@link ArrayList} to be sorted
   * @throws NullPointerException if the specified list is null or contains null elements
   */
  public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> array) {
    int n = array.size();
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (array.get(j).compareTo(array.get(j + 1)) > 0) {
          // Swap array[j] and array[j+1]
          T temp = array.get(j);
          array.set(j, array.get(j + 1));
          array.set(j + 1, temp);
          swapped = true;
        }
      }
      // If no two elements were swapped, break the loop
      if (!swapped) {
        break;
      }
    }
  }
}