class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(int i=0;i<n.length();i++){
            int temp=(int)n.charAt(i) -'0';
            ans=Math.max(temp,ans);
            
        }
        return ans;
    }
}