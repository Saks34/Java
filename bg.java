import java.util.Scanner;

public class bg {
    public static int[] insertion(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length-1; i++) { 
            for (int j = i+1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) { 
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break; 
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] arr = new int[a];

        System.out.println("\n");
        for (int i = 0; i < a; i++) {
            arr[i] = s.nextInt();
        }

        int[] sortedArray = insertion(arr);

        System.out.println("\n");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
