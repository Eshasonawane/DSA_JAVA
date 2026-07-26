class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int firstMax=nums[n-1];
        int  secondMax=nums[n-2];
       int thirdMax=nums[n-3];

        int  firstMin=nums[0];
        int secondMin=nums[1];

        int prod1=firstMax*secondMax*thirdMax;
        int prod2=firstMax*firstMin*secondMin;
       int  ans= Math.max(prod1,prod2);
        return ans;
    }
}