
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return result;

        int wordCount = words.length;
        int wordLength = words[0].length();
        int strLength = s.length();

        if (strLength < wordLength * wordCount) return result;
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        for (int i = 0; i < wordLength; i++) {
            int left = i;
            int right = i;
            Map<String, Integer> seenMap = new HashMap<>();

            while (right + wordLength <= strLength) {
                String word = s.substring(right, right + wordLength);
                right += wordLength;
                if (wordMap.containsKey(word)) {
                    seenMap.put(word, seenMap.getOrDefault(word, 0) + 1);
                    while (seenMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLength);
                        seenMap.put(leftWord, seenMap.get(leftWord) - 1);
                        left += wordLength;
                    }
                    if (right - left == wordLength * wordCount) {
                        result.add(left);
                    }
                } else {
                    seenMap.clear();
                    left = right;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo", "bar"};
        System.out.println(solution.findSubstring(s1, words1)); 
        String s2 = "wordgoodgoodgoodbestword";
        String[] words2 = {"word", "good", "best", "word"};
        System.out.println(solution.findSubstring(s2, words2)); 
        String s3 = "barfoofoobarthefoobarman";
        String[] words3 = {"bar", "foo", "the"};
        System.out.println(solution.findSubstring(s3, words3)); 
    }
}
