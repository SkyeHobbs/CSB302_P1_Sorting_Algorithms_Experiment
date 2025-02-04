import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * Class responsible for measuring the runtime of sort functions.
 */
public class Timer {
  ArrayList<SortData> runtimeData;

  /**
   * Timer constructor initializing the runtimeData.
   */
  public Timer() {
    runtimeData = new ArrayList<>();
  }

  /**
   * Measures the time it takes for a given sort function to sort a given array in milliseconds.
   *
   * @param array            given array to be sorted.
   * @param sortFunction     given sort function to be measured.
   * @param sortFunctionName name of the given sort function.
   * @param arrayType        type of the given array.
   * @param arrayLength      length of the given array
   * @return long the time it takes for the array to be sorted
   *     by the given sort function in milliseconds.
   */
  public long measureSortTime(Integer[] array, Consumer<Integer[]> sortFunction,
                              String sortFunctionName, String arrayType, int arrayLength) {
    // Copy the array to avoid editing the given array
    Integer[] arrCopy = Arrays.copyOf(array, array.length);

    // Measure the runtime of the given method in nanoseconds
    long startTime = System.nanoTime();
    sortFunction.accept(arrCopy);
    long endTime = System.nanoTime();

    // Convert the runtime from nanoseconds to milliseconds
    long runTime = (endTime - startTime) / 1000;

    // Create a SortData object with the given data
    // Add it to the runtimeData
    SortData sortData = new SortData(sortFunctionName, arrayType, arrayLength, runTime);
    runtimeData.add(sortData);

    return runTime; // Return the runTime
  }

  /**
   * Getter method for runtimeData.
   *
   * @return ArrayList of SortData.
   */
  public ArrayList<SortData> getRuntimeData() {
    return runtimeData;
  }

  /**
   * Inner class to hold sorted data's information.
   */
  public static class SortData {
    String algorithm;
    String arrayType;
    int arrayLength;
    long runtime;

    /**
     * SortData constructor initializing the SortData Object.
     */
    public SortData(String algorithm, String arrayType, int arrayLength, long runtime) {
      this.algorithm = algorithm;
      this.arrayType = arrayType;
      this.arrayLength = arrayLength;
      this.runtime = runtime;
    }

    public String getAlgorithm() {
      return algorithm;
    }

    public String getArrayType() {
      return arrayType;
    }

    public int getArrayLength() {
      return arrayLength;
    }

    public long getRuntime() {
      return runtime;
    }

    @Override
    public String toString() {
      return "SortData{" + "algorithm='" + algorithm + '\'' + ", arrayType='"
              + arrayType + '\'' + ", arrayLength=" + arrayLength + ", runtime=" + runtime + '}';
    }

    /**
     * Returns the data as a CSV formatted string.
     *
     * @return the array info in CSV format.
     */
    public String toCsv() {
      return algorithm + "," + arrayType + "," + arrayLength + "," + runtime;
    }
  }
}

