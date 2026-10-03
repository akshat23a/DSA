class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]ans=new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> st =new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int index=i%n;
           while (st.size() > 0 && st.peek() <= nums[index]){
                st.pop();
            }
            if(st.size()>0){
                ans[index]=st.peek();

            }
            st.push(nums[index]);
        }
        return ans;
    }
}