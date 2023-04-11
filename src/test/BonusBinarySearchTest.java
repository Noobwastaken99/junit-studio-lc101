package test;

import main.BonusBinarySearch;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BonusBinarySearchTest {
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //Test for Bonus Binary Search
    @Test
    public void fourReturnsTrue() {
        int[] arr = new int[] {1,2,3,4,5};
        assertEquals(3, BonusBinarySearch.binarySearch(arr, 3), .01);
    }
    @Test
    public void oneReturnsTrue() {
        int[] arr = new int[] {1,2,3,4,5};
        assertEquals(1, BonusBinarySearch.binarySearch(arr, 1), .01);
    }
    @Test
    public void sixReturnsFalse() {
        int[] arr = new int[] {1,2,3,4,5};
        assertEquals(-1, BonusBinarySearch.binarySearch(arr, 6), .01);
    }
}
