package sortingalgorithm;

/**
 * Counting sort class. Sorts an integer array.
 */
public class CountingSort {

  /**
   * Counting sort algorithm which sorts an integer array.
   * This algorithm relies on the properties of integers and as
   * such can't be used on arrays of other types.
   * Counting sort does not work with negative integers and will
   * throw an ArrayIndexOutOfBoundsException.
   * Time complexity of O(n + m) where m is the max value in the input array.
   * Counting sort is a stable sorting algorithm.
   * Counting sort is not done in place.
   *
   * @param array the integer array to be sorted.
   * @return the sorted array.
   */
  public Integer[] countingSort(Integer[] array) {
    //Empty and null array cases.
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return array;
    }

    //Find the max value in the array.
    //O(n)
    int maxValue = array[0];
    for (int i : array) {
      if (maxValue <= i) {
        maxValue = i;
      }
    }

    //Store the frequency of numbers in an array.
    //The index represents the number in the original array.
    //The value represents the occurrences of the number in the original array.
    //O(n)
    Integer[] freqArray = new Integer[maxValue + 1];
    for (int i : array) {
      freqArray[i]++;
    }

    //Calculate the cumulative sum of the array of frequencies.
    //The cumulative sum for one array element is the current
    // value plus the previous value.
    //O(m), where m is the max value

    for (int i = 1; i < freqArray.length; i++) {
      freqArray[i] = freqArray[i - 1] + freqArray[i];
    }

    //Iterate backwards through the input array.
    // The value in the input array goes in the output array
    // based on the value in the frequency array minus one
    // that corresponds with the index that is equal to the original value.
    // Then decrement the index in the frequency array that was accessed.
    //O(n)

    Integer[] sortedArray = new Integer[array.length];
    for (int i = array.length - 1; i >= 0; i--) {
      sortedArray[freqArray[array[i]] - 1] = array[i];
      freqArray[array[i]]--;
    }

    return sortedArray;
  }
}
