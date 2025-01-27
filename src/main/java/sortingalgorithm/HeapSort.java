package sortingalgorithm;

/**
 * HeapSort class that implements the heap sort algorithm.
 * This class sorts an array of elements that extend Comparable.
 *
 * @param <T> The type of elements to be sorted, extending Comparable.
 */
public class HeapSort<T extends Comparable<T>> {

  /**
   * Sorts the given array using the heap sort algorithm and returns a new sorted array.
   *
   * @param array The array to be sorted.
   * @return A new array containing the sorted elements.
   */
  public T[] heapSort(T[] array) {
    T[] sortedArray = array.clone();
    int n = sortedArray.length;

    // Build the max heap.
    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(sortedArray, n, i);
    }

    for (int i = n - 1; i > 0; i--) {
      swap(sortedArray, 0, i);
      heapify(sortedArray, i, 0);
    }

    return sortedArray;
  }

  /**
   * Maintains the heap property for a subtree rooted at the given index.
   *
   * @param array The array representing the heap.
   * @param size  The size of the heap.
   * @param root  The index of the root of the subtree.
   */
  private void heapify(T[] array, int size, int root) {
    int largest = root;
    int left = 2 * root + 1;
    int right = 2 * root + 2;

    // Check if the left child is larger than the root.
    if (left < size && array[left].compareTo(array[largest]) > 0) {
      largest = left;
    }

    // Check if the right child is larger than the largest
    if (right < size && array[right].compareTo(array[largest]) > 0) {
      largest = right;
    }

    // If the largest is not the root, swap and continue heapify.
    if (largest != root) {
      swap(array, root, largest);
      heapify(array, size, largest);
    }
  }

  /**
   * Swaps two elements in the given array.
   *
   * @param array The array containing the elements to swap.
   * @param i     The index of the first element.
   * @param j     The index of the second element.
   */
  private void swap(T[] array, int i, int j) {
    T temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

}
