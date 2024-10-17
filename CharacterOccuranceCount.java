import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccuranceCount {

    public static String occurance(String st)
     {
         LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
         char[] ch = st.toCharArray();

         for ( char c : ch)
         {
             if(map.containsKey(c))
             {
                 int count = map.get(c);
                 map.put(c , ++count);
             }
             else
             {
                 map.put(c , 1);
             }
         }
         StringBuffer sb = new StringBuffer();
         for(Map.Entry<Character, Integer> entry : map.entrySet())
         {
             sb.append(entry.getKey()).append(entry.getValue());
         }
         return sb.toString();
     }

    public static void main( String[] args)
    {
        String str = "aabbbycyyc";

        System.out.println(occurance(str));

    }
}
