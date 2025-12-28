class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;

        for(int item : arr){
            sum+=item;
        }
        if(sum%3 != 0){
            return false;
        }
        int a = sum/3;
        int count = 0;
        for(int i =0; i<arr.length;i++){
            a-= arr[i];
            if(a==0){
                count++;
                a=sum/3;
            }
        }
        return count>=3;
    }
}