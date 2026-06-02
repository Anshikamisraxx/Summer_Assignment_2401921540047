package Week_1.Day_1;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> visitedNumbers = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int neededComplement = target - currentNum;
            
            if (visitedNumbers.containsKey(neededComplement)) {
                return new int[] { visitedNumbers.get(neededComplement), i };
            }
            
            visitedNumbers.put(currentNum, i);
        }
        
        return new int[] {};
    }
    
    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        
        // Test inputs
        int[] testNumbers = {2, 7, 11, 15};
        int testTarget = 9;
        
        // Execute logic
        int[] result = solver.twoSum(testNumbers, testTarget);
        
        // Print output to terminal
        System.out.println("Resulting Indices: [" + result[0] + ", " + result[1] + "]");
    }
}