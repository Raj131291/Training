public class MissingInteger {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6}; 
        int missingNumber = findMissingNumber(array);
        System.out.println("The missing integer is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array) {      
 	int actualSum = 0;        
	int expectedSum = n * (n + 1) / 2;
	int n=array.length+1;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}