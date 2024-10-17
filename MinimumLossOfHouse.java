import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MinimumLossOfHouse {

    public static int minmumLossOfHouse(int[] arr) {
        //Arrays.sort(arr);

        // Initialize the minimum difference to a large value
        int minDiff = Integer.MAX_VALUE;
       // {20, 8, 2, 5};
        int n = arr.length;
        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    if((arr[i] - arr[j]) > 0) {

                        minDiff = Math.min(minDiff, arr[i] - arr[j]);
                    }
                }
            }
        }

        return minDiff;

    }

    public static void main(String[] args) {
        int n = 5;
        int[] pricesOfHouse = {20, 8, 2, 5};

        System.out.println("Minimum Loss is " + minmumLossOfHouse(pricesOfHouse));




    }
}
