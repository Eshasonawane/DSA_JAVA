class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer>map =new HashMap<>();

        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Set<Integer> seen = new HashSet<>();
        boolean uniqueOccur=true;
        for(Integer value:map.values())
        {
            if(!seen.add(value))
            {
                uniqueOccur=false;
                break;
            }
        }
        return uniqueOccur;

    }
}