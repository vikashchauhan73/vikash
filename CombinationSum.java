import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int[] candidates,
                          int target,
                          int start,
                          List<Integer> temp,
                          List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            temp.add(candidates[i]);

            backtrack(candidates, target - candidates[i], i + 1, temp, ans);

            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] candidates = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            candidates[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        CombinationSum obj = new CombinationSum();

        List<List<Integer>> result = obj.combinationSum2(candidates, target);

        System.out.println(result);

        sc.close();
    }
}