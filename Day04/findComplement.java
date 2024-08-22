class Solution {
    public int findComplement(int num) {
        int total = 0;
        int base = 0;
        while (num > 0) {
            int rightMostBit = num & 1;
            total += (rightMostBit ^ 1) * Math.pow(2, base);
            num >>= 1;
            base++;
        }
        return total;
    }
}
