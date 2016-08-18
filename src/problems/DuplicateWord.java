package problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String st1 = st.toLowerCase();
        String string2[] = st1.split("[(' '), .-]");
        HashMap<String, Integer> uniques = new HashMap<String, Integer>();
        for (String word : string2) {
            if (word.length() <= 0) {
                continue;
            }
            Integer existingCount = uniques.get(word);
            uniques.put(word, (existingCount == null ? 1 : (existingCount + 1)));

        }
        Set<Map.Entry<String, Integer>> uniqueSet = uniques.entrySet();
        for (Map.Entry<String, Integer> entry : uniqueSet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}