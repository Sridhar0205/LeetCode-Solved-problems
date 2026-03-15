class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
       int rev =0;
       if(x<0){
        return false;
       } 
       while(x!=0){
        int m = x%10;
        rev = rev*10+m;
        x/=10;
       }
       if(y==rev){
        return true;
    }else{
        return false;
    }
    }
}