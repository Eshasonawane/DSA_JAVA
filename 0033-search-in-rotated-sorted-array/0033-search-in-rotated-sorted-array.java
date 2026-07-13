class Solution {
    public static int getMaxElement(int arr[])
	{
		int n=arr.length;
		int s=0;
		int e=n-1;
		int ans=-1;
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			if(arr[mid]>arr[n-1])
			{
				ans=mid;
				s=mid+1;
			}
			else
			{
				e=mid-1;
			}
		}
		return ans;
	}
	public static int binarySearch(int start,int end,int arr[],int target)
	{
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]>target)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			
		}
		return -1;
	}
	public static int search(int[] arr, int target) {
        int n=arr.length;
        int maxElement = getMaxElement(arr);
        if(target>=arr[maxElement+1] && target<=arr[n-1])
        {
        	return binarySearch(maxElement+1, n-1, arr, target);
        }
        else
        {
        	return binarySearch(0, maxElement, arr, target);
        }
    
    }
}