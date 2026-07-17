class Solution {
public static void solve(int nums[],int index,List<Integer> output,List<List<Integer>> ans)
	{
		if(index>=nums.length)
		{
			ans.add(new ArrayList<>(output));
			return;
		}
		
		//solving by include exclude pattern
		int currentValue=nums[index];
		output.add(currentValue);
		solve(nums,index+1,output,ans);
		
		//remove the added the added element to write the exclude logic
		output.remove(output.size()-1);
        while(index+1<nums.length && nums[index]==nums[index+1])
        {
            index++;
        }
		solve(nums,index+1,output,ans);
		
	}
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer> output=new ArrayList<>();
		int index=0;
		solve(nums,index,output,ans);
		return ans;
    }
}