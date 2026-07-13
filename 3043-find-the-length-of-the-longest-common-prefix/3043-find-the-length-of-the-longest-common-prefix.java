class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
     Set<Integer> set1 = new HashSet<>();
    for(int num:arr1)
    {
        while(num>0)
        {
            set1.add(num);
            num=num/10;
        }
        
    }
    int ans=0;
    for(int num:arr2)
    {
        while(num>0)
        {
            if(set1.contains(num))
            {
                ans=Math.max(ans,String.valueOf(num).length());

            }
            num=num/10;
        }
    }
    return ans;

    }
}