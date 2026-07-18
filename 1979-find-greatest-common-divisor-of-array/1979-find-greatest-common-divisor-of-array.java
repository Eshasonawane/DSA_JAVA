class Solution {
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
        int temp=b;
        b=a%b;
        a=temp;
        
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<mini)
            {
                mini=nums[i];
            }
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i]>maxi)
            {
                maxi=nums[i];
            }
        }
        return gcd(mini,maxi);

    }
}