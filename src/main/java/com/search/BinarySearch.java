package src.main.java.com.search;

/**
 * Binary search is an algorithm which finds the position of a target value within a sorted array
 * <p>
 * Worst-case performance	O(log n)
 * Best-case performance	O(1)
 * Average performance	O(log n)
 * Worst-case space complexity	O(1)
 */
public final class BinarySearch {

    /**
     * @param array is an array where the element should be found
     * @param key   is an element which should be found
     * @param <T>   is any comparable type
     * @return index of the element
     */
    public static <T extends Comparable<T>> int findIndex(T[] array, T key) {
        return search(array, key, 0, array.length - 1);
    }

    /**
     * @param array The array to search
     * @param key   The element you are looking for
     * @param left  The lower bound
     * @param right The  upper bound
     * @return the location of the key
     **/
    private static <T extends Comparable<T>> int search(T[] array, T key, int left, int right) {
        if (left > right) {
            return -1; // Key not found
        }

        // Find median
        int median = left + (right - left) / 2;
        int comp = key.compareTo(array[median]);

        if (comp < 0) {
            return search(array, key, left, median - 1);
        }

        if (comp > 0) {
            return search(array, key, median + 1, right);
        }

        return median;
    }
}
