import java.util.*;

public class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());
            anagramMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs1));
        String[] strs2 = {""};
        System.out.println(groupAnagrams(strs2));
        String[] strs3 = {"a"};
        System.out.println(groupAnagrams(strs3));
        
    }
}
