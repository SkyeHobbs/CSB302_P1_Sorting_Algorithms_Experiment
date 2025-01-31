import arraygeneration.GenerateAllArrays;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import sortingalgorithm.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    List<GenerateAllArrays.ArrayInfo<Integer>> listOfArrays;

    //Run sorting algorithms.
    BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      bubbleSort.bubbleSort(listOfArrays.get(i).getArray());
    }

    BucketSort<Integer> bucketSort = new BucketSort<>();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      bucketSort.bucketSort(listOfArrays.get(i).getArray());
    }

    CountingSort countingSort = new CountingSort();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      countingSort.countingSort(listOfArrays.get(i).getArray());
    }

    HeapSort<Integer> heapSort = new HeapSort<>();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      heapSort.heapSort(listOfArrays.get(i).getArray());
    }

    InsertionSort<Integer> insertionSort = new InsertionSort<>();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      insertionSort.insertionSort(listOfArrays.get(i).getArray());
    }
    MergeSort<Integer> mergeSort = new MergeSort<>();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      mergeSort.mergeSort(listOfArrays.get(i).getArray());
    }

    QuickSort<Integer> quickSort = new QuickSort<>();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      quickSort.quickSortFirstPivot(listOfArrays.get(i).getArray());
    }
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      quickSort.quickSortMedianOfThree(listOfArrays.get(i).getArray());
    }
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      quickSort.quickSortRandomPivot(listOfArrays.get(i).getArray());
    }

    RadixSort radixSort = new RadixSort();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      radixSort.radixSort(listOfArrays.get(i).getArray());
    }

    SelectionSort<Integer> selectionSort = new SelectionSort<>();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      selectionSort.selectionSort(listOfArrays.get(i).getArray());
    }

    ShellSort<Integer> shellSort = new ShellSort<>();
    listOfArrays = generateAllArrays.generateAllArrays();
    for (int i = 0; i < listOfArrays.size(); i++) {
      shellSort.shellSort(listOfArrays.get(i).getArray());
    }

    //JFreeChart jFreeChart = new JFreeChart(Plot)


  }
}
