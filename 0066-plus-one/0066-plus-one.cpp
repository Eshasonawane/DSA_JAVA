class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n = digits.size();

        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add one
                return digits; // done, return result
            }
            digits[i] = 0; // if it's 9, set to 0 and carry to next
        }

        // If we are here, it means all were 9s → need extra 1 at front
        digits.insert(digits.begin(), 1);
        return digits;
    }
};
