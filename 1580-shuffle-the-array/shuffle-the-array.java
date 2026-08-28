class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []shuff=new int[nums.length];
        for(int i=0;i<n;i++){
            shuff[2*i]=nums[i];
            shuff[2*i+1]=nums[n+i];
        }
        return shuff;
    }
}