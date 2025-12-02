class Solution {
    public int[] shuffle(int[] nums, int n) {
      List<Integer> l1 = new ArrayList<>();
      List<Integer> l2 = new ArrayList<>();
      List<Integer> res = new ArrayList<>();
      for(int i =0; i<n ;i++){
        l1.add(nums[i]);
      }
      for(int i =n;i<nums.length;i++){
        l2.add(nums[i]);
      }
      int size = Math.max(l1.size(),l2.size());
      for(int i =0; i<size;i++){
        if(i<l1.size()){
            res.add(l1.get(i));
        }
        if(i<l2.size()){
            res.add(l2.get(i));
        }
      }
      for(int i =0; i<res.size();i++){
        nums[i] = res.get(i);
      }
      return nums;
    }
}