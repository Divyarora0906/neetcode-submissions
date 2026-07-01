

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();
        
        // Continue looping until we reach 1 or hit a cycle
        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = getNext(n);
        }
        
        return n == 1;
    }
    
    // Helper function to calculate the sum of the squares of digits
    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;
            totalSum += digit * digit;
            n /= 10;
        }
        return totalSum;
    }
}