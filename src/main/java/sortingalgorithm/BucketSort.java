package sortingalgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A utility class that provides a generic Bucket Sort algorithm.
 */
public class BucketSort {

  /**
   * Sorts the given array using the Bucket Sort algorithm.
   *
   * @param <T>   the type of elements in the array, must extend Comparable
   * @param array the array to be sorted
   * @return the sorted array
   */
  public static <T extends Comparable<T>> T[] bucketSort(T[] array) {
    if (array == null || array.length == 0) {
      return array;
    }

    // Determine the number of buckets
    int numberOfBuckets = array.length;
    List<List<T>> buckets = new ArrayList<>(numberOfBuckets);

    // Initialize buckets
    for (int i = 0; i < numberOfBuckets; i++) {
      buckets.add(new ArrayList<>());
    }

    // Find the minimum and maximum values in the array
    T minValue = array[0];
    T maxValue = array[0];
    for (T value : array) {
      if (value.compareTo(minValue) < 0) {
        minValue = value;
      }
      if (value.compareTo(maxValue) > 0) {
        maxValue = value;
      }
    }

    // Distribute the elements into the buckets
    for (T value : array) {
      int bucketIndex = (int) ((value.compareTo(minValue)) * (numberOfBuckets - 1) / (maxValue.compareTo(minValue)));
      buckets.get(bucketIndex).add(value);
    }

    // Sort each bucket and concatenate the results
    int index = 0;
    for (List<T> bucket : buckets) {
      Collections.sort(bucket);
      for (T value : bucket) {
        array[index++] = value;
      }
    }

    return array;
  }
}