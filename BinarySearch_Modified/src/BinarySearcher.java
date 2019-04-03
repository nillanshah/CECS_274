/**
 A class for executing binary searches in an array.
 */
public class BinarySearcher {
    /**
     Finds a value in a range of a sorted array, using the binary
     search algorithm.
     @param a the array in which to search
     @param low the low index of the range
     @param high the high index of the range
     @param value the value to find
     @return the index at which the value occurs, or -1
     if it does not occur in the array
     */
    public static int[] searchLeft(int[] a, int low, int high, int value) {
        int mid = (low + high) / 2;
        int[] range = new int[2];

        if (low <= high) {
            if ((mid == 0 || a[mid - 1] < value) && a[mid] == value){
                range[0] = mid;
                return range;
            } else if (a[mid] < value ) {
                return searchLeft(a, mid + 1, high, value);
            } else {
                return searchLeft(a, low, mid - 1, value);
            }
        } else {
            range[0] = -1;
            range[1] = mid;
            return range;
        }
    }

    public static int[] searchRight(int[] a, int low, int high, int value) {
        int mid = (low + high) / 2;
        int[] range = new int[2];

        if (low <= high) {
            if ((mid == a.length - 1 || a[mid + 1] > value) && a[mid] == value){
                range[1] = mid;
                return range;

            } else if (a[mid] > value ) {
                return searchRight(a, low, mid - 1, value);
            } else {
                return searchRight(a, mid + 1, high, value);
            }
        } else {
            range[0] = -1;
            range[1] = mid;
            return range;
        }
    }

    public static int[] firstAndLast(int[] a, int low, int high, int value){
        int[] foundLeft = BinarySearcher.searchLeft(a, low, high, value);
        int[] foundRight = BinarySearcher.searchRight(a, low, high, value);

        if (foundLeft[0] != -1) {
            foundLeft[1] = foundRight[1];
            return foundLeft;
        } else {
            return foundLeft;
        }
    }
}