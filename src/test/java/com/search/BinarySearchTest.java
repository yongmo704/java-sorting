package src.test.java.com.search;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.com.search.BinarySearch;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        Integer[] arr1 = {1,2,3,4,5};
        Assert.assertEquals("Incorrect index", 2, BinarySearch.findIndex(arr1,3));
        Assert.assertEquals("Incorrect index", 0, BinarySearch.findIndex(arr1,1));
        Assert.assertEquals("Incorrect index", -1, BinarySearch.findIndex(arr1,8));
        Assert.assertEquals("Incorrect index", -1, BinarySearch.findIndex(arr1,-2));

        String[] arr2 = {"A", "B", "C", "D"};
        Assert.assertEquals("Incorrect index", 2, BinarySearch.findIndex(arr2,"C"));
        Assert.assertEquals("Incorrect index", 1, BinarySearch.findIndex(arr2,"B"));
        Assert.assertEquals("Incorrect index", -1, BinarySearch.findIndex(arr2,"F"));

        String[] arr3 = {};
        Assert.assertEquals("Incorrect index", -1, BinarySearch.findIndex(arr3, ""));
    }
}
