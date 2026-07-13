class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        TreeSet<Integer> set = new TreeSet<>();

        for (int value : arr) {
            set.add(value);
        }

        Map<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;

        for (int value : set) {
            rankMap.put(value, rank++);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}