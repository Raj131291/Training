public class SecondSmallest {
    public static void main(String[] args) {
        int[] array = {12, 3, 5, 7, 19, 3};
        int secondSmallest = findSecondSmallest(array);

        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("The second smallest element is: " + secondSmallest);
        } else {
            System.out.println("There is no second smallest element.");
        }
    }

    public static int findSecondSmallest(int[] array) {
        if (array.length < 2) {
            return Integer.MAX_VALUE; 
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }
}