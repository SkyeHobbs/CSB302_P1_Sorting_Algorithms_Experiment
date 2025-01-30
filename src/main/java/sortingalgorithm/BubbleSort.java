package sortingalgorithm;

/**
 * A utility class that provides a generic method to perform bubble sort on an array.
 * Bubble sort has a time complexity of O(n^2)
 */
public class BubbleSort<T extends Comparable<T>> {
  /**
   * Sorts the specified array using the bubble sort algorithm. The elements in the list
   * must implement the Comparable interface.
   *
   * @param array the  to be sorted
   * @throws NullPointerException if the specified list is null or contains null elements
   */
  public T[] bubbleSort(T[] array) {
    int n = array.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j].compareTo(array[j + 1]) > 0) {
          // Swap array[j] and array[j+1]
          T temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }
      // If no two elements were swapped, break the loop
      if (!swapped) {
        break;
      }
    }
    return array;
  }
}