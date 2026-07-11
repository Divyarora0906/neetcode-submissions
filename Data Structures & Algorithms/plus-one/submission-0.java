class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the digit is less than 9, increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If the digit is 9, it becomes 0 and the carry continues
            digits[i] = 0;
        }

        // If we are here, it means all digits were 9 (e.g., 999 -> 000)
        // We need an array of size n + 1 (e.g., 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}