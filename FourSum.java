import java.util.*;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                for (int k = j + 1; k < n - 1; k++) {

                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }

                    for (int l = k + 1; l < n; l++) {

                        if (l > k + 1 && nums[l] == nums[l - 1]) {
                            continue;
                        }

                        long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                        if (sum == target) {
                            ans.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[k],
                                nums[l]
                            ));
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        System.out.println(result);
    }
}