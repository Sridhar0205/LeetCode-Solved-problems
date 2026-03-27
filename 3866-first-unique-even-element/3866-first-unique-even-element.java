class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap <Integer,Integer> m = new HashMap<>();
        for(int a :nums ){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        for(int i =0;i<nums.length;i++){
            if(m.get(nums[i])==1 && nums[i]%2 == 0){
                return nums[i];
            }
        }
        return -1;
    }
}