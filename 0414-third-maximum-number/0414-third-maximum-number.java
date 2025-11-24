class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> a = new HashSet<>();
            for(int b : nums){
                a.add(b);
            }
        if(a.size()<3){
       Collections.max(a);
    }else{
       a.remove(Collections.max(a));
       a.remove(Collections.max(a));
    }
      return  Collections.max(a);
    }
}