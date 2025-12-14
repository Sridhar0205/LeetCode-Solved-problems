class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenind = 0;
        int oddind = 1;
        int res[] = new int[nums.length];
        for(int i =0 ; i<nums.length;i++){
            if(nums[i]%2 == 0){
                res[evenind] = nums[i];
                evenind+=2;
            }else{
                res[oddind] = nums[i];
                oddind+=2;
            }
        }
        return res;
    }
}