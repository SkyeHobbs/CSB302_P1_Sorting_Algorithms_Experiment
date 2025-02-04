package sortingalgorithm;

/**
 * A utility class that provides a generic method to perform selection sort on an array.
 * Selection sort has a time complexity of O(n^2)
 */
public class SelectionSort<T extends Comparable<T>> {

  /**
   * and test
   * Sorts the specified array using the selection sort algorithm. The elements in the
   * list must implement the comparable interface.
   *
   * @param array the array to be sorted
   * @throws NullPointerException if the specified list is null or contains null elements
   */
  public T[] selectionSort(T[] array) {
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
