import java.util.Arrays;

public class SubStringOcuurance {
    //"Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.
    //
    //Example:
    //String[] dict = {""CODGE"", ""ODG"", ""LODGES"", ""SODG"", ""dodge"", ""mODJ"", ""LODGESSSS""}
    //String toSearch = ""ODG"";
    //
    ////Returns 9 (LODGESSSS)"
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodget", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        int maxLength = Arrays.stream(dict).filter(word -> word.toLowerCase().contains(toSearch.toLowerCase()))
                .mapToInt(String::length).max().orElse(0);

        System.out.println(maxLength);
        int result = 0;
        for(String ch : dict )
        {
            if((ch.toLowerCase()).contains(toSearch.toLowerCase()))
            {
               result = Math.max(result, ch.length());
            }
        }
        System.out.println("*******" + result);


    }
}
