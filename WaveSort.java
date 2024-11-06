import java.util.Arrays;

public class WaveSort {
    public static void waveSort(int[] arr) {
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};

        System.out.println("Original Array: " + Arrays.toString(arr));
        
        waveSort(arr);
        
        System.out.println("Wave Sorted Array: " + Arrays.toString(arr));
    }
}