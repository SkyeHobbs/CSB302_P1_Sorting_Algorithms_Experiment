package sortingalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BucketSortTest {

    @Test
    public void testBucketSortIntegers() {
        Integer[] array = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        Integer[] sortedArray = { 1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9 };
        assertArrayEquals(sortedArray, BucketSort.bucketSort(array));
    }

    @Test
    public void testBucketSortStrings() {
        String[] array = { "banana", "apple", "cherry", "date" };
        String[] sortedArray = { "apple", "banana", "cherry", "date" };
        assertArrayEquals(sortedArray, BucketSort.bucketSort(array));
    }

    @Test
    public void testBucketSortEmptyArray() {
        Integer[] array = {};
        Integer[] sortedArray = {};
        assertArrayEquals(sortedArray, BucketSort.bucketSort(array));
    }
}