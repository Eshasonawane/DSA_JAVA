class Solution {
    public void sortColors(int[] arr) {
        int s=0;
    		int mid=0;
    		int e=arr.length-1;
    		while(mid<=e)
    		{
    			if(arr[mid]==0)
    			{
    				int temp=arr[s];
    				arr[s]=arr[mid];
    				arr[mid]=temp;
    				
    				s++;
    				mid++;
    			}
    			else if(arr[mid]==1)
    			{
    				mid++;
    			}
    			else
    			{
    				int temp=arr[e];
    				arr[e]=arr[mid];
    				arr[mid]=temp;	
    				e--;
    			}
    		}
    	
    }
}