class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            int count =0; 
            for(int j =0; j<nums.length;j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            l.add(count);
        }
       for(int i=0;i<nums.length;i++){
        nums[i] = l.get(i);
       }
       
    return nums;
    }
}