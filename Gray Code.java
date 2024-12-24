
import java.util.*;

public class Solution {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 0; i < n; i++) {
            int size = result.size();
            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j) | (1 << i)); 
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        int n = 2; 
        List<Integer> grayCodeSequence = grayCode(n);
        System.out.println(grayCodeSequence);
    }
}
