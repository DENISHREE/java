public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 
        int[] prefixSum = calculatePrefixSum(array);
        System.out.print("Prefix Sum: ");
        for (int value : prefixSum) {
            System.out.print(value + " ");
        }
    }

    public static int[] calculatePrefixSum(int[] array) {
        int n = array.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = array[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        return prefixSum;
    }
}
