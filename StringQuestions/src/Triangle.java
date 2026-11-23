import com.sun.source.tree.NewArrayTree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Triangle {
    public static void main(String[] args) {
        int n=6;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < i; j++)
            { System.out.print("*");}
        }
        System.out.println(Triangle.firstUnique("wertyujhbvcdrtyujkoiuytresxdcvbjiuy"));
    }

     public static char firstUnique(String s) {
        Map<Character, Integer> mp= new LinkedHashMap<>();
        for(char c:s.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> a:mp.entrySet())
        {
            if(a.getValue()==1){
                return a.getKey();
            }

        }

        return'\0';
    }
}


