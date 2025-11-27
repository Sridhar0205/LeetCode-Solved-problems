class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> res = new ArrayList<>();
        for(int i =0; i<m;i++){
            res.add(nums1[i]);
        }
        for(int i =0; i<n;i++){
            res.add(nums2[i]);
        }
        Collections.sort(res);
        for(int i =0; i<res.size();i++){
            nums1[i] =res.get(i);
        }
    }
}