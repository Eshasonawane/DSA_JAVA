class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        //marking
        for(int i=0;i<nums.length;i++)
        {
            int value = Math.abs(nums[i]);
            int position = value-1;
            if(nums[position]>0)
            {
                nums[position]=-nums[position];
            }

        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                result.add(i+1);
            }
        }
        return result;
    }
}