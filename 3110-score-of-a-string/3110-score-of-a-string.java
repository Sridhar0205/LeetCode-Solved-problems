class Solution {
    public int scoreOfString(String s) {
        int n =0;
      List<Character> l1 = new ArrayList<>();
      for(char ch : s.toCharArray()){
        l1.add(ch);
      }  
      for(char i =0; i<l1.size()-1;i++){
        n += Math.abs(l1.get(i)-l1.get(i+1));
           
      }
      return n;
    }
}