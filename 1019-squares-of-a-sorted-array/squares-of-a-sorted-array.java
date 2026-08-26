

class Solution {
    public int[] sortedSquares(int[] nums) {

        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();

        // Separate negative and positive numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                neg.add(nums[i]);
            } else {
                pos.add(nums[i]);
            }
        }

        // Square negative numbers
        for (int i = 0; i < neg.size(); i++) {
            neg.set(i, neg.get(i) * neg.get(i));
        }

        // Reverse negative array
        Collections.reverse(neg);

        // Square positive numbers
        for (int i = 0; i < pos.size(); i++) {
            pos.set(i, pos.get(i) * pos.get(i));
        }

        // Result array
        int[] res = new int[nums.length];

        int i = 0;
        int j = 0;
        int id = 0;

        // Merge neg and pos
        while (i < neg.size() && j < pos.size()) {

            if (neg.get(i) <= pos.get(j)) {
                res[id] = neg.get(i);
                i++;
            } else {
                res[id] = pos.get(j);
                j++;
            }

            id++;
        }

        // Remaining elements from neg
        while (i < neg.size()) {
            res[id] = neg.get(i);
            i++;
            id++;
        }

        // Remaining elements from pos
        while (j < pos.size()) {
            res[id] = pos.get(j);
            j++;
            id++;
        }

        return res;
    }
}