class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans =0;
        int l =0;
        Set<Character> hs = new HashSet<>();
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            if(!hs.contains(ch)){
                hs.add(ch);
            }else{
                while(hs.contains(ch)){
                    hs.remove(s.charAt(l));
                    l++;
                    
                }
                hs.add(ch);
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
        
    }
}
