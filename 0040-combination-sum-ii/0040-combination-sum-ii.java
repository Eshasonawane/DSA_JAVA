class Solution {
    public static void solve (int []candidates,int target, List<List<Integer>> ans,List<Integer> output,int index)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>=candidates.length || target<0)
        {
            return;
        }
        //include
        int currentValue=candidates[index];
        output.add(currentValue);
        solve(candidates,target-currentValue,ans,output,index+1);
        //exclude
        output.remove(output.size()-1);
        while(index+1<candidates.length && candidates[index]==candidates[index+1])
        {
            index++;
        }
        solve(candidates,target,ans,output,index+1);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(candidates,target,ans,output,index);
        return ans;
    }
}