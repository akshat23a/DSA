class Solution {
    public int removeDuplicates(int[] nums) {
        int officer=0;
        int  cm= 1;
        int count =1;
        while(cm<nums.length){
            if(nums[cm]==nums[cm-1]){
                cm++;
                continue;
            }nums[officer+1]=nums[cm];
            officer++;
            count++;
            cm++;

        }
        return count;
    }
}