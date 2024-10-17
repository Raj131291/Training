public class ReverseNumbersDivisibleByThree {
    public static void main(String[] args) {
        String input = "12345632189";
        System.out.println(reverseNumbersDivByThree(input));
    }

    public static String reverseNumbersDivByThree(String input) {
        StringBuffer inputNumber = new StringBuffer(input);
        StringBuffer reversedNumbersByThree = new StringBuffer();

        for(char c : input.toCharArray()) {
            int number = Integer.parseInt(String.valueOf(c));
            if(number % 3 == 0) {
                reversedNumbersByThree.append(number);
            }
        }
        reversedNumbersByThree.reverse();
        int pos =0;
        for(int i =0 ; i < inputNumber.length() ; i++) {
            int resultNumber = Character.getNumericValue(inputNumber.charAt(i));
            if(resultNumber % 3 == 0) {
                inputNumber.setCharAt(i, reversedNumbersByThree.charAt(pos));
                pos++;
            }
        }

        return inputNumber.toString();
    }
}
