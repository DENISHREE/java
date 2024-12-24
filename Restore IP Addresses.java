
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return result; 
        }
        
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(String s, int start, List<String> currentSegments, List<String> result) {
        if (currentSegments.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", currentSegments));
            }
            return;
        }
        for (int len = 1; len <= 3; len++) {
      if (start + len > s.length()) break;
            
            String segment = s.substring(start, start + len);
            if (isValid(segment)) {
                currentSegments.add(segment); 
                backtrack(s, start + len, currentSegments, result); 
                currentSegments.remove(currentSegments.size() - 1); 
            }
        }
    }
    private boolean isValid(String segment) {
        if (segment.length() > 3 || segment.length() == 0) return false;
        if (segment.charAt(0) == '0' && segment.length() > 1) return false; 
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }
}
