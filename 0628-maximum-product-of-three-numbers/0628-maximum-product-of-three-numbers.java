class Solution {
    public int maximumProduct(int[] nums) {
        int  min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        for(int num:nums)
        {
            if(num<min2)
            {if(num<min1)
            {
                min2=min1;
                min1=num;
            }else if(num<min2)
            {
                min2=num;
            }
            }
          if(num>max3){ if (num > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max3 = max2;
                    max2 = num;
                } else {
                    max3 = num;
                }
          }
               
        }
         int withSmallest = min1 * min2 * max1;
        int largestOnly = max1 * max2 * max3;

        return withSmallest > largestOnly ? withSmallest : largestOnly;
    }
}

    //     int n=nums.length;
    //     Arrays.sort(nums);
    //     int firstMax=nums[n-1];
    //     int  secondMax=nums[n-2];
    //    int thirdMax=nums[n-3];

    //     int  firstMin=nums[0];
    //     int secondMin=nums[1];

    //     int prod1=firstMax*secondMax*thirdMax;
    //     int prod2=firstMax*firstMin*secondMin;
    //    int  ans= Math.max(prod1,prod2);
    //     return ans;
    
