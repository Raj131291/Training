import java.util.ArrayDeque;
import java.util.Deque;

public class SlidindWindow {

    public static int[] getMaximum(int[] input int k)
    {
        Deque<Integer> canditates = new ArrayDeque<>();
        int[] ans = new int[input.length - k + 1];
        int currentIndex = 0;
        for (int i; i < input.length; i++)
        {
            if(!canditates.isEmpty() && canditates.peek() == i-k)
            {
                canditates.poll();
            }

            while(!canditates.isEmpty() && canditates.peekLast() < input[i])
            {
                canditates.pollLast();
            }

            canditates.offer(i);

            if(i >= k-1)
            {
                ans[currentIndex] = input[canditates.peek()];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] b = new int[]{5, 8, 50, 4};
        int K2 = 8;
        Systemn.out.println(getMaximum(b , k2));
    }
}
