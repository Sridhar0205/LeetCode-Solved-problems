class Solution {
    public int sumBase(int n, int k) {
        int c = Integer.parseInt(Integer.toString(n, k));
        int sum = 0;
        while(c > 0){
            sum = sum + (c%10); 
            c /= 10;
        }
        return sum;
    }
}