package sortingalgorithm;

/**
 * Shell sort class. Sorts a generic array.
 *
 * @param <T> the type of the array to sort.
 */
public class ShellSort<T extends Comparable<T>> {

  /**
   * Shell sort algorithm. Sorts an array of generic type.
   * Time complexity of O(n^2)
   * Shell sort is an unstable sorting algorithm.
   * Shell sort is done in place.
   *
   * @param array the array to sort.
   * @return the sorted array.
   */
  public T[] shellSort(T[] array) {
    //Null array or 0 length array case.
    if (array == null) {
      return null;
    } else if (array.length == 0) {
      return array;
    }

    //Initialize gap. The sequence of numbers used as
    // a gap can be optimized for efficiency, but this
    // implementation uses n/2^k where k is the amount of passes.
    int gap = array.length / 2;


    //The gap is halved on every pass. When it reaches
    // zero the array will be sorted.
    while (gap > 0) {
      //Loop through the numbers on the right side of the gap.
      for (int i = gap; i < array.length; i++) {

        //Compare values with temp value, and insert temp
        // value once the correct location is found.
        T tempValue = array[i];
        int j = i;
        while (j >= gap && array[j - gap].compareTo(tempValue) > 0) {
          array[j] = array[j - gap];
          j -= gap;
        }
        array[j] = tempValue;
      }
      gap /= 2;
    }

    return array;
  }
}
