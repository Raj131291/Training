import java.util.HashMap;

public class ShortestSubarrayWithSum {
        public static int findShortestSubArray(int[] a, int K)
        {
            int start = 0;
            int current_sum = 0;
            int min_length = Integer.MAX_VALUE;
            int min_sum = Integer.MAX_VALUE;

            // int[] a = {2, 4, 6, 10, 2, 1};
            for (int i = 0; i < a.length; i++)
            {
                current_sum += a[i];
                while (current_sum >= K)
                {
                    int current_length = i - start + 1;
                    if (current_length < min_length)
                    {
                        min_length = current_length;  // 3 , 3 , 3 , 3
                        min_sum = current_sum;      //12 , 20 , 24 , 25
                    }
                    current_sum -= a[start];  //10 ,18 , 18 , 15
                    start++;  // 1  , 2 ,3  , 4
                }
            }
            boolean returnSum;
            if (min_length == 1)
            {
                returnSum = true;
            }else
            {
                returnSum = false;
            }
            if (min_length == Integer.MAX_VALUE)
            {
                return -1;
            }
            return returnSum ? min_sum : min_length;
        }
        public static void main(String[] args) {
            int[] a = {2, 4, 6, 10, 2, 1};
            int[] b = {5, 8, 50, 4};
            int K1 = 12;
            int K2 = 8;

            System.out.println(findShortestSubArray(a, K1));
            System.out.println(findShortestSubArray(b, K2));
        }
    }
