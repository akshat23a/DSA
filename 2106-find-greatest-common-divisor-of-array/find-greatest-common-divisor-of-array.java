class Solution {
    public int findGCD(int[] nums) {
         int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
       return helper( max, min);
    }
    public int helper(int a,int b){
        if(a==0 )return b;
         return helper(b%a,a);
    }
}
    
