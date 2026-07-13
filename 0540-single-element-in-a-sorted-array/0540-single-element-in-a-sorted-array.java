class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (s == e) {
                return arr[s];
            }

            boolean leftSame = mid > 0 && arr[mid] == arr[mid - 1];
            boolean rightSame = mid < n - 1 && arr[mid] == arr[mid + 1];

            if (!leftSame && !rightSame) {
                return arr[mid];
            }

            if (leftSame) {
                int startingIndex = mid - 1;

                if (startingIndex % 2 == 0) {
                    //as starting index is even target exists on right side of mid
                    //target is on right side
                    s = mid + 1;
                } else {
                    //target is on left side
                    //and we know mid-1 is checked so strt from mid-2
                    e = mid - 2;
                }
            } 
            else if (rightSame) {
                int startingIndex = mid;

                if (startingIndex % 2 == 0) {
                    //as starting is even move to right side but as we know mid+1 amd mid is checked s move to mid+2
                    s = mid + 2;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }
}