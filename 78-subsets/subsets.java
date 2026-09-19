import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        subsequence(new ArrayList<>(), nums, 0, ans);

        return ans;
    }

    static void subsequence(List<Integer> p, int[] nums, int index,
                            List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(p));
            return;
        }

        // Take the current element
        p.add(nums[index]);
        subsequence(p, nums, index + 1, ans);

        // Don't take the current element
        p.remove(p.size() - 1);
        subsequence(p, nums, index + 1, ans);
    }
}