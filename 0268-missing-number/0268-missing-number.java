class Solution {
    public int missingNumber(int[] nums) {
    int n = nums.length;
    Arrays.sort(nums);
    int out = n;
    for(int i =0; i<n;i++){
        if(i != nums[i]){
            out = i;
            break;
        }
    }
    return out;
    }
}