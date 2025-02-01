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
    Timer bubbleSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      bubbleSortTimer.measureSortTime(testArray.getArray(), bubbleSort::bubbleSort,
              "Bubble Sort", testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Running bucket sort test.");
    BucketSort<Integer> bucketSort = new BucketSort<>();
    Timer bucketSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      bucketSortTimer.measureSortTime(testArray.getArray(), bucketSort::bucketSort,
              "Bucket Sort", testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Running counting sort test.");
    CountingSort countingSort = new CountingSort();
    Timer countingSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      countingSortTimer.measureSortTime(testArray.getArray(), countingSort::countingSort,
              "Counting Sort", testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Running heap sort test.");
    HeapSort<Integer> heapSort = new HeapSort<>();
    Timer heapSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      heapSortTimer.measureSortTime(testArray.getArray(), heapSort::heapSort,
              "Heap Sort", testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Running insertion sort test.");
    InsertionSort<Integer> insertionSort = new InsertionSort<>();
    Timer insertionSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      insertionSortTimer.measureSortTime(testArray.getArray(), insertionSort::insertionSort,
              "Insertion Sort", testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Running merge sort test.");
    MergeSort<Integer> mergeSort = new MergeSort<>();
    Timer mergeSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      mergeSortTimer.measureSortTime(testArray.getArray(), mergeSort::mergeSort,
              "Merge Sort", testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Running quick sort first pivot test.");
    QuickSort<Integer> quickSort = new QuickSort<>();
    Timer quickSortFirstPivotTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      quickSortFirstPivotTimer.measureSortTime(testArray.getArray(), quickSort::quickSortFirstPivot,
              "Quick Sort First Pivot", testArray.getArrayType(), testArray.getArrayLength());
    }
    System.out.println("Running quick sort median of three test.");
    Timer quickSortMedianOfThreeTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      quickSortMedianOfThreeTimer.measureSortTime(testArray.getArray(),
              quickSort::quickSortMedianOfThree, "Quick Sort Median Of Three",
              testArray.getArrayType(), testArray.getArrayLength());
    }
    System.out.println("Running quick sort random pivot test.");
    Timer quickSortRandomPivotTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      quickSortRandomPivotTimer.measureSortTime(testArray.getArray(),
              quickSort::quickSortRandomPivot, "Quick Sort Random Pivot",
              testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Running radix sort test.");
    RadixSort radixSort = new RadixSort();
    Timer radixSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      radixSortTimer.measureSortTime(testArray.getArray(), radixSort::radixSort,
              "Radix Sort", testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Running selection sort test.");
    SelectionSort<Integer> selectionSort = new SelectionSort<>();
    Timer selectionSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      selectionSortTimer.measureSortTime(testArray.getArray(), selectionSort::selectionSort,
              "Selection Sort", testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Running shell sort test.");
    ShellSort<Integer> shellSort = new ShellSort<>();
    Timer shellSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      shellSortTimer.measureSortTime(testArray.getArray(), shellSort::shellSort,
              "Shell Sort", testArray.getArrayType(), testArray.getArrayLength());
    }

    System.out.println("Sorting algorithm tests complete.");

  }
}
