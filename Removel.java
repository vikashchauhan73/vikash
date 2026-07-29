import java.util.Arrays;

public class Removel {

    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        Removel obj = new Removel();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = obj.removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
    }
}