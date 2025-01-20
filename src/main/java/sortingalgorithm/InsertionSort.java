package sortingalgorithm;


/**
 * Insertion sort class
 *
 * @param <T> Sorts an array of generic type.
 */
public class InsertionSort<T extends Comparable<T>> {

  /**
   * This method performs an insertion sort. The insertion sort works by separating the array into a
   * sorted and unsorted portion. Then incrementing through the unsorted portion and adding each
   * element to its correct place in the sorted portion.
   *
   * @param array The array to be sorted.
   * @return The sorted array.
   */
  public T[] insertionSort(T[] array) {
    T[] result = array; // Create a result that's a copy of the given array to return

    // Check if the given array is empty or null
    if (array == null || array.length == 0) {
      result = null;
    } else {

      // Loop through the given array starting with the second element
      // The first element is sorted
      for (int i = 1; i < array.length; i++) {
        T key = array[i]; // Save the current index element
        int j = i - 1;

        // Compare the current element to each element before it
        while (j >= 0 && array[j].compareTo(key) > 0) {
          array[j + 1] = array[j];
          j = j - 1;
        }

        // Place the current element in its sorted place
        array[j + 1] = key;
      }
    }

    return result; // Return the sorted array
  }
}
