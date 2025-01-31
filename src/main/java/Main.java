import arraygeneration.GenerateAllArrays;
import java.util.List;
import sortingalgorithm.*;


/**
 * Main class. Runs all sorting algorithms on test arrays
 * and displays the data in a chart.
 */
public class Main {
  /**
   * Main function which runs the sorting algorithm experiment.
   *
   * @param args command line arguments.
   */
  public static void main(String[] args) {
    //Initialize arrays.
    GenerateAllArrays<Integer> generateAllArrays = new GenerateAllArrays<>();
    List<GenerateAllArrays.ArrayInfo<Integer>> testArrays;

    //Run sorting algorithms.
    System.out.println("Running bubble sort test.");
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      bubbleSort.bubbleSort(testArrays.get(i).getArray());
    }

    System.out.println("Running bucket sort test.");
    BucketSort<Integer> bucketSort = new BucketSort<>();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      bucketSort.bucketSort(testArrays.get(i).getArray());
    }

    System.out.println("Running counting sort test.");
    CountingSort countingSort = new CountingSort();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      countingSort.countingSort(testArrays.get(i).getArray());
    }

    System.out.println("Running heap sort test.");
    HeapSort<Integer> heapSort = new HeapSort<>();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      heapSort.heapSort(testArrays.get(i).getArray());
    }

    System.out.println("Running insertion sort test.");
    InsertionSort<Integer> insertionSort = new InsertionSort<>();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      insertionSort.insertionSort(testArrays.get(i).getArray());
    }

    System.out.println("Running merge sort test.");
    MergeSort<Integer> mergeSort = new MergeSort<>();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      mergeSort.mergeSort(testArrays.get(i).getArray());
    }

    System.out.println("Running quick sort first pivot test.");
    QuickSort<Integer> quickSort = new QuickSort<>();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      quickSort.quickSortFirstPivot(testArrays.get(i).getArray());
    }
    System.out.println("Running quick sort median of three test.");
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      quickSort.quickSortMedianOfThree(testArrays.get(i).getArray());
    }
    System.out.println("Running quick sort random pivot test.");
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      quickSort.quickSortRandomPivot(testArrays.get(i).getArray());
    }

    System.out.println("Running radix sort test.");
    RadixSort radixSort = new RadixSort();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      radixSort.radixSort(testArrays.get(i).getArray());
    }

    System.out.println("Running selection sort test.");
    SelectionSort<Integer> selectionSort = new SelectionSort<>();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      selectionSort.selectionSort(testArrays.get(i).getArray());
    }

    System.out.println("Running shell sort test.");
    ShellSort<Integer> shellSort = new ShellSort<>();
    testArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < testArrays.size(); i++) {
      shellSort.shellSort(testArrays.get(i).getArray());
    }

    System.out.println("Sorting algorithm tests complete.");

  }
}
