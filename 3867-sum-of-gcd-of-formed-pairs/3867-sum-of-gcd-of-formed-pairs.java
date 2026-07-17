class Solution {
    public static int gcd(int a,int b)
    {
        while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prefixGcd[]=new int[n];
    
    int mxi=0;
        for(int i=0;i<n;i++)
        {
            mxi=Math.max(mxi,nums[i]);
            prefixGcd[i]=gcd(nums[i],mxi);
        }

        Arrays.sort(prefixGcd);
        int left=0;
        int right=n-1;
        long ans=0;
        while(left<right)
        {
            ans=ans+gcd(prefixGcd[left],prefixGcd[right]);
            left++;
            right--;

        }
        return ans;
    }
}