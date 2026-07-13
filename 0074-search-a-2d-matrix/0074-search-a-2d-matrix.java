class Solution {
    public boolean searchMatrix(int[][] arr, int k) {
        int totalRow=arr.length;
		int totalCol=arr[0].length;
		
		int n=totalRow*totalCol;
		
		int s=0;
		int e=n-1;
		
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			
			int rowIndex=mid/totalCol;
			int colIndex=mid%totalCol;
			
			if(arr[rowIndex][colIndex]==k)
			{
				return true;
			}
			else if(arr[rowIndex][colIndex]<k)
			{
				s=mid+1;
			}
			else
			{
				e=mid-1;
			}
		}
		return false;
    }
}