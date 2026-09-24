class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int ds=0;
            while(num>0){
               ds=ds+ num%10;
               num=num/10;
            }
            if(ds==i){
                return i;
            }
        }
        return-1;
    }
}