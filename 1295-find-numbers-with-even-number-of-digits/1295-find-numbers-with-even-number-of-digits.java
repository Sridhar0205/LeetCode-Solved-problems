class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
     for(int i =0; i<nums.length;i++){
        int m =0;
        m= m+nums[i];
        int digits =0;
        while(m!=0){
            int s = 0;
            s= (s*10)+(m%10);
            m/=10;
            digits +=1;
        }
        if(digits%2==0){
            count+=1;
        }  
    }
    return count;
    }
}