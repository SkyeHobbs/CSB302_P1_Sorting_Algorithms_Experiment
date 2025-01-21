package sortingalgorithm;

/**
 * Merge sort class. Sorts an array of generic type.
 * Time complexity is O(n*log(n))
 *
 * @param <T> The type of the array to sort.
 */
public class MergeSort<T extends Comparable<T>> {
  /**
   * Public merge sort method. Uses a private method for the actual sorting.
   *
   * @param array The generic array to sort.
   * @return The sorted array.
   */
  public T[] mergeSort(T[] array) {
    //Null array or 0 length array case.
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return array;
    }
    mergeSort(array, 0, (array.length - 1) / 2, array.length - 1);
    return array;
  }

  /**
   * Private merge sort method. Divides an array recursively,
   * then merges the sub arrays together in sorted order.
   *
   * @param array The array to sort.
   * @param left Index of the left bound of the array.
   * @param mid Index of the middle of the array.
   * @param right Index of the right bound of the array.
   */
  @SuppressWarnings("unchecked")
  private void mergeSort(T[] array, int left, int mid, int right) {
    //Base case: left index is bigger than right index.
    if (left < right) {

      //Divide: divide into sub arrays.
      //The midpoint is calculated with integer division, so it is rounded down.
      mergeSort(array, left, (left + mid) / 2, mid);
      mergeSort(array, mid + 1, (mid + 1 + right) / 2, right);

      //Conquer: sort and merge sub arrays.

      //Create temporary sub arrays and copy values.
      //Can't create generic arrays directly. This is what
      // causes the unchecked cast warning.
      T[] leftArray  = (T[]) new Comparable[mid - left + 1];
      T[] rightArray = (T[]) new Comparable[right - mid];

      System.arraycopy(array, left, leftArray, 0, leftArray.length);
      for (int i = 0; i < rightArray.length; i++) {
        rightArray[i] = array[mid + 1 + i];
      }

      //Indices for the left and right sub arrays, and an
      // index tracking position to add in the parent array.
      int subArrayLeftIndex = 0;
      int subArrayRightIndex = 0;
      int mainArrayIndex = left;

      //Add items from left and right sub arrays to the main array.
      while (subArrayLeftIndex < leftArray.length && subArrayRightIndex < rightArray.length) {
        if (leftArray[subArrayLeftIndex].compareTo(rightArray[subArrayRightIndex]) <= 0) {
          array[mainArrayIndex] = leftArray[subArrayLeftIndex];
          subArrayLeftIndex++;
        } else {
          array[mainArrayIndex] = rightArray[subArrayRightIndex];
          subArrayRightIndex++;
        }
        mainArrayIndex++;
      }

      //Copy remaining elements from the sub arrays
      // if one array was larger than the other.
      while (subArrayLeftIndex < leftArray.length) {
        array[mainArrayIndex] = leftArray[subArrayLeftIndex];
        subArrayLeftIndex++;
        mainArrayIndex++;
      }
      while (subArrayRightIndex < rightArray.length) {
        array[mainArrayIndex] = rightArray[subArrayRightIndex];
        subArrayRightIndex++;
        mainArrayIndex++;
      }
    }
  }
}
