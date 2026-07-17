class Solution {

    public static void solve (int[]nums,int index,List<Integer> output,List<List<Integer>> ans)
    {
        if(index>=nums.length)
        {
            //our subset is ready then store it;
         ans.add(new ArrayList<>(output));
         return;
        }

        int currentValue=nums[index];
        //using include exclude
        output.add(currentValue);
        solve(nums,index+1,output,ans);
        //remove the included element
        output.remove(output.size()-1);
        solve(nums,index+1,output,ans);
    }
    //backtracking and recursion
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans =new ArrayList<>();
        List<Integer>output = new ArrayList<>();
        int index=0;
         solve(nums,index,output,ans);
         return ans;
    }
}