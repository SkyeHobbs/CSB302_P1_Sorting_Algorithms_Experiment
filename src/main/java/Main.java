import arraygeneration.GenerateAllArrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
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
  public static void main(String[] args) throws FileNotFoundException {
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
    DefaultCategoryDataset bubbleSortDataset = new DefaultCategoryDataset();
    for (int i = 0; i < bubbleSortTimer.runtimeData.size(); i++) {
      Timer.SortData data = bubbleSortTimer.runtimeData.get(i);
      bubbleSortDataset.addValue(data.runtime, data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Running bucket sort test.");
    BucketSort<Integer> bucketSort = new BucketSort<>();
    Timer bucketSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      bucketSortTimer.measureSortTime(testArray.getArray(), bucketSort::bucketSort,
              "Bucket Sort", testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset bucketSortDataset = new DefaultCategoryDataset();
    for (int i = 0; i < bucketSortTimer.runtimeData.size(); i++) {
      Timer.SortData data = bucketSortTimer.runtimeData.get(i);
      bucketSortDataset.addValue(data.runtime, data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Running counting sort test.");
    CountingSort countingSort = new CountingSort();
    Timer countingSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      countingSortTimer.measureSortTime(testArray.getArray(), countingSort::countingSort,
              "Counting Sort", testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset countingSortDataset = new DefaultCategoryDataset();
    for (int i = 0; i < countingSortTimer.runtimeData.size(); i++) {
      Timer.SortData data = countingSortTimer.runtimeData.get(i);
      countingSortDataset.addValue(data.runtime, data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Running heap sort test.");
    HeapSort<Integer> heapSort = new HeapSort<>();
    Timer heapSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      heapSortTimer.measureSortTime(testArray.getArray(), heapSort::heapSort,
              "Heap Sort", testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset heapSortDataset = new DefaultCategoryDataset();
    for (int i = 0; i < heapSortTimer.runtimeData.size(); i++) {
      Timer.SortData data = heapSortTimer.runtimeData.get(i);
      heapSortDataset.addValue(data.runtime, data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Running insertion sort test.");
    InsertionSort<Integer> insertionSort = new InsertionSort<>();
    Timer insertionSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      insertionSortTimer.measureSortTime(testArray.getArray(), insertionSort::insertionSort,
              "Insertion Sort", testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset insertionSortDataset = new DefaultCategoryDataset();
    for (int i = 0; i < insertionSortTimer.runtimeData.size(); i++) {
      Timer.SortData data = insertionSortTimer.runtimeData.get(i);
      insertionSortDataset.addValue(data.runtime, data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Running merge sort test.");
    MergeSort<Integer> mergeSort = new MergeSort<>();
    Timer mergeSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      mergeSortTimer.measureSortTime(testArray.getArray(), mergeSort::mergeSort,
              "Merge Sort", testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset mergeSortDataset = new DefaultCategoryDataset();
    for (int i = 0; i < mergeSortTimer.runtimeData.size(); i++) {
      Timer.SortData data = mergeSortTimer.runtimeData.get(i);
      mergeSortDataset.addValue(data.runtime, data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Running quick sort first pivot test.");
    QuickSort<Integer> quickSort = new QuickSort<>();
    Timer quickSortFirstPivotTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      quickSortFirstPivotTimer.measureSortTime(testArray.getArray(), quickSort::quickSortFirstPivot,
              "Quick Sort First Pivot", testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset quickSortFirstPivotDataset = new DefaultCategoryDataset();
    for (int i = 0; i < quickSortFirstPivotTimer.runtimeData.size(); i++) {
      Timer.SortData data = quickSortFirstPivotTimer.runtimeData.get(i);
      quickSortFirstPivotDataset.addValue(data.runtime,
              data.arrayType, String.valueOf(data.arrayLength));
    }
    System.out.println("Running quick sort median of three test.");
    Timer quickSortMedianOfThreeTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      quickSortMedianOfThreeTimer.measureSortTime(testArray.getArray(),
              quickSort::quickSortMedianOfThree, "Quick Sort Median Of Three",
              testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset quickSortMedianOfThreeDataset = new DefaultCategoryDataset();
    for (int i = 0; i < quickSortMedianOfThreeTimer.runtimeData.size(); i++) {
      Timer.SortData data = quickSortMedianOfThreeTimer.runtimeData.get(i);
      quickSortMedianOfThreeDataset.addValue(data.runtime,
              data.arrayType, String.valueOf(data.arrayLength));
    }
    System.out.println("Running quick sort random pivot test.");
    Timer quickSortRandomPivotTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      quickSortRandomPivotTimer.measureSortTime(testArray.getArray(),
              quickSort::quickSortRandomPivot, "Quick Sort Random Pivot",
              testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset quickSortRandomPivotDataset = new DefaultCategoryDataset();
    for (int i = 0; i < quickSortRandomPivotTimer.runtimeData.size(); i++) {
      Timer.SortData data = quickSortRandomPivotTimer.runtimeData.get(i);
      quickSortRandomPivotDataset.addValue(data.runtime,
              data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Running radix sort test.");
    RadixSort radixSort = new RadixSort();
    Timer radixSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      radixSortTimer.measureSortTime(testArray.getArray(), radixSort::radixSort,
              "Radix Sort", testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset radixSortDataset = new DefaultCategoryDataset();
    for (int i = 0; i < radixSortTimer.runtimeData.size(); i++) {
      Timer.SortData data = radixSortTimer.runtimeData.get(i);
      radixSortDataset.addValue(data.runtime, data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Running selection sort test.");
    SelectionSort<Integer> selectionSort = new SelectionSort<>();
    Timer selectionSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      selectionSortTimer.measureSortTime(testArray.getArray(), selectionSort::selectionSort,
              "Selection Sort", testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset selectionSortDataset = new DefaultCategoryDataset();
    for (int i = 0; i < selectionSortTimer.runtimeData.size(); i++) {
      Timer.SortData data = selectionSortTimer.runtimeData.get(i);
      selectionSortDataset.addValue(data.runtime, data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Running shell sort test.");
    ShellSort<Integer> shellSort = new ShellSort<>();
    Timer shellSortTimer = new Timer();
    testArrays = generateAllArrays.generateAllArrays();
    for (GenerateAllArrays.ArrayInfo<Integer> testArray : testArrays) {
      shellSortTimer.measureSortTime(testArray.getArray(), shellSort::shellSort,
              "Shell Sort", testArray.getArrayType(), testArray.getArrayLength());
    }
    DefaultCategoryDataset shellSortDataset = new DefaultCategoryDataset();
    for (int i = 0; i < shellSortTimer.runtimeData.size(); i++) {
      Timer.SortData data = shellSortTimer.runtimeData.get(i);
      shellSortDataset.addValue(data.runtime, data.arrayType, String.valueOf(data.arrayLength));
    }

    System.out.println("Sorting algorithm tests complete.");

    //Output data to charts
    System.out.println("Exporting charts.");
    JFreeChart bubbleSortChart = ChartFactory.createLineChart(
            "Bubble Sort", "Array size", "Time in microseconds", bubbleSortDataset);
    File bubbleSortChartFile = new File("Chart_BubbleSort.png");

    JFreeChart bucketSortChart = ChartFactory.createLineChart(
            "Bucket Sort", "Array size", "Time in microseconds", bucketSortDataset);
    File bucketSortChartFile = new File("Chart_BucketSort.png");

    JFreeChart countingSortChart = ChartFactory.createLineChart(
            "Counting Sort", "Array size", "Time in microseconds", countingSortDataset);
    File countingSortChartFile = new File("Chart_CountingSort.png");

    JFreeChart heapSortChart = ChartFactory.createLineChart(
            "Heap Sort", "Array size", "Time in microseconds", heapSortDataset);
    File heapSortChartFile = new File("Chart_HeapSort.png");

    JFreeChart insertionSortChart = ChartFactory.createLineChart(
            "Insertion Sort", "Array size", "Time in microseconds", insertionSortDataset);
    File insertionSortChartFile = new File("Chart_InsertionSort.png");

    JFreeChart mergeSortChart = ChartFactory.createLineChart(
            "Merge Sort", "Array size", "Time in microseconds", mergeSortDataset);
    File mergeSortChartFile = new File("Chart_MergeSort.png");

    JFreeChart quickSortFirstPivotChart = ChartFactory.createLineChart(
            "Quick Sort (First pivot)", "Array size",
            "Time in microseconds", quickSortFirstPivotDataset);
    File quickSortFirstPivotChartFile = new File("Chart_QuickSortFirstPivot.png");

    JFreeChart quickSortMedianOfThreeChart = ChartFactory.createLineChart(
            "Quick Sort (Median of three)", "Array size",
            "Time in microseconds", quickSortMedianOfThreeDataset);
    File quickSortMedianOfThreeChartFile = new File("Chart_QuickSortMedianOfThree.png");

    JFreeChart quickSortRandomPivotChart = ChartFactory.createLineChart(
            "Quick Sort (Random pivot)", "Array size",
            "Time in microseconds", quickSortRandomPivotDataset);
    File quickSortRandomPivotChartFile = new File("Chart_QuickSortRandomPivot.png");

    JFreeChart radixSortChart = ChartFactory.createLineChart(
            "Radix Sort", "Array size", "Time in microseconds", radixSortDataset);
    File radixSortChartFile = new File("Chart_RadixSort.png");

    JFreeChart selectionSortChart = ChartFactory.createLineChart(
            "Selection Sort", "Array size", "Time in microseconds", selectionSortDataset);
    File selectionSortChartFile = new File("Chart_SelectionSort.png");

    JFreeChart shellSortChart = ChartFactory.createLineChart(
            "Shell Sort", "Array size", "Time in microseconds", shellSortDataset);
    File shellSortChartFile = new File("Chart_ShellSort.png");

    try {
      ChartUtilities.saveChartAsPNG(bubbleSortChartFile, bubbleSortChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(bucketSortChartFile, bucketSortChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(countingSortChartFile, countingSortChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(heapSortChartFile, heapSortChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(insertionSortChartFile, insertionSortChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(mergeSortChartFile, mergeSortChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(quickSortFirstPivotChartFile,
              quickSortFirstPivotChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(quickSortMedianOfThreeChartFile,
              quickSortMedianOfThreeChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(quickSortRandomPivotChartFile,
              quickSortRandomPivotChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(radixSortChartFile, radixSortChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(selectionSortChartFile, selectionSortChart, 1000, 500);
      ChartUtilities.saveChartAsPNG(shellSortChartFile, shellSortChart, 1000, 500);
      System.out.println("Exporting charts complete.");
    } catch (Exception e) {
      throw new FileNotFoundException("Could not output chart as PNG.");
    }
  }
}

