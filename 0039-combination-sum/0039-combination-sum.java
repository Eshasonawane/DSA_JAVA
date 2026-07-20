class Solution {
    public static void solve(int[] candidates,int target,List<List<Integer>> ans,List<Integer> output,int index)
    {
        if(target==0)
        {
            //if target becomes zero then out resu;t is ready in the output list and we have to add that result in out ans list
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>=candidates.length || target<0)
        {
                return;
        }

        int currentValue=candidates[index];
        //include
        output.add(currentValue);
        solve(candidates,target-currentValue,ans,output,index);
        output.remove(output.size()-1);
        //exclude
        solve(candidates,target,ans,output,index+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(candidates,target,ans,output,index);
        return ans;

    }
}