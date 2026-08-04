class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        int index = 0;

        for (int i = min; i <= max; i++) {

            if (index < nums.length && nums[index] == i) {

                // Skip duplicate elements
                while (index < nums.length && nums[index] == i) {
                    index++;
                }

            } else {
                ans.add(i);
            }
        }

        return ans;
    }
}