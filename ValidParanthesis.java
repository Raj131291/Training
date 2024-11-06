public class ValidParanthesis {
    public static boolean isValidParanthesis(String input){
        int balance=0;
        for(char c: input.toCharArray()){
            if(c=='('){
                balance++;
            } else if (c==')') {
                balance--;
            }
            if(balance<0){
                return false;
            }
        }
        return balance==0;
    }
    public static void main(String[] args) {
        String a="(()())";
        boolean isValid=isValidParanthesis(a);
        System.out.println(isValid);
    }
}