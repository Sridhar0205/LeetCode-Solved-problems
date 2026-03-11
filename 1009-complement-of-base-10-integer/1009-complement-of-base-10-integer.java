class Solution {
    public int bitwiseComplement(int n) {

        int bitCount = 0;
        int temp = n;

        // Count number of bits in n
        for (; temp != 0; temp = temp >> 1) {
            bitCount++;
        }

        // Create a mask base (2^bitCount)
        int maskBase = (int) Math.pow(2, bitCount);

        // XOR with mask to flip bits
        int result = (maskBase - 1) ^ n;

        // Edge case
        if (n == 0) {
            result = 1;
        }

        return result;
    }
}