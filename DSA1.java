// Search in sorted Roted Array 
public class DSA1 {
    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 1, 2, 3 };

        int key = 4;
        int low = 0;
        int high = arr.length - 1;
        int value = -1;
        int mid = 0;
        while (low <= high) {

            mid = (low + high) / 2;

            if (arr[mid] == key) {
                value = mid;
                break;
            }

            if (arr[low] < arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        if (value >= 0) {
            System.out.println("key is found at index" + mid);
        } else {
            System.out.println("key is not found");
        }
    }
}