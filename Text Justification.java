
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int currentLineLength = 0;
        
        for (String word : words) {
            if (currentLineLength + currentLine.size() + word.length() > maxWidth) {
                result.add(justifyLine(currentLine, currentLineLength, maxWidth));
                currentLine = new ArrayList<>();
                currentLineLength = 0;
            }
            currentLine.add(word);
            currentLineLength += word.length();
        }
        
        StringBuilder lastLine = new StringBuilder();
        for (int i = 0; i < currentLine.size(); i++) {
            lastLine.append(currentLine.get(i));
            if (i < currentLine.size() - 1) {
                lastLine.append(' ');
            }
        }
        while (lastLine.length() < maxWidth) {
            lastLine.append(' ');
        }
        result.add(lastLine.toString());
        
        return result;
    }

    private String justifyLine(List<String> words, int currentLineLength, int maxWidth) {
        if (words.size() == 1) {
            StringBuilder sb = new StringBuilder(words.get(0));
            while (sb.length() < maxWidth) {
                sb.append(' ');
            }
            return sb.toString();
        }
        int totalSpaces = maxWidth - currentLineLength;
        int spacesBetweenWords = totalSpaces / (words.size() - 1);
        int extraSpaces = totalSpaces % (words.size() - 1);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i < words.size() - 1) {
                // Add the spaces between words
                int spaces = spacesBetweenWords + (i < extraSpaces ? 1 : 0);
                for (int j = 0; j < spaces; j++) {
                    sb.append(' ');
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words1 = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth1 = 16;
        System.out.println(solution.fullJustify(words1, maxWidth1));

        String[] words2 = {"What","must","be","acknowledgment","shall","be"};
        int maxWidth2 = 16;
        System.out.println(solution.fullJustify(words2, maxWidth2));

        String[] words3 = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        int maxWidth3 = 20;
        System.out.println(solution.fullJustify(words3, maxWidth3));
    }
}
