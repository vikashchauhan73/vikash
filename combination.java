import java.util.*;

public class combination {

    public static void main(String[] args) {

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        combination obj = new combination();

        List<List<Integer>> ans = obj.combinationSum(candidates, target);

        System.out.println(ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void backtrack(int[] candidates,
                          int target,
                          int index,
                          List<Integer> temp,
                          List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        temp.add(candidates[index]);

        backtrack(candidates, target - candidates[index], index, temp, ans);

        temp.remove(temp.size() - 1);

        backtrack(candidates, target, index + 1, temp, ans);
    }
}