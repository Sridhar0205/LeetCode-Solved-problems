class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long l=1;
        long r=0;
        for(int i:workerTimes)
       {
         r=Math.max(i,r);
       }
        r= r * (long)mountainHeight * (mountainHeight + 1) / 2;
        long result=-1;
        while(l<=r){
           long mid=l+(r-l)/2;
            if(check(workerTimes,mountainHeight,mid)){
                result=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return result;
    }
        public boolean check(int[] workerTimes,int mountainHeight,long mid){
            long height=0;
            for(int i:workerTimes){
                long x = (long)((-1 + (Math.sqrt(1 + (8.0 * mid) / i))) / 2);
                height+=x;
            }
            return height>=mountainHeight;
        }
    
}