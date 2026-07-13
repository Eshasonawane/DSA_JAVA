class Solution {
    public int maxSubArray(int[] arr) {
      int currentSum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			currentSum+=arr[i];
			maxSum=Math.max(maxSum, currentSum);
			if(currentSum<0)
			{
				currentSum=0;
			}
		}
		return maxSum;

    }
}