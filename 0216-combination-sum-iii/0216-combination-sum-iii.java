class Solution {
    public static void solve(int arr[],int target,int index,List<List<Integer>>ans ,List<Integer> output,int k,int count)
    {
        if(count==k && target == 0)
        {
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>= arr.length || target<0 || count>k)
        {
            return ;
        }

        //include
        int currentValue=arr[index];
        output.add(currentValue);
        solve(arr,target-currentValue,index+1,ans,output,k,count+1);

        while(index+1<arr.length && arr[index]==arr[index+1])
        {
            index++;
        }
        output.remove(output.size()-1);

        solve(arr,target,index+1,ans,output,k,count);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
      int arr[]={1,2,3,4,5,6,7,8,9};
      int target=n;
      int index=0;
      int count=0;
       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> output=new ArrayList<>();
       solve(arr,target,index,ans,output,k,count);
       return ans; 
    }
}