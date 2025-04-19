package stringProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFreqCharByHashMap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = s.nextLine();

        char result = maxfreqCharHashmapFun(input);
        System.out.println("Character with maximum frequency: " + result);

        s.close();
    }

    public static char maxfreqCharHashmapFun(String str){
        HashMap<Character, Integer> hm = new HashMap<>();


        char[] c = str.toCharArray();
        for (char ch:c){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
        }

        int maxCount = 0;
        char maxFreq = ' ';
        for (Map.Entry<Character,Integer> me: hm.entrySet()){
            if(maxCount < me.getValue()){
                maxCount = me.getValue();
                maxFreq = me.getKey();

            }

        }

        return maxFreq;
    }
}
