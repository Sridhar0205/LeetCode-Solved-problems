class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> l = new HashSet<>();
        for(int num : nums){
            if(!l.add(num)){
                return true;
            }
        }
        return false;
    }
}