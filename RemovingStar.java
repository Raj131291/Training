public class RemovingStar {

    public static String removeStar(String s) {
        StringBuffer sb = new StringBuffer();
        for( Character ch : s.toCharArray() ) {
            if( ch == '*' ) {
                if(sb.length() > 0) {
                    sb.deleteCharAt(sb.length()-1);
                }
            }else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input1 = "leet**cod*e";
        String input2 = "erase*****";
        System.out.println(" Result of the input1: " + " ' " + removeStar(input1) + " ' ");
        System.out.println(" Result of the input2: "  + " ' " + removeStar(input2) + " ' ");
    }
}
