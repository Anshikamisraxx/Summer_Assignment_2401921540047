public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // Fill remaining with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }

        System.out.println("After moving zeroes: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        MoveZeroes obj = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before moving zeroes: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        obj.moveZeroes(nums);
    }
}