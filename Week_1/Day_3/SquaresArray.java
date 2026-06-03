import java.util.Arrays;
public class SquaresArray {
    public int[] sortedSquares(int[] nums) {

        for(int i =0; i < nums.length; i++){
            int temp = nums[i];
            nums[i] = temp*temp;
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String args[]){
        SquaresArray sa = new SquaresArray();
        int[] nums = {-4,-1,0,3,10};
        int[] result = sa.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}