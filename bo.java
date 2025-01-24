public class bo {
    public static int binarySearch(int[] arr, int key) {
        int l= 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;
        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Nahi hae bbahii");
        } else {
            System.out.println("Aree mill gayyaa " + result);
        }
    }
}