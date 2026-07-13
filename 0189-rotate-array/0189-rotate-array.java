class Solution {
    public static void reverse(int arr[],int s,int e)
	{
		while(s<e)
		{
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}
    public void rotate(int[] arr, int k) {
        // int n=nums.length;
        // int temp[]=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     temp[(i+k)%n]=nums[i];
        // }
        // for(int i=0;i<n;i++)
        // {
        //     nums[i]=temp[i];
        // }
       int n=arr.length;
       k=k%n;
		reverse(arr,0,(n-1));
		reverse(arr,0,(k-1));
		reverse(arr,k,(n-1));
	


    }
}